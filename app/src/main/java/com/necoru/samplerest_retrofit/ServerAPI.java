package com.necoru.samplerest_retrofit;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by NecoRu on 01.11.2017.
 */

public interface ServerAPI {
    @GET("photos")
    Call<ArrayList<Photos>> getListPhotos();
}
