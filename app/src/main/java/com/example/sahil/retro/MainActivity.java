package com.example.sahil.retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.sahil.retro.adapter.RecyclerViewAdapter;
import com.example.sahil.retro.extra.Retro;
import com.example.sahil.retro.model.SPModel;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity implements Callback<SPModel> {

    RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<SPModel.BannerBean> bannerBean = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewAdapter = new RecyclerViewAdapter(bannerBean);
        recyclerView.setAdapter(recyclerViewAdapter);
        Retro.api().SP_MODEL_CALL().enqueue(this);
    }

    @Override
    public void onResponse(Response<SPModel> response, Retrofit retrofit) {
        if (response.body() != null){
            SPModel spModel = response.body();
            bannerBean.clear();
            bannerBean.addAll(spModel.getBanner());
            recyclerViewAdapter.notifyDataSetChanged();
        }
    }


    public void onFailure(Throwable t) {

    }
}
