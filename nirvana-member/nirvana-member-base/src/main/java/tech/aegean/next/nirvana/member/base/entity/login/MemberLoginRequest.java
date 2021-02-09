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

package tech.aegean.next.nirvana.member.base.entity.login;

import lombok.Builder;
import lombok.Data;
import tech.aegean.next.origin.base.entity.BaseRequest;

@Data
@Builder
public class MemberLoginRequest extends BaseRequest {

    /** 登录渠道 必填 **/
    private String source;

    /** 登录手机号 可选 **/
    private String mobile;

    /** 登录邮箱 可选 **/
    private String email;

    /** 密码 可选 **/
    private String password;

    /** 短信验证码 可选 **/
    private String smsVerifyCode;

    /** 图形验证码 可选 **/
    private String picVerifyCode;


}
