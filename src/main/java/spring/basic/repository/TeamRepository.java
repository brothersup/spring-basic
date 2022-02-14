package spring.basic.repository;

import spring.basic.domain.Team;

import java.util.List;

public interface TeamRepository {
    List<Team> findAll();
    Team findById(Long id);
    Team findByName(String name);
    void save(Team team);
    String saveLogo();
    void delete(Team team);
    void deleteAll();
}
