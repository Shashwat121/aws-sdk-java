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
package com.amazonaws.services.medialive.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.medialive.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * DescribeInputDeviceThumbnailRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class DescribeInputDeviceThumbnailRequestMarshaller {

    private static final MarshallingInfo<String> INPUTDEVICEID_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PATH).marshallLocationName("inputDeviceId").build();
    private static final MarshallingInfo<String> ACCEPT_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.HEADER)
            .marshallLocationName("accept").build();

    private static final DescribeInputDeviceThumbnailRequestMarshaller instance = new DescribeInputDeviceThumbnailRequestMarshaller();

    public static DescribeInputDeviceThumbnailRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(DescribeInputDeviceThumbnailRequest describeInputDeviceThumbnailRequest, ProtocolMarshaller protocolMarshaller) {

        if (describeInputDeviceThumbnailRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(describeInputDeviceThumbnailRequest.getInputDeviceId(), INPUTDEVICEID_BINDING);
            protocolMarshaller.marshall(describeInputDeviceThumbnailRequest.getAccept(), ACCEPT_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
