package com.example.sahil.retro.interfaces;

import com.example.sahil.retro.model.SPModel;

import retrofit.Call;
import retrofit.http.GET;

public interface Api {
    @GET("Admin_pannel/json/banner.php")
    Call<SPModel> SP_MODEL_CALL();
}
