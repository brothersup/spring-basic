package spring.basic.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spring.basic.domain.Member;
import spring.basic.domain.Role;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {

    MemberRepository memberRepository = new MemoryMemberRepository();

    @AfterEach
    void afterEach() {
        memberRepository.clear();
    }

    @Test
    @DisplayName("선수 등록 테스트")
    void saveTest() {
        Member member = new Member("이상혁", "Faker", Role.MID);
        memberRepository.save(member);

        Member result = memberRepository.findById(member.getId()).get();
        assertThat(result).isEqualTo(member);
    }

    @Test
    @DisplayName("이름으로 선수 조회")
    void findByNameTest() {
        Member member = new Member("이상혁", "Faker", Role.MID);
        memberRepository.save(member);

        Member result = memberRepository.findByName(member.getName()).get();
        assertThat(result).isEqualTo(member);
    }

    @Test
    @DisplayName("게임아이디로 선수 조회")
    void findByGameIdTest() {
        Member member = new Member("이상혁", "Faker", Role.MID);
        memberRepository.save(member);

        Member result = memberRepository.findByGameId(member.getGameId()).get();
        assertThat(result).isEqualTo(member);
    }

    @Test
    @DisplayName("전체 선수 조회")
    void findAllTest() {
        Member member1 = new Member("이상혁", "Faker", Role.MID);
        memberRepository.save(member1);

        Member member2 = new Member("김혁규", "DEFT", Role.ADC);
        memberRepository.save(member2);

        List<Member> result = memberRepository.findAll();
        assertThat(result.size()).isEqualTo(2);
    }

}