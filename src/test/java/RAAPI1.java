import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class RAAPI1 {


    @Test
    void APITEST() {

// GET Employee records | Print API
        Response response;
        response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
        System.out.println("Status Code: " + response.getStatusCode());
        //System.out.println("Response: " + response.asString());
        //System.out.println("Body: " + response.getBody());

       // Assert.assertFalse("employee_name".equals("Tiger Nixon"));

    }

    @Test
    void whentest (){

       String name = given().queryParam("","")
                .when().get("https://dummy.restapiexample.com/api/v1/employee/1")
                .then().extract().path("data.employee_name");
       System.out.println(name);
       Assert.assertTrue(name.equals("Tiger Nixon"));
    }
// Test Cases
    @Test
    void employee(){

        System.out.println("Im performing test steps 1");
    }
    @Test
    void teststeps(){

        System.out.println("Im performing test steps");
    }
    @Test
    void teardown(){

        System.out.println("Im tearing down the project");


    }
}


