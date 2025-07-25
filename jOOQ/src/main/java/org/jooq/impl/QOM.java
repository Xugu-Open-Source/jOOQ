package org.jooq.impl;


import org.jetbrains.annotations.ApiStatus.Experimental;
import org.jetbrains.annotations.NotNull;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Function0;
import org.jooq.QueryPart;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Experimental
public final class QOM {

    public interface Level extends UOperator0<Level>, Field<Integer> {
    }

    public interface CompareCondition<T, R extends CompareCondition<T, R>> extends Condition, UOperator2<Field<T>, Field<T>, R> {

    }

    static interface UOperator<R extends QueryPart> extends QueryPart {
        @NotNull
        List<?> $args();
    }

    static interface UOperator0<R extends UOperator0<R>> extends UOperator<R> {
        @NotNull
        Function0<? extends R> $constructor();

        @NotNull
        default List<?> $args() {
            return Collections.emptyList();
        }

/*        default <T> T $traverse(Traverser<?, T> traverser) {
            return QOM.traverse(traverser, this, new Object[0]);
        }

        @NotNull
        default QueryPart $replace(Replacer replacer) {
            return QOM.replace(this, (Function0)

                    $constructor(), replacer);
        }*/
    }

    static interface UOperator1<Q1, R extends UOperator1<Q1, R>> extends UOperator<R> {
        Q1 $arg1();

/*        @NotNull
        default R $arg1(Q1 newArg1) {
            return (R)$constructor().apply(newArg1);
        }*/

/*        @NotNull
        Function1<? super Q1, ? extends R> $constructor();*/

        @NotNull
        default List<?> $args() {
            return Collections.unmodifiableList(Arrays.asList(new Object[] { $arg1() }));
        }

/*        default <T> T $traverse(Traverser<?, T> traverser) {
            return QOM.traverse(traverser, this, new Object[] { $arg1() });
        }*/

/*        @NotNull
        default QueryPart $replace(Replacer replacer) {
            return QOM.replace(this,

                    $arg1(), (Function1)
                            $constructor(), replacer);
        }*/
    }

    static interface UOperator2<Q1, Q2, R extends UOperator2<Q1, Q2, R>> extends UOperator<R> {
        Q1 $arg1();

        Q2 $arg2();

/*        @NotNull
        default R $arg1(Q1 newArg1) {
            return (R)$constructor().apply(newArg1, $arg2());
        }*/

/*        @NotNull
        default R $arg2(Q2 newArg2) {
            return (R)$constructor().apply($arg1(), newArg2);
        }*/

/*        @NotNull
        Function2<? super Q1, ? super Q2, ? extends R> $constructor();*/

        @NotNull
        default List<?> $args() {
            return Collections.unmodifiableList(Arrays.asList(new Object[] { $arg1(), $arg2() }));
        }

  /*      default <T> T $traverse(Traverser<?, T> traverser) {
            return QOM.traverse(traverser, this, new Object[] { $arg1(), $arg2() });
        }*/

/*        @NotNull
        default QueryPart $replace(Replacer replacer) {
            return QOM.replace(this,

                    $arg1(),
                    $arg2(), (Function2)
                            $constructor(), replacer);
        }*/
    }

    static interface UOperator3<Q1, Q2, Q3, R extends UOperator3<Q1, Q2, Q3, R>> extends UOperator<R> {
        Q1 $arg1();

        Q2 $arg2();

        Q3 $arg3();

        // @NotNull
        // default R $arg1(Q1 newArg1) {
        //     return (R)$constructor().apply(newArg1, $arg2(), $arg3());
        // }

  /*      @NotNull
        default R $arg2(Q2 newArg2) {
            return (R)$constructor().apply($arg1(), newArg2, $arg3());
        }*/

 /*       @NotNull
        default R $arg3(Q3 newArg3) {
            return (R)$constructor().apply($arg1(), $arg2(), newArg3);
        }*/

/*        @NotNull
        Function3<? super Q1, ? super Q2, ? super Q3, ? extends R> $constructor();*/

        @NotNull
        default List<?> $args() {
            return Collections.unmodifiableList(Arrays.asList(new Object[] { $arg1(), $arg2(), $arg3() }));
        }

        // default <T> T $traverse(Traverser<?, T> traverser) {
        //     return QOM.traverse(traverser, this, new Object[] { $arg1(), $arg2(), $arg3() });
        // }

/*        @NotNull
        default QueryPart $replace(Replacer replacer) {
            return QOM.replace(this,

                    $arg1(),
                    $arg2(),
                    $arg3(), (Function3)
                            $constructor(), replacer);
        }*/
    }

    static interface UOperator4<Q1, Q2, Q3, Q4, R extends UOperator4<Q1, Q2, Q3, Q4, R>> extends UOperator<R> {
        Q1 $arg1();

        Q2 $arg2();

        Q3 $arg3();

        Q4 $arg4();

/*        @NotNull
        default R $arg1(Q1 newArg1) {
            return (R)$constructor().apply(newArg1, $arg2(), $arg3(), $arg4());
        }*/

/*        @NotNull
        default R $arg2(Q2 newArg2) {
            return (R)$constructor().apply($arg1(), newArg2, $arg3(), $arg4());
        }*/

/*        @NotNull
        default R $arg3(Q3 newArg3) {
            return (R)$constructor().apply($arg1(), $arg2(), newArg3, $arg4());
        }*/

  /*      @NotNull
        default R $arg4(Q4 newArg4) {
            return (R)$constructor().apply($arg1(), $arg2(), $arg3(), newArg4);
        }*/

/*        @NotNull
        Function4<? super Q1, ? super Q2, ? super Q3, ? super Q4, ? extends R> $constructor();*/

        @NotNull
        default List<?> $args() {
            return Collections.unmodifiableList(Arrays.asList(new Object[] { $arg1(), $arg2(), $arg3(), $arg4() }));
        }

/*        default <T> T $traverse(Traverser<?, T> traverser) {
            return QOM.traverse(traverser, this, new Object[] { $arg1(), $arg2(), $arg3(), $arg4() });
        }*/

/*        @NotNull
        default QueryPart $replace(Replacer replacer) {
            return QOM.replace(this,

                    $arg1(),
                    $arg2(),
                    $arg3(),
                    $arg4(), (Function4)
                            $constructor(), replacer);
        }*/
    }

    public interface Rownum extends UOperator0<Rownum>, Field<Integer> {
    }

    public static interface SysConnectByPath extends UOperator2<Field<?>, String, SysConnectByPath>, Field<String> {
        @NotNull
        default Field<?> $field() {
            return $arg1();
        }

/*        @NotNull
        default SysConnectByPath $field(Field<?> newField) {
            return $arg1(newField);
        }*/

        @NotNull
        default String $separator() {
            return $arg2();
        }

/*        @NotNull
        default SysConnectByPath $separator(String newSeparator) {
            return $arg2(newSeparator);
        }*/
    }

    static interface UEmpty extends QueryPart {
/*        default <R> R $traverse(Traverser<?, R> traverser) {
            return QOM.traverse(traverser, this, new Object[0]);
        }

        default QueryPart $replace(Replacer replacer) {
            if (replacer.recurse().test(this))
                return replacer.replacer().apply(this);
            return this;
        }*/
    }

    static interface UEmptyField<T> extends Field<T>, UEmpty {}
}
