package com.ung.jetstickexample

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manalkaff.jetstick.JoyStick
import com.ung.jetstickexample.ui.theme.JetStickExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetStickExampleTheme {
                JetStickUI()
            }
        }
    }
}

@Preview
@Composable
fun JetStickUI(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        JoyStick(
            Modifier.padding(30.dp),
            size = 150.dp,
            dotSize = 30.dp
        ) { x: Float, y: Float ->
            Log.d("JoyStick", "$x, $y")
        }
    }
}
