package jpabook.jpashop.domain.repository;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.service.MemberService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
//@Rollback(value = false)
class MemberServiceTest {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception {
        Member member = new Member();
        member.setName("hi");

        Long savedId = memberService.join(member);

        assertEquals(member, memberRepository.findOne(savedId));

    }

    @Test
//            (expected = IllegalStateException.class)
    public void 중복회원예외() throws Exception {
        Member member1 = new Member();
        member1.setName("같은이름");

        Member member2 = new Member();
        member2.setName("같은이름");

        memberService.join(member1);
        try {
            memberService.join(member2);
        } catch (IllegalStateException e) {
            return;
        }
        fail("예외 발생해야함");

    }

}