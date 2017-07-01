package References;

import java.io.IOException;

/**
 * Created by Scott on 1/26/2017.
 */
public class Main {

    public static void main(String[] args){
//        References references = new References();
//        StandardVersion standardVersion = new StandardVersion(3, references);
//        standardVersion.initalize();

        TestingInitialize t = new TestingInitialize();

        try {
            t.convertJSON();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
