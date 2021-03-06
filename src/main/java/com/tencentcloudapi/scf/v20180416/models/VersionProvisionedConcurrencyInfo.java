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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionProvisionedConcurrencyInfo extends AbstractModel{

    /**
    * 设置的预置并发数。
    */
    @SerializedName("AllocatedProvisionedConcurrencyNum")
    @Expose
    private Long AllocatedProvisionedConcurrencyNum;

    /**
    * 当前已完成预置的并发数。
    */
    @SerializedName("AvailableProvisionedConcurrencyNum")
    @Expose
    private Long AvailableProvisionedConcurrencyNum;

    /**
    * 预置任务状态，Done表示已完成，InProgress表示进行中，Failed表示部分或全部失败。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 对预置任务状态Status的说明。
    */
    @SerializedName("StatusReason")
    @Expose
    private String StatusReason;

    /**
    * 函数版本号
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
     * Get 设置的预置并发数。 
     * @return AllocatedProvisionedConcurrencyNum 设置的预置并发数。
     */
    public Long getAllocatedProvisionedConcurrencyNum() {
        return this.AllocatedProvisionedConcurrencyNum;
    }

    /**
     * Set 设置的预置并发数。
     * @param AllocatedProvisionedConcurrencyNum 设置的预置并发数。
     */
    public void setAllocatedProvisionedConcurrencyNum(Long AllocatedProvisionedConcurrencyNum) {
        this.AllocatedProvisionedConcurrencyNum = AllocatedProvisionedConcurrencyNum;
    }

    /**
     * Get 当前已完成预置的并发数。 
     * @return AvailableProvisionedConcurrencyNum 当前已完成预置的并发数。
     */
    public Long getAvailableProvisionedConcurrencyNum() {
        return this.AvailableProvisionedConcurrencyNum;
    }

    /**
     * Set 当前已完成预置的并发数。
     * @param AvailableProvisionedConcurrencyNum 当前已完成预置的并发数。
     */
    public void setAvailableProvisionedConcurrencyNum(Long AvailableProvisionedConcurrencyNum) {
        this.AvailableProvisionedConcurrencyNum = AvailableProvisionedConcurrencyNum;
    }

    /**
     * Get 预置任务状态，Done表示已完成，InProgress表示进行中，Failed表示部分或全部失败。 
     * @return Status 预置任务状态，Done表示已完成，InProgress表示进行中，Failed表示部分或全部失败。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 预置任务状态，Done表示已完成，InProgress表示进行中，Failed表示部分或全部失败。
     * @param Status 预置任务状态，Done表示已完成，InProgress表示进行中，Failed表示部分或全部失败。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 对预置任务状态Status的说明。 
     * @return StatusReason 对预置任务状态Status的说明。
     */
    public String getStatusReason() {
        return this.StatusReason;
    }

    /**
     * Set 对预置任务状态Status的说明。
     * @param StatusReason 对预置任务状态Status的说明。
     */
    public void setStatusReason(String StatusReason) {
        this.StatusReason = StatusReason;
    }

    /**
     * Get 函数版本号 
     * @return Qualifier 函数版本号
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set 函数版本号
     * @param Qualifier 函数版本号
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllocatedProvisionedConcurrencyNum", this.AllocatedProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "AvailableProvisionedConcurrencyNum", this.AvailableProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusReason", this.StatusReason);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);

    }
}

