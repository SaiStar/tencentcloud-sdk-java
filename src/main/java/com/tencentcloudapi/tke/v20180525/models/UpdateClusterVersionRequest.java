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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateClusterVersionRequest extends AbstractModel{

    /**
    * 集群 Id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 需要升级到的版本
    */
    @SerializedName("DstVersion")
    @Expose
    private String DstVersion;

    /**
    * 可容忍的最大不可用pod数目
    */
    @SerializedName("MaxNotReadyPercent")
    @Expose
    private Float MaxNotReadyPercent;

    /**
    * 是否跳过预检查阶段
    */
    @SerializedName("SkipPreCheck")
    @Expose
    private Boolean SkipPreCheck;

    /**
     * Get 集群 Id 
     * @return ClusterId 集群 Id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 Id
     * @param ClusterId 集群 Id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 需要升级到的版本 
     * @return DstVersion 需要升级到的版本
     */
    public String getDstVersion() {
        return this.DstVersion;
    }

    /**
     * Set 需要升级到的版本
     * @param DstVersion 需要升级到的版本
     */
    public void setDstVersion(String DstVersion) {
        this.DstVersion = DstVersion;
    }

    /**
     * Get 可容忍的最大不可用pod数目 
     * @return MaxNotReadyPercent 可容忍的最大不可用pod数目
     */
    public Float getMaxNotReadyPercent() {
        return this.MaxNotReadyPercent;
    }

    /**
     * Set 可容忍的最大不可用pod数目
     * @param MaxNotReadyPercent 可容忍的最大不可用pod数目
     */
    public void setMaxNotReadyPercent(Float MaxNotReadyPercent) {
        this.MaxNotReadyPercent = MaxNotReadyPercent;
    }

    /**
     * Get 是否跳过预检查阶段 
     * @return SkipPreCheck 是否跳过预检查阶段
     */
    public Boolean getSkipPreCheck() {
        return this.SkipPreCheck;
    }

    /**
     * Set 是否跳过预检查阶段
     * @param SkipPreCheck 是否跳过预检查阶段
     */
    public void setSkipPreCheck(Boolean SkipPreCheck) {
        this.SkipPreCheck = SkipPreCheck;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "DstVersion", this.DstVersion);
        this.setParamSimple(map, prefix + "MaxNotReadyPercent", this.MaxNotReadyPercent);
        this.setParamSimple(map, prefix + "SkipPreCheck", this.SkipPreCheck);

    }
}

