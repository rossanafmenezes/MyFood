package com.example.myfood.data


import com.example.myfood.data.network.FoodRecipesApi
import com.example.myfood.models.FoodRecipe
import retrofit2.Response
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val foodRecipesApi: FoodRecipesApi
) {

   suspend fun getRecipes(queries: Map< String, String>): Response<FoodRecipe>{
        return foodRecipesApi.getRecipes(queries)
    }
}