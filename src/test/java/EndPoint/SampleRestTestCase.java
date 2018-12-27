package EndPoint;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

public class SampleRestTestCase {

    private static String HOST = "https://reqres.in/";
    private static String PATH = "";

    private static RestAssured restAssured = new RestAssured();

    private static void setHOST() {
        restAssured.baseURI = HOST;
    }

    private static void setPATH() {
        restAssured.basePath = PATH;
    }

    private static void setContentType(ContentType Type) {
        given().contentType(Type);
    }

    public static Response getResponse() {
        return get();
    }

    public static void main(String[] args) {
        SampleRestTestCase sampleRestTestCase = new SampleRestTestCase();
        sampleRestTestCase.PATH = "/api/users?page=2";
        sampleRestTestCase.setHOST();
        sampleRestTestCase.setPATH();
        sampleRestTestCase.setContentType(ContentType.JSON);
        Response resp = sampleRestTestCase.getResponse();
        String json = resp.asString();
        System.out.println(json);
    }
}
