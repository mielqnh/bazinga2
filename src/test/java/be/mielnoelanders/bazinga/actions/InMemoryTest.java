package be.mielnoelanders.bazinga.actions;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


//extenden van in memory test en testen laten eindigen op InMemoryTest
//dit om aan te duiden dat het een InMemoryTest is :-)
// zo weet je dat die test een springcontext gaat opstarten en DB operaties gaat uitvoeren
// in tegenstelling tot een UnitTest die enkel bedoeld is om methods af te testen zonder dat
// er een springcontext voor nodig is
@RunWith(SpringRunner.class)
@SpringBootTest
public abstract class InMemoryTest {


}
