import org.junit.jupiter.api.*;

public class MainTest {

    @Test
    void verificaTrue(){
        Assertions.assertTrue(Main.calculeaza(6533).equals("DA"));
    }
    @Test
    void verificaFalse(){
        Assertions.assertTrue(Main.calculeaza(6282).equals("NU"));
    }

}
