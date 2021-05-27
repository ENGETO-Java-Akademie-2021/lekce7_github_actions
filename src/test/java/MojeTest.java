import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MojeTest {

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
    public void tretiTest(){

        int x = 1/0;
    }
}
