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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetails extends AbstractModel{

    /**
    * 风险关键词
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 风险类别，RiskAccount，RiskIP, RiskIMEI
    */
    @SerializedName("Lable")
    @Expose
    private String Lable;

    /**
    * 风险等级，1:疑似，2：恶意
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 风险关键词 
     * @return Keywords 风险关键词
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 风险关键词
     * @param Keywords 风险关键词
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 风险类别，RiskAccount，RiskIP, RiskIMEI 
     * @return Lable 风险类别，RiskAccount，RiskIP, RiskIMEI
     */
    public String getLable() {
        return this.Lable;
    }

    /**
     * Set 风险类别，RiskAccount，RiskIP, RiskIMEI
     * @param Lable 风险类别，RiskAccount，RiskIP, RiskIMEI
     */
    public void setLable(String Lable) {
        this.Lable = Lable;
    }

    /**
     * Get 风险等级，1:疑似，2：恶意 
     * @return Level 风险等级，1:疑似，2：恶意
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，1:疑似，2：恶意
     * @param Level 风险等级，1:疑似，2：恶意
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Lable", this.Lable);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

