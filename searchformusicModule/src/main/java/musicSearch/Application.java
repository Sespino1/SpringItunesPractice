package musicSearch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        System.out.println("Enter artist name:");
        Scanner scn = new Scanner(System.in);
        String artist = scn.nextLine();
        MusicModel musicModel = new MusicModel();
        musicModel.makeItunesAPICall(artist);

        SpringApplication.run(Application.class, args);
        log.info(artist.toString());

//        RestTemplate restTemplate = new RestTemplate();
//
//        ResponseEntity<List<Artist>> itunesResponse =
//                restTemplate.exchange("https://itunes.apple.com/search?term="+artist,
//                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Artist>>() {
//                        });
//        List<Artist> rates = itunesResponse.getBody();
//        MediaType contentType = itunesResponse.getHeaders().getContentType();
//        HttpStatus statusCode = itunesResponse.getStatusCode();

    }


}
