package apiclient;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class RestGoogleClient {

    private static final String URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&types=food&key=AIzaSyAVil-0kKruoZkZHYhn3GNavbuEki4Jc4s";

    @Test
    public void test() throws IOException {

        URL url = new URL(URL);
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());


    }
}




































