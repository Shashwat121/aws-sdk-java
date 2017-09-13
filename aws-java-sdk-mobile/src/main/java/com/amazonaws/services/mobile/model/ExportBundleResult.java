/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mobile.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Result structure which contains link to download custom-generated SDK and tool packages used to integrate mobile web
 * or app clients with backed AWS resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mobile-2017-07-01/ExportBundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportBundleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app
     * with the AWS resources created by the AWS Mobile Hub project.
     * </p>
     */
    private String downloadUrl;

    /**
     * <p>
     * URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app
     * with the AWS resources created by the AWS Mobile Hub project.
     * </p>
     * 
     * @param downloadUrl
     *        URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or
     *        web app with the AWS resources created by the AWS Mobile Hub project.
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app
     * with the AWS resources created by the AWS Mobile Hub project.
     * </p>
     * 
     * @return URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or
     *         web app with the AWS resources created by the AWS Mobile Hub project.
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or web app
     * with the AWS resources created by the AWS Mobile Hub project.
     * </p>
     * 
     * @param downloadUrl
     *        URL which contains the custom-generated SDK and tool packages used to integrate the client mobile app or
     *        web app with the AWS resources created by the AWS Mobile Hub project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportBundleResult withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append(getDownloadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportBundleResult == false)
            return false;
        ExportBundleResult other = (ExportBundleResult) obj;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        return hashCode;
    }

    @Override
    public ExportBundleResult clone() {
        try {
            return (ExportBundleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}