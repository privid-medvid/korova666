package restclient;


import restclient.utils.CookieStorage;
import com.sun.org.apache.xml.internal.security.utils.Base64;
import org.apache.wink.client.ClientResponse;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dshegera on 12/24/2014
 */

public class AlmRestClient {
    public static CookieStorage cookieStorage = new CookieStorage();
    public void login(String almRestUri, String user, String password){
        RestClient client = new RestClient();
        ClientResponse authResponse = client.resource(almRestUri + "authentication/sign-in")
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", "Basic " + Base64.encode((user + ":" + password).getBytes()))
                .get();
        cookieStorage.rememberCookies(authResponse);
    }
    public void logout(String almRestUri){
        RestClient client = new RestClient();
        ClientResponse authResponse = client.resource(almRestUri + "authentication/sign-out")
                .accept(MediaType.APPLICATION_JSON)
                .get();
    }
    public Map<String,String> sendRequest(String URL, String Method, String Body, Map<String,String> Headers){
        RestClient client = new RestClient();
        Map<String,String> res = new HashMap<>();
        Resource requestResource = client.resource(URL);
        cookieStorage.applyCookies(requestResource);
        switch(Method) {
            case "GET": ClientResponse responseGet = requestResource
                    .accept(MediaType.APPLICATION_JSON)
                    .get();
                for(Map.Entry<String, List<String>> element : responseGet.getHeaders().entrySet()){
                }
//res.put("Headers",responseGet.getHeaders());
                res.put("StatusCode",String.valueOf(responseGet.getStatusCode()));
                res.put("Body",responseGet.getEntity(String.class));
                return res;
            case "POST":
                ClientResponse responsePost = requestResource
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .post(Body);
                res.put("StatusCode",String.valueOf(responsePost.getStatusCode()));
                res.put("Body",responsePost.getEntity(String.class));
                return res;
            case "PUT":
                ClientResponse responsePut = requestResource
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .put(Body);
                res.put("StatusCode",String.valueOf(responsePut.getStatusCode()));
                res.put("Body",responsePut.getEntity(String.class));
                return res;
            case "DELETE":
                ClientResponse responseDelete = requestResource
                        .accept(MediaType.APPLICATION_JSON)
                        .delete();
                res.put("StatusCode",String.valueOf(responseDelete.getStatusCode()));
                res.put("Body",responseDelete.getEntity(String.class));
                return res;
        }
        return null;
    }
}