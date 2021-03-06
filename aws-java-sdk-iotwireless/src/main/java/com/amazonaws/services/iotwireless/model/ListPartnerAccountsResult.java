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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/ListPartnerAccounts" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPartnerAccountsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * <p>
     * The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * </p>
     */
    private java.util.List<SidewalkAccountInfoWithFingerprint> sidewalk;

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @return The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * </p>
     * 
     * @param nextToken
     *        The token to use to get the next set of results, or <b>null</b> if there are no additional results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerAccountsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * <p>
     * The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * </p>
     * 
     * @return The Sidewalk account credentials.</p>
     *         <p>
     *         The <code>AppServerPrivateKey</code> value is empty to protect its security.
     */

    public java.util.List<SidewalkAccountInfoWithFingerprint> getSidewalk() {
        return sidewalk;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * <p>
     * The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.</p>
     *        <p>
     *        The <code>AppServerPrivateKey</code> value is empty to protect its security.
     */

    public void setSidewalk(java.util.Collection<SidewalkAccountInfoWithFingerprint> sidewalk) {
        if (sidewalk == null) {
            this.sidewalk = null;
            return;
        }

        this.sidewalk = new java.util.ArrayList<SidewalkAccountInfoWithFingerprint>(sidewalk);
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * <p>
     * The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSidewalk(java.util.Collection)} or {@link #withSidewalk(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.</p>
     *        <p>
     *        The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerAccountsResult withSidewalk(SidewalkAccountInfoWithFingerprint... sidewalk) {
        if (this.sidewalk == null) {
            setSidewalk(new java.util.ArrayList<SidewalkAccountInfoWithFingerprint>(sidewalk.length));
        }
        for (SidewalkAccountInfoWithFingerprint ele : sidewalk) {
            this.sidewalk.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Sidewalk account credentials.
     * </p>
     * <p>
     * The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * </p>
     * 
     * @param sidewalk
     *        The Sidewalk account credentials.</p>
     *        <p>
     *        The <code>AppServerPrivateKey</code> value is empty to protect its security.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPartnerAccountsResult withSidewalk(java.util.Collection<SidewalkAccountInfoWithFingerprint> sidewalk) {
        setSidewalk(sidewalk);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSidewalk() != null)
            sb.append("Sidewalk: ").append(getSidewalk());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPartnerAccountsResult == false)
            return false;
        ListPartnerAccountsResult other = (ListPartnerAccountsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSidewalk() == null ^ this.getSidewalk() == null)
            return false;
        if (other.getSidewalk() != null && other.getSidewalk().equals(this.getSidewalk()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSidewalk() == null) ? 0 : getSidewalk().hashCode());
        return hashCode;
    }

    @Override
    public ListPartnerAccountsResult clone() {
        try {
            return (ListPartnerAccountsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
