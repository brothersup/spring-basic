package spring.basic.domain;

public class HeadCoach extends BasicData {
    private Long id;

    public HeadCoach(Long id, String name, int age) {
        this.id = id;
        super.name = name;
        super.age = age;
    }
}
