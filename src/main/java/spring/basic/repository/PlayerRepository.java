package spring.basic.repository;

import spring.basic.domain.Player;
import spring.basic.domain.Team;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository {
    List<Player> findAll();
    Optional<Player> findById(Long id);
    Optional<Player> findByName(String name);
    Optional<Player> findByGameId(String gameId);
    Optional<Player> findByTeam(Team team);
    Player save(Player player);
    void delete(Player player);
    void deleteAll();
}
