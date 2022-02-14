package spring.basic.domain;

public class Coach extends BasicData {
    private Long id;

    public Coach(Long id, String name, int age) {
        this.id = id;
        super.name = name;
        super.age = age;
    }
}
