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
package com.tencentcloudapi.ams.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksResponse extends AbstractModel{

    /**
    * 任务总量，为 int 字符串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 当前页数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private TaskData [] Data;

    /**
    * 翻页Token，当已经到最后一页时，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PageToken")
    @Expose
    private String PageToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务总量，为 int 字符串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Total 任务总量，为 int 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 任务总量，为 int 字符串
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 任务总量，为 int 字符串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get 当前页数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 当前页数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskData [] getData() {
        return this.Data;
    }

    /**
     * Set 当前页数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 当前页数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(TaskData [] Data) {
        this.Data = Data;
    }

    /**
     * Get 翻页Token，当已经到最后一页时，该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PageToken 翻页Token，当已经到最后一页时，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPageToken() {
        return this.PageToken;
    }

    /**
     * Set 翻页Token，当已经到最后一页时，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param PageToken 翻页Token，当已经到最后一页时，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPageToken(String PageToken) {
        this.PageToken = PageToken;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "PageToken", this.PageToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

