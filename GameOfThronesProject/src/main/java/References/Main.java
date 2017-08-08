package References;

import game.SetupGame;
import gameversion.GameVersion;
import gameversion.StandardVersion;

import java.io.IOException;

/**
 * Created by Scott on 1/26/2017.
 */
public class Main {

    public static void main(String[] args){
//        References references = new References();
//        StandardVersion standardVersion = new StandardVersion(3, references);
//        standardVersion.initalize();
        SetupGame t = new SetupGame(new StandardVersion(), 3);
        t.setUp();
        System.out.println(t.getLandTerritoryNameMap().get(References.WINTERFELL));
    }
}
