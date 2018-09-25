/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAccountRequest  extends AbstractModel{

    /**
    * 实例ID，形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户允许的访问 host
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * 获取实例ID，形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     * @return InstanceId 实例ID，形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     * @param InstanceId 实例ID，形如：dcdbt-ow728lmc，可以通过 DescribeDCDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取用户名
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取用户允许的访问 host
     * @return Host 用户允许的访问 host
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置用户允许的访问 host
     * @param Host 用户允许的访问 host
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}
