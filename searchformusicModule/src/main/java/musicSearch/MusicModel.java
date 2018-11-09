package musicSearch;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.util.ArrayList;

public class MusicModel {

    private OkHttpClient client = new OkHttpClient();
    private String url = "https://itunes.apple.com/search?term=";
    private String responseString;

    private String artistName;
    private String trackName;
    private String currency;
    private String collectionPrice;
    private String primaryGenreName;
    private String isStreamable;

    public ArrayList<String> artistData = new ArrayList<>();


    public void makeItunesAPICall(String artist){
        Request request = new Request.Builder()
                .url(url+artist)
                .build();
        try{
            Response response = client.newCall(request).execute();
            responseString =response.body().string();
            parseJson();
        }catch(Exception e){
            e.printStackTrace();
        }

    }


    public void parseJson(){
        JsonElement jsonElement = new JsonParser().parse(responseString); //turning into parse tree
        JsonObject jsonObject = jsonElement.getAsJsonObject(); //turning it into a jsonObject
        JsonArray jsonArray = jsonObject.getAsJsonArray("results"); // turning it into a json array
        //get top 5 songs

        for (int i = 0; i < 1; i++) {
            jsonObject = jsonArray.get(i).getAsJsonObject(); //accessing array and storing in object

            System.out.println(jsonObject);
            artistName = jsonObject.get("artistName").getAsString();
            trackName = jsonObject.get("trackName").getAsString();
            currency = jsonObject.get("currency").getAsString();
            collectionPrice = jsonObject.get("collectionPrice").getAsString();
            primaryGenreName = jsonObject.get("primaryGenreName").getAsString();
            isStreamable = jsonObject.get("isStreamable").getAsString();

//            MusicController musicController = new MusicController();
//            musicController.artist(artistName,trackName,currency,collectionPrice,primaryGenreName,isStreamable);
            artistData.add(artistName);
            artistData.add(trackName);
            artistData.add(currency);
            artistData.add(collectionPrice);
            artistData.add(primaryGenreName);
            artistData.add(isStreamable);

        }
    }

    public ArrayList<String> getArtistValues(){
        return artistData;
    }

//    public ArrayList<Artist> getArtistData(){
//        return artistData;
//    }


}
