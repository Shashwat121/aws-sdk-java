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
package com.amazonaws.services.config.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.config.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * ExternalEvaluationMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class ExternalEvaluationMarshaller {

    private static final MarshallingInfo<String> COMPLIANCERESOURCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceResourceType").build();
    private static final MarshallingInfo<String> COMPLIANCERESOURCEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceResourceId").build();
    private static final MarshallingInfo<String> COMPLIANCETYPE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ComplianceType").build();
    private static final MarshallingInfo<String> ANNOTATION_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("Annotation").build();
    private static final MarshallingInfo<java.util.Date> ORDERINGTIMESTAMP_BINDING = MarshallingInfo.builder(MarshallingType.DATE)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OrderingTimestamp").timestampFormat("unixTimestamp").build();

    private static final ExternalEvaluationMarshaller instance = new ExternalEvaluationMarshaller();

    public static ExternalEvaluationMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(ExternalEvaluation externalEvaluation, ProtocolMarshaller protocolMarshaller) {

        if (externalEvaluation == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(externalEvaluation.getComplianceResourceType(), COMPLIANCERESOURCETYPE_BINDING);
            protocolMarshaller.marshall(externalEvaluation.getComplianceResourceId(), COMPLIANCERESOURCEID_BINDING);
            protocolMarshaller.marshall(externalEvaluation.getComplianceType(), COMPLIANCETYPE_BINDING);
            protocolMarshaller.marshall(externalEvaluation.getAnnotation(), ANNOTATION_BINDING);
            protocolMarshaller.marshall(externalEvaluation.getOrderingTimestamp(), ORDERINGTIMESTAMP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
