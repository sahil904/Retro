package com.example.sahil.retro.extra;

import com.example.sahil.retro.interfaces.Api;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class Retro {
    public static Api api(){
        return new Retrofit.Builder().baseUrl("http://spffacilities.com/").addConverterFactory(GsonConverterFactory.create()).build().create(Api.class);
    }

}
