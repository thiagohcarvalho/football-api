package io.github.thiagohcarvalho.football_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String name;
    private String nation;
    private String position;
    private Integer age;
    private Integer matches_played;
    private Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    @Column(name = "penalties_scored")
    private Double pk_scored;
    private Double yellow_cards;
    private Double red_cards;
    @Column(name = "expected_goals")
    private Double xg;
    @Column(name = "expected_assists")
    private Double xa;
    private String team_name;

    public Player() {
    }

    public Player(String name, String nation, String position, Integer age, Integer matches_played, Integer starts, Double minutes_played, Double goals, Double assists, Double pk_scored, Double yellow_cards, Double red_cards, Double xg, Double xa, String team_name) {
        this.name = name;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_played = matches_played;
        this.starts = starts;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.pk_scored = pk_scored;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.xg = xg;
        this.xa = xa;
        this.team_name = team_name;
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

    public Integer getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(Integer matches_played) {
        this.matches_played = matches_played;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
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

    public Double getPk_scored() {
        return pk_scored;
    }

    public void setPk_scored(Double pk_scored) {
        this.pk_scored = pk_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
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

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
}
