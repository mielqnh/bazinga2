package be.mielnoelanders.bazinga.actions;

import be.mielnoelanders.bazinga.actions.to.GameAssembler;
import be.mielnoelanders.bazinga.actions.to.GameTO;
import be.mielnoelanders.bazinga.domain.Game;
import be.mielnoelanders.bazinga.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GameActions {

    @Autowired
    private GameRepository gameRepository;



    public void addNewGame(GameTO gameTO){
        Game game = GameAssembler.assembleEntity(gameTO);
        gameRepository.save(game);
    }


    public List<GameTO> zoekAlleGames(){
        return gameRepository.findAll().stream().map(GameAssembler::assembleTO)
                .collect(Collectors.toList());
    }

}
