package be.mielnoelanders.bazinga.actions;

import be.mielnoelanders.bazinga.actions.to.GameTO;
import be.mielnoelanders.bazinga.repository.GameRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class GameActionsInMemoryTest extends InMemoryTest {

    @Autowired
    private GameActions gameActions;

    @Autowired
    private GameRepository gameRepository;

    @Test
    public void iCanAddANewGame() {
        gameActions.addNewGame(makeGameForTest(1));
        assertThat(gameRepository.count(), is(1L));
    }

    @Test
    public void iCanListAllGames() {
        createNumberOfGames(100);
        List<GameTO> games = gameActions.zoekAlleGames();
        assertThat(games.size(), is(100));
        assertThat(games.get(0).getTitle(), is("GAME-1"));
    }

    private void createNumberOfGames(int i) {
        IntStream.rangeClosed(1, i).forEach(index -> gameActions.addNewGame(makeGameForTest(index)));
    }


    private GameTO makeGameForTest(int index) {
        return GameTO.newBuilder()
                .withEdition(1)
                .withTitle("GAME-" + index)
                .withOfficielePrijsInEurocent(10000)
                .build();
    }
}
