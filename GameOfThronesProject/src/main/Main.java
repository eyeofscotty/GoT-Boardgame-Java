package main;

import References.References;
import game.Game;
import gameversion.StandardVersion;

/**
 * Created by Scott on 1/26/2017.
 */
public class Main {

    public static void main(String[] args){
        References references = new References();
        StandardVersion standardVersion = new StandardVersion(3, references);
        standardVersion.initalize();

        System.out.println(references.Stark.getSupply());
    }
}
