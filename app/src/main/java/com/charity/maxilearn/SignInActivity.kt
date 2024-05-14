package com.charity.maxilearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradient
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.charity.maxilearn.ui.theme.MaxiLearnTheme

class SignInActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaxiLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  //  Greeting2("Android")
                    SignScreen()
                }
            }
        }
    }
}

@Composable
fun SignScreen(){
    val gradientColorList = listOf(
       // Color (0xFFBB86FC),
        Color (0xFF6200EE),
        Color (0xFFAA00FF),
        Color (0xFFAA00FF)
    )
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = gradientackgroundBrush(
                    isVerticalGradient = true ,
                    colors = gradientColorList
                )
            )
            .padding(horizontal = 40.dp)


    ) {
        Text(text = "WELCOME   TO   OUR APP",
            color = Color.White,
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif


        )
        Spacer(modifier = Modifier.height(55.dp))
        Text(text = "Fresh food for every one",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam",
            color = Color.White,
            fontSize = 13.sp,
            fontFamily = FontFamily.SansSerif


        )
        Spacer(modifier = Modifier.height(105.dp))
        OutlinedButton(onClick = { },
            modifier = Modifier
                .fillMaxWidth(0.85f),
            colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text ="Sign In",
                fontSize = 15.sp,
                color = Color.Magenta
            )

        }
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Create an account",
            color = Color.White,
            modifier = Modifier.clickable { }
        )
    }
}
@Composable
private fun gradientackgroundBrush(
    isVerticalGradient: Boolean,
    colors:List<Color>
): Brush {
    val endOffset = if (isVerticalGradient){
        Offset(0f, Float.POSITIVE_INFINITY)
    }else{
        Offset(Float.POSITIVE_INFINITY, 0f)
    }
    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )

}

@Preview(showBackground = true)
@Composable
private fun Signprev(){
    SignScreen()
}
