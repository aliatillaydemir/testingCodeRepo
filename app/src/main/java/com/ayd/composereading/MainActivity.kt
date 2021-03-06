package com.ayd.composereading

import android.graphics.drawable.ColorStateListDrawable
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayd.composereading.ui.theme.ComposeReadingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeReadingTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {

    Scaffold( 
        topBar = {
            TopAppBar(
                title = { Text(text = "Title")},
                backgroundColor = colorResource(id = R.color.renk),
                contentColor = colorResource(id = R.color.white)
            ) 



        },content = {
          Column(
              modifier = Modifier.fillMaxSize(),
              verticalArrangement = Arrangement.SpaceEvenly,
              horizontalAlignment = Alignment.CenterHorizontally
          ) {
              Column(horizontalAlignment = Alignment.CenterHorizontally) {

                  Image(painter = painterResource(id = R.drawable.cicek),
                      contentDescription = "")

                  Text(
                      text = "??i??ek",
                      color = Color.Magenta,
                      fontWeight = FontWeight.ExtraBold,
                      fontSize = 25.sp
                  )
              }
              Text(text = "??i??ekler ??zeldir, g??zeldir. sevin onlar??, onlar renk renktir. toprak su ate?? bla bla." +
                      "??i??ekler ??zeldir, g??zeldir. sevin onlar??, onlar renk renktir. toprak su ate??. bu ate?? ??fleyerek s??nmez."+
                  "yeni bir ??i??ek, yeni bir g??n demektir fakat ??i??ekler solmaz bazen.",
                  modifier = Modifier.padding(top = 5.dp, end = 10.dp),
                  textAlign = TextAlign.Center
              )
              Button(onClick = {
                  Log.e("Button","t??kland??")
              },
              colors = ButtonDefaults.buttonColors(
                  backgroundColor = Color.Green,
                  contentColor = Color.Blue

              )
                  ) {
                Text(text = "      t??kla      ")
              }
          }  
    }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeReadingTheme {
        Sayfa()
    }
}