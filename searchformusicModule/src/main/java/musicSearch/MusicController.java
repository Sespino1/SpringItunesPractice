package musicSearch;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MusicController {

    MusicModel musicModel = new MusicModel();
//    ArrayList<Artist> artistData = musicModel.getArtistData();
//    name = artistData.get(0).getArtistName();


    @RequestMapping("/musicSearch")
    public Artist artist(@RequestParam(value = "artistName", defaultValue = "") String artistName,
                         @RequestParam(value = "trackName", defaultValue = "") String trackName,
                         @RequestParam(value = "currency", defaultValue = "") String currency,
                         @RequestParam(value = "collectionPrice", defaultValue = "") String collectionPrice,
                         @RequestParam(value = "primaryGenreName", defaultValue = "") String primaryGenreName,
                         @RequestParam(value = "isStreamable", defaultValue = "") String isStreamable) {

        return new Artist(artistName,
                trackName,
                currency,
                collectionPrice,
                primaryGenreName,
                isStreamable);

    }

//    @RequestMapping("/musicSearch")
//    public String books(@RequestParam("artistName") String artistName, Model model){
//        //business logic...
//        MusicModel musicModel = new MusicModel();
//        model.addAttribute("artistName", musicModel.getArtistValues().get(0));
//        return musicModel.getArtistValues().get(0);
//    }


}
