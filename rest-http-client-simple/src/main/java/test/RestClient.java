package test;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {

    public static void main(String [] args) throws IOException {

        // pobieramy jsona z jakiegoś zewnętrznego api
        URL url = new URL("https://api.thecatapi.com/v1/breeds");
        InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
        inputStreamReader
    }
}
