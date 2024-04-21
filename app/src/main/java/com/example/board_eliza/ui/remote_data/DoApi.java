package com.example.board_eliza.ui.remote_data;

import com.example.board_eliza.ui.models.ModelDo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DoApi {
    @GET("api/activity")
    Call<ModelDo> getActivities();
        @GET("api/activity/{key}")
        Call<ModelDo> getActivitityByKey(
                @Query("key") String key);
        @GET("api/activity?price")
        Call<ModelDo> getActivitityByPrice(
                @Query("price") double price);
        @GET("api/activity?link")
        Call<ModelDo> getActivitityByLink(
                @Query("link") String link);
}
