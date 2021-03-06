/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.applicationinsights.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum Tier {

    CUSTOM("CUSTOM"),
    DEFAULT("DEFAULT"),
    DOT_NET_CORE("DOT_NET_CORE"),
    DOT_NET_WORKER("DOT_NET_WORKER"),
    DOT_NET_WEB_TIER("DOT_NET_WEB_TIER"),
    DOT_NET_WEB("DOT_NET_WEB"),
    SQL_SERVER("SQL_SERVER"),
    SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP("SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP"),
    MYSQL("MYSQL"),
    POSTGRESQL("POSTGRESQL"),
    JAVA_JMX("JAVA_JMX"),
    ORACLE("ORACLE");

    private String value;

    private Tier(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return Tier corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static Tier fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (Tier enumEntry : Tier.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
