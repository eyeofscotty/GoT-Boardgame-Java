package game;

import References.Initialize;
import References.References;
import gameversion.GameVersion;
import gameversion.StandardVersion;

/**
 * Created by Scott on 1/26/2017.
 */
public class Game {
    References references = new References();
    StandardVersion standardVersion;

    public void newGame(int numPlayers){
        StandardVersion standardVersion = new StandardVersion(numPlayers, references);

    }


}
