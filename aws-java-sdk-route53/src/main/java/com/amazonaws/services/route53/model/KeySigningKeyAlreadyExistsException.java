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
package com.amazonaws.services.route53.model;

import javax.annotation.Generated;

/**
 * <p>
 * You've already created a key signing key (KSK) with this name or with the same customer managed key (CMK) ARN.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KeySigningKeyAlreadyExistsException extends com.amazonaws.services.route53.model.AmazonRoute53Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new KeySigningKeyAlreadyExistsException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public KeySigningKeyAlreadyExistsException(String message) {
        super(message);
    }

}
