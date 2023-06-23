import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class POSTAPITest {

    @BeforeAll
    public static void setup(){
        //RestAssured.baseURI=("https://dummy.restapiexample.com/api/v1/create");
    }

    @Test
    void postRequest() {
        // API post body Params
        String requestBody = "{\n" +
                " \"name\": \"eljin\",\n" +
                " \"salary\": \"1000000\",\n" +
                " \"age\": \"21\" \n}";
        Response response = given()
                .header("Content-Type", "application/json")
                .and()
                .body(requestBody)
                .when()
                .post("https://dummy.restapiexample.com/api/v1/create")
                .then()
                .extract().response();

        //Assert - Status Code - Name - Salary - Age
        Assertions.assertEquals(200,response.statusCode());
        Assertions.assertEquals("name", response.jsonPath().getString("eljin"));
        //assertEquals("1000000", response.jsonPath().getString("salary"));
        //assertEquals("21", response.jsonPath().getString("age"));



        // API Verify Print
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response: " + response.asPrettyString());
        System.out.println("Body: " + response.getBody());
        System.out.println("Header:" +response.getHeader("Content-Type"));




    }

}
