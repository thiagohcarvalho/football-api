package io.github.thiagohcarvalho.football_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_statistic")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    private String nation;
    private String position;
    private Integer age;
    private Integer matchesPlayed;
    private Integer starts;
    private Double minutesPlayed;
    private Double goals;
    private Double assists;
    @Column(name = "penalties_scored")
    private Double pkScored;
    private Double yellowCards;
    private Double redCards;
    @Column(name = "expected_goals")
    private Double xg;
    @Column(name = "expected_assists")
    private Double xa;
    private String teamName;

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, Integer matchesPlayed, Integer starts, Double minutesPlayed, Double goals, Double assists, Double pkScored, Double yellowCards, Double redCards, Double xg, Double xa, String teamName) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.starts = starts;
        this.minutesPlayed = minutesPlayed;
        this.goals = goals;
        this.assists = assists;
        this.pkScored = pkScored;
        this.yellowCards = yellowCards;
        this.redCards = redCards;
        this.xg = xg;
        this.xa = xa;
        this.teamName = teamName;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPkScored() {
        return pkScored;
    }

    public void setPkScored(Double pkScored) {
        this.pkScored = pkScored;
    }

    public Double getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Double getRedCards() {
        return redCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = redCards;
    }

    public Double getXg() {
        return xg;
    }

    public void setXg(Double xg) {
        this.xg = xg;
    }

    public Double getXa() {
        return xa;
    }

    public void setXa(Double xa) {
        this.xa = xa;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
}
