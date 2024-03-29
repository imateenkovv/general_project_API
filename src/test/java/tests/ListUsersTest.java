package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static helpers.ConstantsEndpoints.LIST_USERS;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static specs.ListUsersSpec.listUsersRequestSpec;
import static specs.ListUsersSpec.listUsersResponseSpec;
import static testData.ListUsersTestData.*;


/**
 * @author mateenkov
 */

public class ListUsersTest {

    @Test
    void listUsersTest() {

        given(listUsersRequestSpec)
                .when()
                .get(LIST_USERS)
                .then()
                .spec(listUsersResponseSpec)
                .body(SUPPORT_URL, is(SUPPORT_URL_VALUE))
                .body(SUPPORT_TEXT, is(SUPPORT_TEXT_VALUE));
    }
}
