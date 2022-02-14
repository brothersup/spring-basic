package spring.basic.repository;

import spring.basic.domain.Team;

import java.util.List;
import java.util.Optional;

public interface TeamRepository {
    List<Team> findAll();
    Optional<Team> findById(Long id);
    Optional<Team> findByName(String name);
    Team save(Team team);
    void delete(Team team);
    void deleteAll();
}
