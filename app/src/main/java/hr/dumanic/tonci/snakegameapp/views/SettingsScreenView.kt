package hr.dumanic.tonci.snakegameapp.views

import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun SettingsScreen(navController: NavController) {

    Surface {
        Text("This is settings screen")

        Button(onClick = { navController.popBackStack()}) {
            Text("Back")
        }

    }

}