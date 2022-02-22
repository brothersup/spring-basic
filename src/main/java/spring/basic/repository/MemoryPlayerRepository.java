package spring.basic.repository;

import org.springframework.stereotype.Service;
import spring.basic.domain.Player;
import spring.basic.domain.Team;

import java.util.*;

@Service
public class MemoryPlayerRepository implements PlayerRepository {

    private static Map<Long, Player> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public List<Player> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Player> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Player> findByName(String name) {
        return store.values().stream()
                .filter(player -> player.getName().equals(name))
                .findAny();
    }

    @Override
    public Optional<Player> findByGameId(String gameId) {
        return store.values().stream()
                .filter(player -> player.getGameId().equals(gameId))
                .findAny();
    }

    @Override
    public Optional<Player> findByTeam(Team team) {
        return store.values().stream()
                .filter(player -> player.getTeam().getId()
                        .equals(team.getId()))
                .findAny();
    }

    @Override
    public Player save(Player player) {
        findByGameId(player.getGameId()).ifPresent(existPlayer -> {
            throw new RuntimeException();
        });

        player.setId(++sequence);
        store.put(player.getId(), player);
        return player;
    }

    @Override
    public void delete(Player player) {
        store.remove(player.getId());
    }

    @Override
    public void deleteAll() {
        store.clear();
    }
}
