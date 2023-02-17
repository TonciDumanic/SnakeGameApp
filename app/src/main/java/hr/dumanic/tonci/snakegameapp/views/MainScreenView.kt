package hr.dumanic.tonci.snakegameapp.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import hr.dumanic.tonci.snakegameapp.constants.DEFAULT_PLAYER_NAME
import hr.dumanic.tonci.snakegameapp.enums.SnakeGameAppScreen
import hr.dumanic.tonci.snakegameapp.playerName


@Composable
fun MainScreen(navController: NavController) {

    //var viewModel: MainScreenViewModel by viewModel()




    // A surface container using the 'background' color from the theme

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {



        Column(
            modifier = Modifier
                .padding(
                    top = 10.dp,
                    bottom = 10.dp,
                    end = 10.dp,
                    start = 10.dp
                )
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {


            Text(
                text = "MIGHTY SNAKE",
                modifier = Modifier
                    .padding(5.dp)
                    .align(Alignment.CenterHorizontally),
                style = TextStyle(
                    fontSize = 40.sp,
                    shadow = Shadow(
                        color = Color.Red,
                        blurRadius = 3f
                    )
                )
            )


            Column(
                Modifier
                    .padding(top = 30.dp, end = 10.dp, start = 10.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                var valueOfNameTextField by remember { mutableStateOf(DEFAULT_PLAYER_NAME) }

                OutlinedTextField(

                    value = valueOfNameTextField,
                    onValueChange = { valueOfNameTextField = it
                                    playerName = valueOfNameTextField},
                    singleLine = true,
                    label = { Text("Please enter your name:") }
                )
                Button(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.CenterHorizontally),
                    onClick = { navController.navigate(SnakeGameAppScreen.GamePlay.name) }) {
                    Text("New game")
                }
                Button(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.CenterHorizontally),
                    onClick = { navController.navigate(SnakeGameAppScreen.Scores.name) }) {
                    Text("Scores")

                }
                Button(
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .align(Alignment.CenterHorizontally),
                    onClick = { navController.navigate(SnakeGameAppScreen.Settings.name) }) {
                    Text("Settings")

                }
            }


        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   // MainScreen()

}