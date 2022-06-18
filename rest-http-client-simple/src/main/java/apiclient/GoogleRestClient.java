package apiclient;

import apiclient.googlemodel.GooglePlace;
import apiclient.googlemodel.Result;
import com.google.gson.Gson;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GoogleRestClient {

    private static final String URL = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&types=food&key=AIzaSyAVil-0kKruoZkZHYhn3GNavbuEki4Jc4s";

    @Test
    public void test() throws IOException {

        URL url = new URL(URL);
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
        GooglePlace googlePlace = new Gson().fromJson(inputStreamReader, GooglePlace.class);
        System.out.println(googlePlace);

        System.out.println("Results: " + googlePlace.getResults());

        googlePlace.getResults().stream()
                .forEach(result -> System.out.println(result.getName()));
    }
}




































