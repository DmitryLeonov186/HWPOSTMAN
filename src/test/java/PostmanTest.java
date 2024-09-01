import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class PostmanTest {

    @Test
    public void PostRawTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("API тест")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(100));

    }
}