package spring.basic.domain;

import java.util.List;

public class Team {
    private Long id;
    private String name;
    private List<Member> staff;
    private List<Member> firstTeam;
    private List<Member> secondTeam;

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

    public List<Member> getStaff() {
        return staff;
    }

    public void setStaff(List<Member> staff) {
        this.staff = staff;
    }

    public List<Member> getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(List<Member> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public List<Member> getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(List<Member> secondTeam) {
        this.secondTeam = secondTeam;
    }
}
