import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Test {
    @BeforeEach
    public void setUp() {
        calc = new StringCalculator();
    }



   

    @Test
    public void testCount4() {
        calc.add("1, 2,3,4");
    }

    @Test
    public void add2(){
        calc.add("-3,1,1000");
    }

}
