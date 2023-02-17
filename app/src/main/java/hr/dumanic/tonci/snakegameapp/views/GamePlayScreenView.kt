package hr.dumanic.tonci.snakegameapp.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import hr.dumanic.tonci.snakegameapp.enums.SnakeGameAppScreen


@Composable
fun GamePlayScreen(navController: NavController) {

    Surface(modifier = Modifier.fillMaxSize(), color = Color.Red ){


        Row(modifier = Modifier.fillMaxSize() ) {
            Text("This is gameplay screen")

            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
        }
    }


}