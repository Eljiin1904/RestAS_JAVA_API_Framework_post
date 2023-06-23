import org.testng.annotations.Test;

public class RA_API1 {

    @Test
    void setup(){

        System.out.println("Im inside setp");
    }
    @Test
    void teststeps(){
        System.out.println("Im inside steps");
    }
    @Test
    void teardown(){

        System.out.println("Im inside teardown");
    }
}
