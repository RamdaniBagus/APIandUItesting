package api.tests;

import api.utils.ApiConfig;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetUserTest {

    @Test
    public void getUsersPage2() {

        RestAssured.baseURI = ApiConfig.BASE_URL;

        int page =
                given()
                        .header("x-api-key", ApiConfig.API_KEY)
                        .when()
                        .get("/users?page=2")
                        .then()
                        .statusCode(200)
                        .extract()
                        .jsonPath()
                        .getInt("page");

        Assert.assertEquals(page, 2);
    }
}
