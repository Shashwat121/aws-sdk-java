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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/GetGrant" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGrantResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Grant details.
     * </p>
     */
    private Grant grant;

    /**
     * <p>
     * Grant details.
     * </p>
     * 
     * @param grant
     *        Grant details.
     */

    public void setGrant(Grant grant) {
        this.grant = grant;
    }

    /**
     * <p>
     * Grant details.
     * </p>
     * 
     * @return Grant details.
     */

    public Grant getGrant() {
        return this.grant;
    }

    /**
     * <p>
     * Grant details.
     * </p>
     * 
     * @param grant
     *        Grant details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGrantResult withGrant(Grant grant) {
        setGrant(grant);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGrant() != null)
            sb.append("Grant: ").append(getGrant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGrantResult == false)
            return false;
        GetGrantResult other = (GetGrantResult) obj;
        if (other.getGrant() == null ^ this.getGrant() == null)
            return false;
        if (other.getGrant() != null && other.getGrant().equals(this.getGrant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGrant() == null) ? 0 : getGrant().hashCode());
        return hashCode;
    }

    @Override
    public GetGrantResult clone() {
        try {
            return (GetGrantResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
