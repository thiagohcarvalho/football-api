package io.github.thiagohcarvalho.football_api.repository;

import io.github.thiagohcarvalho.football_api.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByName(String name);
    Optional<Player> findByName(String name);
    List<Player> findByTeam_name(String teamName);
    List<Player> findByPlayer_nameContaining(String playerName);
    List<Player> findByPosition(String position);
    List<Player> findByNation(String nation);
    List<Player> findByTeam_nameAndPosition(String teamName, String position);
}
