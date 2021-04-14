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

package tech.aegean.next.nirvana.member.base.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.aegean.next.nirvana.member.base.entity.login.MemberLoginRequest;
import tech.aegean.next.nirvana.member.base.entity.login.MemberLoginResult;
import tech.aegean.next.nirvana.member.base.handler.login.invoke.MemberLoginInvokeHandler;

/**
 * MemberLoginServiceImpl
 * 用户登录服务
 * @author rainyblossom
 */
@Component
@RequiredArgsConstructor
public class MemberLoginServiceImpl implements MemberLoginService {

    private final @NonNull MemberLoginInvokeHandler invokeHandler;

    @Override
    public MemberLoginResult login(MemberLoginRequest memberLoginRequest) {
        return invokeHandler.invoke(memberLoginRequest).doLogin(memberLoginRequest);
    }
}
