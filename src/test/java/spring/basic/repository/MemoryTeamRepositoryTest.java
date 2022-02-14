package spring.basic.repository;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import spring.basic.domain.Team;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryTeamRepositoryTest {

    TeamRepository teamRepository = new MemoryTeamRepository();

    Team team;

    @BeforeEach
    void beforeEach() {
        team = new Team();
        team.setName("T1");
    }

    @AfterEach
    void afterEach() {
        teamRepository.deleteAll();
    }

    @Test
    void findById() {
        Team save = teamRepository.save(team);
        Team result = teamRepository.findById(save.getId()).get();
        assertThat(result).isEqualTo(save);
    }

    @Test
    void findByName() {
        Team save = teamRepository.save(team);
        Team result = teamRepository.findByName(save.getName()).get();
        assertThat(result).isEqualTo(save);
    }

    @Test
    void save() {
        teamRepository.save(team);

        List<Team> result = teamRepository.findAll();
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void saveDuplicateTeamName() {
        teamRepository.save(team);

        Team team2 = new Team();
        team2.setName("T1");

        Assertions.assertThrows(RuntimeException.class, () -> teamRepository.save(team2));
    }

    @Test
    void delete() {
        Team team2 = new Team();
        team2.setName("DWG");

        teamRepository.save(team); // t1
        teamRepository.save(team2); // dwg

        assertThat(teamRepository.findAll().size()).isEqualTo(2); // [t1, dwg]

        teamRepository.delete(team);

        List<Team> result = teamRepository.findAll(); // [dwg]
        assertThat(result.size()).isEqualTo(1);
        assertThat(result.get(0).getName()).isEqualTo("DWG");
    }

}