package hr.dumanic.tonci.snakegameapp.views

import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ScoresScreen(navController: NavController) {

    Surface {
        Text("This is scores screen")

        Button(onClick = { navController.popBackStack()}) {
            Text("Back")
        }

    }

}