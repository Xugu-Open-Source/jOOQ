/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
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
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.test.all;

import java.beans.ConstructorProperties;
import java.util.Date;

import javax.persistence.Column;

/**
 * @author Lukas Eder
 */
public class ImmutableAuthorWithConstructorPropertiesAndPublicFields {

    public final String firstName;
    public final String lastName;
    public final int    id;
    public final Date   dateOfBirth;

    // Check if setAccessible is called correctly
    @ConstructorProperties({ "firstName", "lastName", "id", "dateOfBirth" })
    ImmutableAuthorWithConstructorPropertiesAndPublicFields(String firstName, String lastName, int id, Date dateOfBirth) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    // This should never be called
    @SuppressWarnings("unused")
    ImmutableAuthorWithConstructorPropertiesAndPublicFields(int ID, String firstName, String lastName) {
        throw new RuntimeException();
    }

    // [#3919] This matches "accidentally", but shouldn't be used
    @Column(name = "LAST_NAME")
    public String getXX() {
        return null;
    }
}
