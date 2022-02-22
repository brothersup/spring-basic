package spring.basic.domain;

public class Player extends BasicData {
    private Long id;
    private String gameId;
    private Position position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Player(Long id, String name, int age, String gameId, Position position) {
        this.id = id;
        super.name = name;
        super.age = age;
        this.gameId = gameId;
        this.position = position;
    }
}
