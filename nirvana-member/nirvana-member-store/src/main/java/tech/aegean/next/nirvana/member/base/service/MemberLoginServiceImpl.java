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

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import tech.aegean.next.nirvana.member.base.entity.login.MemberLoginRequest;
import tech.aegean.next.nirvana.member.base.entity.login.MemberLoginResult;
import tech.aegean.next.origin.base.entity.Result;
import tech.aegean.next.origin.member.model.Member;
import tech.aegean.next.origin.member.service.MemberService;

@Service
public class MemberLoginServiceImpl implements MemberLoginService {

    @Autowired
    private MemberService memberService;

    @Override
    public Result<MemberLoginResult> login(MemberLoginRequest memberLoginRequest) {

        memberService.getOne(Wrappers.<Member>lambdaQuery().eq(Member::getMobile, 31))
        return null;
    }
}
