package hr.dumanic.tonci.snakegameapp.views

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import hr.dumanic.tonci.snakegameapp.game.Game
import hr.dumanic.tonci.snakegameapp.playerName
import java.time.LocalDateTime


@Composable
fun GamePlayScreen(navController: NavController) {

    var myGame = Game(
        playerName,
        LocalDateTime.now(),
        LocalDateTime.now().plusMinutes((1..5).random().toLong()),
        (0..77).random()
    )

    Surface(modifier = Modifier.fillMaxSize()) {


        Row(modifier = Modifier.fillMaxSize()) {

            Text("This is gameplay screen Game: $myGame")





            Button(onClick = { navController.popBackStack() }) {
                Text("Back")
            }
        }
    }


}