package musicSearch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Artist {

    public Artist(String artistName, String trackName, String currency, String collectionPrice, String primaryGenreName, String isStreamable) {
        this.artistName = artistName;
        this.trackName = trackName;
        this.currency = currency;
        this.collectionPrice = collectionPrice;
        this.primaryGenreName = primaryGenreName;
        this.isStreamable = isStreamable;
    }

    public String artistName;
    public String trackName;
    public String currency;
    public String collectionPrice;
    public String primaryGenreName;
    public String isStreamable;


    public String getArtistName() {
        return artistName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCollectionPrice() {
        return collectionPrice;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public String getIsStreamable() {
        return isStreamable;
    }


    @Override
    public String toString() {
        return "Artist Name: " + artistName +
                "Track Name: " + trackName +
                "Currency: " + currency +
                "Collection Price: " + collectionPrice +
                "Primary Genre Name: " + primaryGenreName +
                "Is It Streamable: " + isStreamable;
    }

}
