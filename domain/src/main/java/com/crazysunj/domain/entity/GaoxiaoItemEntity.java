/**
 * Copyright 2017 Sun Jian
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.crazysunj.domain.entity;

import com.crazysunj.domain.entity.base.MultiTypeIdEntity;

/**
 * author: sunjian
 * created on: 2017/9/24 下午4:13
 * description: https://github.com/crazysunj/CrazyDaily
 */

public class GaoxiaoItemEntity extends MultiTypeIdEntity {

    public static final int TYPE_GAOXIAO = 4;
    public static final String HEADER_TITLE = "搞笑视频";
    public static final String HEADER_OPTIONS = "凑合着看吧";


    private String id;
    private String avatar;
    private String name;
    private CharSequence title;
    private String thumbnail;
    private long duration;
    private String videoUrl;

    public GaoxiaoItemEntity(String id, String avatar, String name, CharSequence title, String thumbnail, long duration, String videoUrl) {
        this.id = id;
        this.avatar = avatar;
        this.name = name;
        this.title = title;
        this.thumbnail = thumbnail;
        this.duration = duration;
        this.videoUrl = videoUrl;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public CharSequence getTitle() {
        return title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public long getDuration() {
        return duration;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    @Override
    public String getStringId() {
        return id;
    }

    @Override
    public int getItemType() {
        return TYPE_GAOXIAO;
    }
}
