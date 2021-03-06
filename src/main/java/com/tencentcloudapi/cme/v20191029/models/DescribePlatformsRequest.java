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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlatformsRequest extends AbstractModel{

    /**
    * 平台集合。
    */
    @SerializedName("Platforms")
    @Expose
    private String [] Platforms;

    /**
    * 平台绑定的 license Id 集合。
    */
    @SerializedName("LicenseIds")
    @Expose
    private String [] LicenseIds;

    /**
    * 分页返回的起始偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值：10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 平台集合。 
     * @return Platforms 平台集合。
     */
    public String [] getPlatforms() {
        return this.Platforms;
    }

    /**
     * Set 平台集合。
     * @param Platforms 平台集合。
     */
    public void setPlatforms(String [] Platforms) {
        this.Platforms = Platforms;
    }

    /**
     * Get 平台绑定的 license Id 集合。 
     * @return LicenseIds 平台绑定的 license Id 集合。
     */
    public String [] getLicenseIds() {
        return this.LicenseIds;
    }

    /**
     * Set 平台绑定的 license Id 集合。
     * @param LicenseIds 平台绑定的 license Id 集合。
     */
    public void setLicenseIds(String [] LicenseIds) {
        this.LicenseIds = LicenseIds;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。 
     * @return Offset 分页返回的起始偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。
     * @param Offset 分页返回的起始偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值：10。 
     * @return Limit 分页返回的记录条数，默认值：10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值：10。
     * @param Limit 分页返回的记录条数，默认值：10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Platforms.", this.Platforms);
        this.setParamArraySimple(map, prefix + "LicenseIds.", this.LicenseIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

