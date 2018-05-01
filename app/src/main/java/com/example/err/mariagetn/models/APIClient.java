package com.example.err.mariagetn.models;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by err on 26/04/2018.
 */

public class APIClient {
    private static Retrofit retrofit;

    static Retrofit getClient() {


        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.1.40:3000")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        return retrofit;
    }

}

