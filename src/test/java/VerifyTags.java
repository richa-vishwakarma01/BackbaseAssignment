//import CommonUtils.RestClient;

import CommonUtils.Endpoints;
import ExecutionReports.CustomReporter;
import Models.Response.TagsResponse;
import TestConfig.BaseTest;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

@Listeners(CustomReporter.class)
class VerifyTags extends BaseTest {

//Verify the status code 200 is returned when uer hits the request
@Test(enabled=true, priority = 0)
    public void verify_all_tags_are_fetched() throws IOException {
   Response res= restManger.setBaseUri("BaseUri", Endpoints.getTags).setHeaders("Authorization","Basic Y2FuZGlkYXRleDpxYS1pcy1jb29s")
    .build().getRequest();
    setResponsemap("getResponse", res);
    Assert.assertEquals(getResponseMap("getResponse").getStatusCode(),200);

}

    //Verify the matrix tage is present in the response recieved
    @Test(enabled=true, priority=1 )
    public void verify_Matrix_tag_is_present() throws IOException {
        Assert.assertTrue(getResponseMap("getResponse").getBody().as(TagsResponse.class).getTags().contains("matrix"));

    }



}
