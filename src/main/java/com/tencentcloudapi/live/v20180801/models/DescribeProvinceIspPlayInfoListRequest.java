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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProvinceIspPlayInfoListRequest extends AbstractModel{

    /**
    * 起始时间点，当前使用北京时间，
例：2019-02-21 10:00:00。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间点，当前使用北京时间，
例：2019-02-21 12:00:00。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 支持如下粒度：
1：1分钟粒度（跨度不支持超过1天）
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
    * 统计指标类型：
“Bandwidth”：带宽
“FluxPerSecond”：平均流量
“Flux”：流量
“Request”：请求数
“Online”：并发连接数
    */
    @SerializedName("StatType")
    @Expose
    private String StatType;

    /**
    * 播放域名列表。
    */
    @SerializedName("PlayDomains")
    @Expose
    private String [] PlayDomains;

    /**
    * 要查询的省份（地区）英文名称列表，如 Beijing。
    */
    @SerializedName("ProvinceNames")
    @Expose
    private String [] ProvinceNames;

    /**
    * 要查询的运营商英文名称列表，如 China Mobile ，如果为空，查询所有运营商的数据。
    */
    @SerializedName("IspNames")
    @Expose
    private String [] IspNames;

    /**
    * 地域，可选值：Mainland，Oversea，China，Foreign，Global（默认值）；如果为空，查询总的数据；如果为“Mainland”，查询中国大陆的数据；如果为“Oversea”，则查询中国大陆以外的数据；如果为China，查询中国的数据（包括港澳台）；如果为Foreign，查询国外的数据（不包括港澳台）。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
    * ip类型：
“Ipv6”：Ipv6数据
如果为空，查询总的数据；
    */
    @SerializedName("IpType")
    @Expose
    private String IpType;

    /**
     * Get 起始时间点，当前使用北京时间，
例：2019-02-21 10:00:00。 
     * @return StartTime 起始时间点，当前使用北京时间，
例：2019-02-21 10:00:00。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间点，当前使用北京时间，
例：2019-02-21 10:00:00。
     * @param StartTime 起始时间点，当前使用北京时间，
例：2019-02-21 10:00:00。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间点，当前使用北京时间，
例：2019-02-21 12:00:00。
注：EndTime 和 StartTime 只支持最近1天的数据查询。 
     * @return EndTime 结束时间点，当前使用北京时间，
例：2019-02-21 12:00:00。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间点，当前使用北京时间，
例：2019-02-21 12:00:00。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     * @param EndTime 结束时间点，当前使用北京时间，
例：2019-02-21 12:00:00。
注：EndTime 和 StartTime 只支持最近1天的数据查询。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 支持如下粒度：
1：1分钟粒度（跨度不支持超过1天） 
     * @return Granularity 支持如下粒度：
1：1分钟粒度（跨度不支持超过1天）
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * Set 支持如下粒度：
1：1分钟粒度（跨度不支持超过1天）
     * @param Granularity 支持如下粒度：
1：1分钟粒度（跨度不支持超过1天）
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get 统计指标类型：
“Bandwidth”：带宽
“FluxPerSecond”：平均流量
“Flux”：流量
“Request”：请求数
“Online”：并发连接数 
     * @return StatType 统计指标类型：
“Bandwidth”：带宽
“FluxPerSecond”：平均流量
“Flux”：流量
“Request”：请求数
“Online”：并发连接数
     */
    public String getStatType() {
        return this.StatType;
    }

    /**
     * Set 统计指标类型：
“Bandwidth”：带宽
“FluxPerSecond”：平均流量
“Flux”：流量
“Request”：请求数
“Online”：并发连接数
     * @param StatType 统计指标类型：
“Bandwidth”：带宽
“FluxPerSecond”：平均流量
“Flux”：流量
“Request”：请求数
“Online”：并发连接数
     */
    public void setStatType(String StatType) {
        this.StatType = StatType;
    }

    /**
     * Get 播放域名列表。 
     * @return PlayDomains 播放域名列表。
     */
    public String [] getPlayDomains() {
        return this.PlayDomains;
    }

    /**
     * Set 播放域名列表。
     * @param PlayDomains 播放域名列表。
     */
    public void setPlayDomains(String [] PlayDomains) {
        this.PlayDomains = PlayDomains;
    }

    /**
     * Get 要查询的省份（地区）英文名称列表，如 Beijing。 
     * @return ProvinceNames 要查询的省份（地区）英文名称列表，如 Beijing。
     */
    public String [] getProvinceNames() {
        return this.ProvinceNames;
    }

    /**
     * Set 要查询的省份（地区）英文名称列表，如 Beijing。
     * @param ProvinceNames 要查询的省份（地区）英文名称列表，如 Beijing。
     */
    public void setProvinceNames(String [] ProvinceNames) {
        this.ProvinceNames = ProvinceNames;
    }

    /**
     * Get 要查询的运营商英文名称列表，如 China Mobile ，如果为空，查询所有运营商的数据。 
     * @return IspNames 要查询的运营商英文名称列表，如 China Mobile ，如果为空，查询所有运营商的数据。
     */
    public String [] getIspNames() {
        return this.IspNames;
    }

    /**
     * Set 要查询的运营商英文名称列表，如 China Mobile ，如果为空，查询所有运营商的数据。
     * @param IspNames 要查询的运营商英文名称列表，如 China Mobile ，如果为空，查询所有运营商的数据。
     */
    public void setIspNames(String [] IspNames) {
        this.IspNames = IspNames;
    }

    /**
     * Get 地域，可选值：Mainland，Oversea，China，Foreign，Global（默认值）；如果为空，查询总的数据；如果为“Mainland”，查询中国大陆的数据；如果为“Oversea”，则查询中国大陆以外的数据；如果为China，查询中国的数据（包括港澳台）；如果为Foreign，查询国外的数据（不包括港澳台）。 
     * @return MainlandOrOversea 地域，可选值：Mainland，Oversea，China，Foreign，Global（默认值）；如果为空，查询总的数据；如果为“Mainland”，查询中国大陆的数据；如果为“Oversea”，则查询中国大陆以外的数据；如果为China，查询中国的数据（包括港澳台）；如果为Foreign，查询国外的数据（不包括港澳台）。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 地域，可选值：Mainland，Oversea，China，Foreign，Global（默认值）；如果为空，查询总的数据；如果为“Mainland”，查询中国大陆的数据；如果为“Oversea”，则查询中国大陆以外的数据；如果为China，查询中国的数据（包括港澳台）；如果为Foreign，查询国外的数据（不包括港澳台）。
     * @param MainlandOrOversea 地域，可选值：Mainland，Oversea，China，Foreign，Global（默认值）；如果为空，查询总的数据；如果为“Mainland”，查询中国大陆的数据；如果为“Oversea”，则查询中国大陆以外的数据；如果为China，查询中国的数据（包括港澳台）；如果为Foreign，查询国外的数据（不包括港澳台）。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    /**
     * Get ip类型：
“Ipv6”：Ipv6数据
如果为空，查询总的数据； 
     * @return IpType ip类型：
“Ipv6”：Ipv6数据
如果为空，查询总的数据；
     */
    public String getIpType() {
        return this.IpType;
    }

    /**
     * Set ip类型：
“Ipv6”：Ipv6数据
如果为空，查询总的数据；
     * @param IpType ip类型：
“Ipv6”：Ipv6数据
如果为空，查询总的数据；
     */
    public void setIpType(String IpType) {
        this.IpType = IpType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "StatType", this.StatType);
        this.setParamArraySimple(map, prefix + "PlayDomains.", this.PlayDomains);
        this.setParamArraySimple(map, prefix + "ProvinceNames.", this.ProvinceNames);
        this.setParamArraySimple(map, prefix + "IspNames.", this.IspNames);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);
        this.setParamSimple(map, prefix + "IpType", this.IpType);

    }
}

