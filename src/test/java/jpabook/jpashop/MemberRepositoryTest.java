//package jpabook.jpashop;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.assertj.core.api.Assertions.*;
//
//
//@SpringBootTest
//class MemberRepositoryTest {
//
//    @Autowired
//    MemberRepository memberRepository;
//
//    @Test
//    @Transactional
////    @Rollback(value = false)
//    void testMember() {
//
//        Member member = new Member();
//        member.setUsername("userA");
//
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);
//
//        assertThat(findMember.getId()).isEqualTo(member.getId());
//        assertThat(findMember.getUsername()).isEqualTo(member.getUsername());
//
//        System.out.println("MemberId = " + findMember.getId());
//        System.out.println("userName = " + findMember.getUsername());
//    }
//
//
//}