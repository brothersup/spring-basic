package spring.basic.domain;

public class Player extends BasicData {
    private Long id;
    private String gameId;
    private Position position;

    public Player(Long id, String name, int age, String gameId, Position position) {
        this.id = id;
        super.name = name;
        super.age = age;
        this.gameId = gameId;
        this.position = position;
    }
}
