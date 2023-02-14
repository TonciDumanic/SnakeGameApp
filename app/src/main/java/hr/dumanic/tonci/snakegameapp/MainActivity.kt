package hr.dumanic.tonci.snakegameapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import hr.dumanic.tonci.snakegameapp.ui.theme.SnakeGameAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SnakeGameAppTheme {
            }
        }
    }
}

@Composable
fun MainScreen() {

    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column( modifier = Modifier.padding(top = 10.dp,
                                            bottom = 10.dp,
                                            end = 10.dp,
                                            start = 10.dp),
            verticalArrangement = Arrangement.Top) {


            Text(
                text = "MIGHTY SNAKE",
                modifier = Modifier
                    .padding(5.dp)
                    .align(CenterHorizontally),
                style = TextStyle(
                    fontSize = 40.sp,
                    shadow = Shadow(
                        color = Color.Red,
                        blurRadius = 3f
                    )))


            Column(Modifier.padding(top=30.dp,end = 10.dp,start = 10.dp),verticalArrangement = Arrangement.SpaceEvenly) {

                TextField(value = "Enter your name...", modifier = Modifier.align(CenterHorizontally), onValueChange = {})

                Button(modifier = Modifier.padding(top = 10.dp).align(CenterHorizontally),onClick = { /*TODO*/ }) {
                    Text("New game")
                }
                Button(modifier = Modifier.padding(top = 10.dp).align(CenterHorizontally),onClick = { /*TODO*/ }) {
                    Text("Scores")

                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()

}