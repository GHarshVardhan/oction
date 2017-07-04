
package com.example.harsh.octiontestproject;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ItemDatum {

    @SerializedName("auction")
    @Expose
    private Auction auction;
    @SerializedName("media")
    @Expose
    private List<Medium> media = null;

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }

}
