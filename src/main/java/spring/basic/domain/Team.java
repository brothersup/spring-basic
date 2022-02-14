package spring.basic.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Long id;
    private String name;
    private String logo;
    private HeadCoach headCoach;
    private List<Coach> coaches = new ArrayList<>(2);
    private List<Player> firstTeam = new ArrayList<>(5);
    private List<Player> secondTeam = new ArrayList<>(5);

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public HeadCoach getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(HeadCoach headCoach) {
        this.headCoach = headCoach;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    public List<Player> getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(List<Player> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public List<Player> getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(List<Player> secondTeam) {
        this.secondTeam = secondTeam;
    }

    public void addCoach(Coach coach) {
        this.coaches.add(coach);
    }

    public void addFirstTeam(Player player) {
        this.firstTeam.add(player);
    }

    public void addSecondTeam(Player player) {
        this.secondTeam.add(player);
    }
}
