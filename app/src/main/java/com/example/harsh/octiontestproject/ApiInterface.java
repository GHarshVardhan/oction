package com.example.harsh.octiontestproject;

/**
 * Created by Harsh on 04-07-2017.
 */


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface ApiInterface {

    @GET("auctions")
    Call<List<ItemDatum>> getAuctionsData();


}