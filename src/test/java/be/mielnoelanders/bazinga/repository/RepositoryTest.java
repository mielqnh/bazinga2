package be.mielnoelanders.bazinga.repository;

import be.mielnoelanders.bazinga.actions.InMemoryTest;
import be.mielnoelanders.bazinga.domain.Game;
import be.mielnoelanders.bazinga.domain.Parameter;
import org.junit.Assert;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.core.Is.is;

public class RepositoryTest extends InMemoryTest{

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private ParameterRepository parameterRepository;

    @Ignore("Deze test is enkel om te testen of er aparte id sequences gebruikt worden. deze test kan falen als" +
            " deze in combinatie met andere testen gedraaid worden daarom op @Ignore")
    public void testIdGenerator(){
        Game game = Game.newBuilder().withTitle("game").build();
        gameRepository.save(game);
        Assert.assertThat(game.getId(), is(1));

        Parameter parameter = new Parameter();
        parameter.setType("type");
        parameterRepository.save(parameter);
        Assert.assertThat(game.getId(), is(1));

    }
}
