package com.example.harsh.octiontestproject;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CurrentItemFragment extends Fragment {
    RecyclerView currentItemRecyclerView;

    public CurrentItemFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_current_item, container, false);
        currentItemRecyclerView=(RecyclerView)v.findViewById(R.id.current_item_recyclerview);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        currentItemRecyclerView.setLayoutManager(layoutManager);
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<List<ItemDatum>> call = apiService.getAuctionsData();
        call.enqueue(new Callback<List<ItemDatum>>() {
            @Override
            public void onResponse(Call<List<ItemDatum>>call, Response<List<ItemDatum>> response) {
                List<ItemDatum> data = response.body();
                CurrentItemAdapter currentItemAdapter= new CurrentItemAdapter(data,CurrentItemFragment.this.getActivity());
                currentItemRecyclerView.setAdapter(currentItemAdapter);
            }

            @Override
            public void onFailure(Call<List<ItemDatum>>call, Throwable t) {
                // Log error here since request failed
            }
        });
        return v;
    }


}
