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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTemplateListRequest extends AbstractModel{

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 用户注册类型，默认:all , 个人：I ,企业: E
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 用户注册类型，默认:all , 个人：I ,企业: E 
     * @return Type 用户注册类型，默认:all , 个人：I ,企业: E
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 用户注册类型，默认:all , 个人：I ,企业: E
     * @param Type 用户注册类型，默认:all , 个人：I ,企业: E
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject 
     * @return Status 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
     * @param Status 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

