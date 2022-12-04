package com.example.restaurantreviewretrofit.API

import com.example.restaurantreviewretrofit.PostReviewResponse
import com.example.restaurantreviewretrofit.RestaurantResponse
import retrofit2.Call
import retrofit2.http.*
//Service Use for Request Methode from API. And Data will temp by Response
interface ApiService{
    @GET("detail/{id}") //@Get
    fun getRestaurant(
        @Path("id") id: String): Call<RestaurantResponse>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review") //@Post
    fun postReview(
        @Field("id") id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ):Call<PostReviewResponse>
}
