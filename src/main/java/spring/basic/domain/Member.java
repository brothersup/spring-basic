package spring.basic.domain;

public class Member {
    private Long id;
    private String name;
    private String gameId;
    private Role role;

    public Member() {}

    public Member(String name, String gameId, Role role) {
        this.name = name;
        this.gameId = gameId;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
