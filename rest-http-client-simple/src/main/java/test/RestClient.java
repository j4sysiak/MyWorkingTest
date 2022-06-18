package test;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {

    public static void main(String [] args) throws IOException {

        // pobieramy jsona z jakiegoś zewnętrznego api  (https://github.com/public-apis/public-apis)
        URL url = new URL("https://cat-fact.herokuapp.com/facts/random");
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());

        CatFact catFact = new Gson().fromJson(inputStreamReader, CatFact.class);

        System.out.println(catFact);
    }
}




































