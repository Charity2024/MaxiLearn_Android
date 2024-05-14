package com.charity.maxilearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.charity.maxilearn.ui.theme.MaxiLearnTheme

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaxiLearnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  //  Greeting4("Android")
                    RegisterScreen()
                }
            }
        }
    }
}

@Composable
fun RegisterScreen(){
    var mail by remember { mutableStateOf("")}
    var email by remember { mutableStateOf(" ")}
    var password by remember { mutableStateOf("")}
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
        Text(text = "Registration",
            color = Color.White,
            fontSize = 35.sp,
            fontFamily = FontFamily.SansSerif


        )
        Text(text = "Create your new account",
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif


        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = mail,
            onValueChange ={mail=it },
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            label = { Text(text = "User Name/ Mail",
                color =  Color.Blue,
                fontSize = 10.sp
            )},
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email,
            onValueChange ={email=it },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            label = { Text(text = "user@gmail.com",
                color =  Color.Blue,
                fontSize = 10.sp
            )},
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription ="" ) },
            trailingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription ="" )},
            label = {
                Text(
                    text = "Password",
                    color = Color.Blue,
                    fontSize = 10.sp
                )
            },
        )
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
        ){
            Text(text = "Remember me",
                color = Color.White)
            Spacer(modifier = Modifier.width(25.dp))
            Text(text = "Forgot password",
                color = Color.White)
            
        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(onClick = { },
            modifier = Modifier
                .fillMaxWidth(0.85f),
            colors = ButtonDefaults.buttonColors(Color.White)) {
            Text(text ="Login",
                fontSize = 15.sp,
                color = Color.Magenta
            )

        }
        Spacer(modifier = Modifier.height(15.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {


            Text(
                text = "Remember me?",
                color = Color.White,

            )
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "Sign up",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                modifier = Modifier.clickable { }
            )
        }

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
private  fun Regprev(){
    RegisterScreen()
}
