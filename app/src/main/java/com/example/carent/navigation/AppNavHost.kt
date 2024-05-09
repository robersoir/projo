package com.example.Carent.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.carent.screens.explore.ProductListScreen
import com.example.carent.ui.theme.screens.addcars.AddScreen
//import com.example.carent.ui.theme.screens.addcars.ExploreScreen
import com.example.carent.ui.theme.screens.favourite.FavouriteScreen
import com.example.carent.ui.theme.screens.homepage.HomePage
import com.example.carent.ui.theme.screens.splashscreen.SplashScreen
import com.example.carent.ui.theme.screens.start.StartScreen
import com.example.carent.ui.theme.screens.users.ProfileScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = SPLASH_URL
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
//        composable(LOGIN_URL){
//            LoginScreen(navController = navController)
//        }
//        composable(SIGNUP_URL){
//            SignupScreen(navController = navController)
//        }
//        composable(HOME_URL){
//            HomeScreen(navController = navController)
//        }
//        composable(ADD_PRODUCTS_URL){
//            AddProductsScreen(navController = navController)
//        }
//        composable(VIEW_PRODUCTS_URL){
//            ViewProductsScreen(navController = navController)
//        }
        composable(START_URL){
           StartScreen(navController = navController, )
        }
        composable(SPLASH_URL){
            SplashScreen(navController = navController, )
        }
        composable(HOMEPAGE_URL){
            HomePage(navController = navController, )
        }
        composable(ADD_URL){
AddScreen(navController = navController) {
    
}
        }
        composable(FAVOURITE_URL){
            FavouriteScreen(navController = navController, )
        }
        composable(PROFILE_URL) {
            ProfileScreen(navController = navController,)
        }


        composable(PRODUCTLIST_URL) {
            ProductListScreen(navController = navController, products = listOf())
        }


//        composable("productDetail/{productId}") { backStackEntry ->
//            val productId = backStackEntry.arguments?.getString("productId") ?: ""
//            ProductDetailScreen(navController, productId)
//            }





    }
}