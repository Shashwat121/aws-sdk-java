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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DeleteDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDatasetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the project that contains the dataset that you want to delete.
     * </p>
     */
    private String projectName;
    /**
     * <p>
     * The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     * <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     * <code>train</code>.
     * </p>
     */
    private String datasetType;
    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>DeleteDataset</code>. In this case, safely retry your call to <code>DeleteDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>DeleteDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the project that contains the dataset that you want to delete.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to delete.
     */

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to delete.
     * </p>
     * 
     * @return The name of the project that contains the dataset that you want to delete.
     */

    public String getProjectName() {
        return this.projectName;
    }

    /**
     * <p>
     * The name of the project that contains the dataset that you want to delete.
     * </p>
     * 
     * @param projectName
     *        The name of the project that contains the dataset that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatasetRequest withProjectName(String projectName) {
        setProjectName(projectName);
        return this;
    }

    /**
     * <p>
     * The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     * <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     * <code>train</code>.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     *        <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     *        <code>train</code>.
     */

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }

    /**
     * <p>
     * The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     * <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     * <code>train</code>.
     * </p>
     * 
     * @return The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     *         <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     *         <code>train</code>.
     */

    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * <p>
     * The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     * <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     * <code>train</code>.
     * </p>
     * 
     * @param datasetType
     *        The type of the dataset to delete. Specify <code>train</code> to delete the training dataset. Specify
     *        <code>test</code> to delete the test dataset. To delete the dataset in a single dataset project, specify
     *        <code>train</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatasetRequest withDatasetType(String datasetType) {
        setDatasetType(datasetType);
        return this;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>DeleteDataset</code>. In this case, safely retry your call to <code>DeleteDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>DeleteDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>DeleteDataset</code>. In this case, safely retry your call to
     *        <code>DeleteDataset</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>DeleteDataset</code>. An idempotency token is
     *        active for 8 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>DeleteDataset</code>. In this case, safely retry your call to <code>DeleteDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>DeleteDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @return ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only
     *         once. You choose the value to pass. For example, An issue, such as an network outage, might prevent you
     *         from getting a response from <code>DeleteDataset</code>. In this case, safely retry your call to
     *         <code>DeleteDataset</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *         the other input parameters are not the same as in the first request. Using a different value for
     *         <code>ClientToken</code> is considered a new call to <code>DeleteDataset</code>. An idempotency token is
     *         active for 8 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only once. You
     * choose the value to pass. For example, An issue, such as an network outage, might prevent you from getting a
     * response from <code>DeleteDataset</code>. In this case, safely retry your call to <code>DeleteDataset</code> by
     * using the same <code>ClientToken</code> parameter value. An error occurs if the other input parameters are not
     * the same as in the first request. Using a different value for <code>ClientToken</code> is considered a new call
     * to <code>DeleteDataset</code>. An idempotency token is active for 8 hours.
     * </p>
     * 
     * @param clientToken
     *        ClientToken is an idempotency token that ensures a call to <code>DeleteDataset</code> completes only once.
     *        You choose the value to pass. For example, An issue, such as an network outage, might prevent you from
     *        getting a response from <code>DeleteDataset</code>. In this case, safely retry your call to
     *        <code>DeleteDataset</code> by using the same <code>ClientToken</code> parameter value. An error occurs if
     *        the other input parameters are not the same as in the first request. Using a different value for
     *        <code>ClientToken</code> is considered a new call to <code>DeleteDataset</code>. An idempotency token is
     *        active for 8 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDatasetRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getProjectName() != null)
            sb.append("ProjectName: ").append(getProjectName()).append(",");
        if (getDatasetType() != null)
            sb.append("DatasetType: ").append(getDatasetType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDatasetRequest == false)
            return false;
        DeleteDatasetRequest other = (DeleteDatasetRequest) obj;
        if (other.getProjectName() == null ^ this.getProjectName() == null)
            return false;
        if (other.getProjectName() != null && other.getProjectName().equals(this.getProjectName()) == false)
            return false;
        if (other.getDatasetType() == null ^ this.getDatasetType() == null)
            return false;
        if (other.getDatasetType() != null && other.getDatasetType().equals(this.getDatasetType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        hashCode = prime * hashCode + ((getDatasetType() == null) ? 0 : getDatasetType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDatasetRequest clone() {
        return (DeleteDatasetRequest) super.clone();
    }

}
