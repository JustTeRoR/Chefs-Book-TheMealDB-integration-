package com.justterror.chefsbook.api;

import com.justterror.chefsbook.model.Categories;
import com.justterror.chefsbook.model.Meals;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface FoodApi {
    //using this because don't have rights for full subscribe of API
    @GET("filter.php?a=Canadian")
    Call<Meals> getMeal();

    @GET("categories.php")
    Call<Categories> getCategories();

    @GET("filter.php") 
    Call<Meals> getMealByCategory(@Query("c") String category);

    @GET("search.php")
    Call<Meals> getMealByName(@Query("s") String mealName);
}   
