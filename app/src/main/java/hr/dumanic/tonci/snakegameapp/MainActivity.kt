package hr.dumanic.tonci.snakegameapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import hr.dumanic.tonci.snakegameapp.enums.SnakeGameAppScreen
import hr.dumanic.tonci.snakegameapp.ui.theme.SnakeGameAppTheme
import hr.dumanic.tonci.snakegameapp.views.GamePlayScreen
import hr.dumanic.tonci.snakegameapp.views.MainScreen
import hr.dumanic.tonci.snakegameapp.views.ScoresScreen
import hr.dumanic.tonci.snakegameapp.views.SettingsScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            setContent {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = SnakeGameAppScreen.Main.name,
        modifier = Modifier,
        builder = {
            composable(route = SnakeGameAppScreen.Main.name) { MainScreen(navController) }
            composable(route = SnakeGameAppScreen.GamePlay.name) {
                GamePlayScreen(
                    navController
                )
            }
            composable(route = SnakeGameAppScreen.Scores.name) {
                ScoresScreen(
                    navController
                )
            }
            composable(route = SnakeGameAppScreen.Settings.name) {
                SettingsScreen(
                    navController
                )
            }
        })

}
