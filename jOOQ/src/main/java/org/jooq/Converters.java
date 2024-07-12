/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

import static org.jooq.tools.Convert.convertArray;

import java.lang.reflect.Array;

import org.jooq.impl.AbstractConverter;
import org.jooq.impl.IdentityConverter;
import org.jooq.impl.SQLDataType;
import org.jetbrains.annotations.NotNull;

/**
 * A chain of converters.
 *
 * @param <T> The database type - i.e. any type available from
 *            {@link SQLDataType}
 * @param <U> The user type
 * @author Lukas Eder
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class Converters<T, U> extends AbstractConverter<T, U> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -4307758248063822630L;

    final Converter[] chain;

    /**
     * Create an identity converter.
     */
    @NotNull
    public static <T> Converter<T, T> identity(final Class<T> type) {
        return new IdentityConverter<T>(type);
    }

    /**
     * Create an identity converter.
     *
     * @deprecated - [#10689] - 3.14.0 - This converter does not work. Do not
     *             use this method, use {@link #identity(Class)} instead.
     */
    @Deprecated
    @NotNull
    public static <T, U> Converter<T, U> of() {
        return new Converters();
    }

    /**
     * Create a single converter.
     *
     * @deprecated - [#10689] - 3.14.0 - This method does not provide any useful
     *             functionality and will be removed in the future.
     */
    @Deprecated
    @NotNull
    public static <T, U> Converter<T, U> of(Converter<T, U> converter) {
        return new Converters(converter);
    }

    /**
     * Chain two converters.
     */
    @NotNull
    public static <T, X1, U> Converter<T, U> of(Converter<T, ? extends X1> c1, Converter<? super X1, U> c2) {
        return new Converters(c1, c2);
    }

    /**
     * Chain three converters.
     */
    @NotNull
    public static <T, X1, X2, U> Converter<T, U> of(Converter<T, ? extends X1> c1, Converter<? super X1, ? extends X2> c2, Converter<? super X2, U> c3) {
        return new Converters(c1, c2, c3);
    }

    /**
     * Chain four converters.
     */
    @NotNull
    public static <T, X1, X2, X3, U> Converter<T, U> of(Converter<T, ? extends X1> c1, Converter<? super X1, ? extends X2> c2, Converter<? super X2, ? extends X3> c3, Converter<? super X3, U> c4) {
        return new Converters(c1, c2, c3, c4);
    }

    /**
     * Inverse a converter.
     */
    public static <T, U> Converter<U, T> inverse(final Converter<T, U> converter) {
        
    	// [#11099] Allow instanceof checks on IdentityConverter for performance reasons
    	if (converter instanceof IdentityConverter)
            return (Converter<U, T>) converter;
        else
            return new AbstractConverter<U, T>(converter.toType(), converter.fromType()) {

                /**
                 * Generated UID
                 */
                private static final long serialVersionUID = -4307758248063822630L;

                @Override
                public T from(U u) {
                    return converter.to(u);
                }

                @Override
                public U to(T t) {
                    return converter.from(t);
                }

                @Override
                public String toString() {
                    return "InverseConverter [ " + fromType().getName() + " -> " + toType().getName() + " ]";
                }
            };
    }

    public static <T, U> Converter<T[], U[]> forArrays(final Converter<T, U> converter) {
        return new AbstractConverter<T[], U[]>(
            (Class<T[]>) Array.newInstance(converter.fromType(), 0).getClass(),
            (Class<U[]>) Array.newInstance(converter.toType(), 0).getClass()
        ) {

            /**
             * Generated UID
             */
            private static final long     serialVersionUID = -4307758248063822630L;
            private final Converter<U, T> inverse          = Converters.inverse(converter);

            @Override
            public U[] from(T[] t) {
                return convertArray(t, converter);
            }

            @Override
            public T[] to(U[] u) {
                return convertArray(u, inverse);
            }
        };
    }

    Converters(Converter... chain) {
        super(chain[0].fromType(), chain[chain.length - 1].toType());

        this.chain = chain;
    }

    @Override
    public final U from(T t) {
        Object result = t;

        for (int i = 0; i < chain.length; i++)
            result = chain[i].from(result);

        return (U) result;
    }

    @Override
    public final T to(U u) {
        Object result = u;

        for (int i = chain.length - 1; i >= 0; i--)
            result = chain[i].to(result);

        return (T) result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String separator = " -> ";

        sb.append("Converters [ ");
        sb.append(fromType().getName());

        for (Converter<?, ?> converter : chain) {
            sb.append(separator);
            sb.append(converter.toType().getName());
        }

        sb.append(" ]");
        return sb.toString();
    }
}
