import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MojeTesty {

    @Test
    public void prvniTest(){

        System.out.println("Prvni test je ok");
    }

    @Test
    public void druhyTest(){
        MojeTrida mojeTrida = new MojeTrida();
        mojeTrida.run();
    }

    @Test
    @Disabled
    public void tretiTest(){

        int x = 1/0;
    }
}
