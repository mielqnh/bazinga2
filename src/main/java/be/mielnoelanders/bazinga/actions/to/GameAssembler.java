package be.mielnoelanders.bazinga.actions.to;

import be.mielnoelanders.bazinga.domain.Game;

public class GameAssembler {

    //dit is wel wat overhead omdat er op dit moment 2 keer hetzelfde staat
    // Game Vs GameTO doet ongeveer hetzelfde
    // maar hier zie je dat het wel mooi gescheiden wordt
    // de services (acties) nemen als parameter een TO binnen en kunnen TOs teruggeven
    // de buitenwereld moet dus niet weten hoe dit intern wordt opgeslagen
    // enkel de service zelf mag met de repositories communiceren
    public static Game assembleEntity(GameTO gameTO){
        return Game.newBuilder().withEdition(gameTO.getEdition())
                .withOfficielePrijsInEurocent(gameTO.getOfficielePrijsInEurocent())
                .withTitle(gameTO.getTitle())
                .build();
    }


    public static GameTO assembleTO(Game game){
        return GameTO.newBuilder().withEdition(game.getEdition())
                .withOfficielePrijsInEurocent(game.getOfficielePrijsInEurocent())
                .withTitle(game.getTitle())
                .build();
    }

}
