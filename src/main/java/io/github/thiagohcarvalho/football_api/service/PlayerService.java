package io.github.thiagohcarvalho.football_api.service;

import io.github.thiagohcarvalho.football_api.entity.Player;
import io.github.thiagohcarvalho.football_api.repository.PlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

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

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findByName(updatedPlayer.getName());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatedPlayer.getName());
            playerToUpdate.setTeam_name(updatedPlayer.getTeam_name());
            playerToUpdate.setPosition(updatedPlayer.getPosition());
            playerToUpdate.setNation(updatedPlayer.getNation());

            return playerRepository.save(playerToUpdate);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Player not found");
        // implement custom exceptions - NotFound
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
}
