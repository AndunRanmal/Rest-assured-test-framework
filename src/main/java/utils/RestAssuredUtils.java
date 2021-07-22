package utils;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public final class RestAssuredUtils {

    private RestAssuredUtils() {
    }

    public static ValidatableResponse delete(RequestSpecification request) {
        return getGivenWhen(request)
                .delete()
                .then();
    }

    public static ValidatableResponse post(RequestSpecification request) {
        return getGivenWhen(request)
                .post()
                .then();
    }

    public static ValidatableResponse put(RequestSpecification request) {
        return getGivenWhen(request)
                .put()
                .then();
    }

    public static ValidatableResponse get(RequestSpecification request) {
        return getGivenWhen(request)
                .get()
                .then();
    }

    public static ValidatableResponse patch(RequestSpecification request) {
        return getGivenWhen(request)
                .patch()
                .then();
    }

    private static RequestSpecification getGivenWhen(RequestSpecification request) {
       return given().spec(request.filter(new AllureRestAssured())).when();
    }
}
