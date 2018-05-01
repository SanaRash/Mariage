package com.example.err.mariagetn.dao;

import com.example.err.mariagetn.dao.User;

import java.io.IOException;
import java.util.List;

import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;



public interface IUser {


    @GET("/user/all")
      Call<List<User>> getAllUser();

    @GET("/user/login")
    Call<List<User>> getUserByEmailandPassword(@Query("user_email") String mail,@Query("user_pass")String password);

}
