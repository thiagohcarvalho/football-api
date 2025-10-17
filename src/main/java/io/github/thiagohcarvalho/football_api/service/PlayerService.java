package io.github.thiagohcarvalho.football_api.service;

import io.github.thiagohcarvalho.football_api.entity.Player;
import io.github.thiagohcarvalho.football_api.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// ideia: usar filter para diminuir a quantidade de chamadas
@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findByTeam_name(teamName);
    }

    // precisa passar pra lowercase
    public List<Player> getPlayersFromName(String playerName) {
        return playerRepository.findByPlayer_nameContaining(playerName);
    }

    public List<Player> getPlayersFromPosition(String position) {
        return playerRepository.findByPosition(position);
    }

    public List<Player> getPlayersFromNation(String nation) {
        return playerRepository.findByNation(nation);
    }

    public List<Player> getPlayersFromTeamAndPosition(String teamName, String position) {
        return playerRepository.findByTeam_nameAndPosition(teamName, position);
    }
}
