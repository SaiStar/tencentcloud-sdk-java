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

public class GetUpgradeInstanceProgressRequest extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 最多获取多少个节点的进度
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 从第几个节点开始获取进度
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 最多获取多少个节点的进度 
     * @return Limit 最多获取多少个节点的进度
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 最多获取多少个节点的进度
     * @param Limit 最多获取多少个节点的进度
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 从第几个节点开始获取进度 
     * @return Offset 从第几个节点开始获取进度
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 从第几个节点开始获取进度
     * @param Offset 从第几个节点开始获取进度
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

