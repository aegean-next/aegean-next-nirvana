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

package tech.aegean.next.nirvana.member.base.handler.login.standard;

import cn.hutool.core.lang.Validator;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import tech.aegean.next.nirvana.member.base.entity.login.MemberLoginRequest;
import tech.aegean.next.nirvana.member.base.entity.login.MemberLoginResult;
import tech.aegean.next.nirvana.member.base.handler.login.MemberLoginAbstractHandler;
import tech.aegean.next.origin.base.constant.CommonStatusEnum;
import tech.aegean.next.origin.member.model.Member;
import tech.aegean.next.origin.member.service.MemberService;

/**
 * 在线商城登录业务
 */
@Component
@RequiredArgsConstructor
public class MemberLoginAccountHandler extends MemberLoginAbstractHandler {

    private final @NonNull MemberService memberService;

    @Override
    public MemberLoginResult doLogin(MemberLoginRequest memberLoginRequest) {
        // 通过 e-mail 查询是否存在该用户
        Member member = memberService.getOne(Wrappers.<Member>lambdaQuery().eq(Member::getEmail, memberLoginRequest.getEmail()), false);
        if (Validator.isNull(member) || !CommonStatusEnum.COMMON_STATUS_ENUM_ON.equals(member.getStatus())){
            return MemberLoginResult.builder().isRegistered(false).build();
        }

        return null;
    }
}
