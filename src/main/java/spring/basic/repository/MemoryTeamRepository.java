package spring.basic.repository;

import spring.basic.domain.Team;

import java.util.*;

public class MemoryTeamRepository implements TeamRepository {

    private static Map<Long, Team> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public List<Team> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Team> findById(Long id) {
        /*
         * optional.empty() => 비어있는 optional객체 생성
         * optional.of(value) => 객체를 담고있는 optional객체 생성 -> value가 null일 경우 NullPointerException 발생하므로 주의
         * optional.ofNullable(value) => of() + empty() -> value가 있는경우 값있는 optional객체 생성, null인경우 비어있는 optional객체 생성
         */
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Team> findByName(String name) {
        return store.values().stream()
                .filter(team -> team.getName().equals(name))
                .findAny();
    }

    @Override
    public Team save(Team team) {
        findByName(team.getName()).ifPresent(existTeam -> {
            throw new RuntimeException();
        });

        team.setId(++sequence);
        store.put(team.getId(), team);

        return team;
    }

    @Override
    public void delete(Team team) {
        store.remove(team.getId());
    }

    @Override
    public void deleteAll() {
        store.clear();
    }
}
