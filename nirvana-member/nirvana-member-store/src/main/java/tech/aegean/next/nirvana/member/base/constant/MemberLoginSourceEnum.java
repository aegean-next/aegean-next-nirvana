/*
 * Copyright (c) 2021. Aegean Next OpenSource FrameWork
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 * ----- ----- ----- ----- -----
 *
 * Visit the project homepage for more information at https://next.aegean.tech,
 * Or see the code warehouse at https://github.com/aegean-next, https://gitee.com/aegean-next.
 */

package tech.aegean.next.nirvana.member.base.constant;

import cn.hutool.core.lang.Validator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * MemberLoginSourceEnum
 * @author RainyBlossom
 */
@AllArgsConstructor
@NoArgsConstructor
public enum MemberLoginSourceEnum {

    // Error
    LOGIN_ERROR("ERROR", 0),

    // Standard Login | 标准登录
    LOGIN_STANDARD_ACCOUNT("STANDARD_ACCOUNT", 100),
    LOGIN_STANDARD_QUICK("STANDARD_QUICK", 101),

    // Social Login | 第三方登录方式
    LOGIN_SOCIAL_QQ("SOCIAL_QQ", 200),
    LOGIN_SOCIAL_WECHAT_PLATFORM("SOCIAL_WECHAT_PLATFORM", 201),
    LOGIN_SOCIAL_WECHAT_PROGRAM("SOCIAL_WECHAT_PROGRAM", 202),
    LOGIN_SOCIAL_WEIBO("SOCIAL_WEIBO", 203),
    LOGIN_SOCIAL_ALIPAY("SOCIAL_ALIPAY", 204),

    // Global Login | 国际登录方式
    LOGIN_GLOBAL_APPLE("SOCIAL_APPLE", 300),
    LOGIN_GLOBAL_LINE("GLOBAL_LINE", 301),
    LOGIN_GLOBAL_FACKBOOK("GLOBAL_FACKBOOK", 302),
    LOGIN_GLOBAL_GITHUB("GLOBAL_GITHUB", 303),

    ;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Integer value;

    public static MemberLoginSourceEnum getLoginEnum(String name){
        if (Validator.isNotNull(name)){
            for (MemberLoginSourceEnum loginSourceEnum : MemberLoginSourceEnum.values()){
                if (loginSourceEnum.getName().equals(name)){
                    return loginSourceEnum;
                }
            }
        }
        return MemberLoginSourceEnum.LOGIN_ERROR;
    }

    public static MemberLoginSourceEnum getLoginEnum(Integer value){
        if (Validator.isNotNull(value)){
            for (MemberLoginSourceEnum loginSourceEnum : MemberLoginSourceEnum.values()){
                if (loginSourceEnum.getValue().equals(value)){
                    return loginSourceEnum;
                }
            }
        }
        return MemberLoginSourceEnum.LOGIN_ERROR;
    }

}
