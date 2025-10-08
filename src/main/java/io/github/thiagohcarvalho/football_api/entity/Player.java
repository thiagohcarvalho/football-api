package io.github.thiagohcarvalho.football_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_stats")
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String name;
}
