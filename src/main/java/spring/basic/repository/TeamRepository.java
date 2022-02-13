package spring.basic.repository;

import spring.basic.domain.Member;
import spring.basic.domain.Team;

import java.util.List;
import java.util.Optional;

public interface TeamRepository {
    Optional<Team> findById(Long id);
    Optional<Team> findByName(String teamName);
    List<Team> findAll();
    List<Member> findMembers(Team team);
    Team addStaff(Member member);
    Team addFirstTeam(Member member);
    Team addSecondTeam(Member member);
}
