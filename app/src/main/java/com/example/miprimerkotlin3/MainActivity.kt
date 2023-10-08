package com.example.miprimerkotlin3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miprimerkotlin3.ui.theme.MiPrimerKotlin3Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPrimerKotlin3Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background) {
                    Greeting("Alberto Capote")
                }
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Surface (color = (Color(255, 153, 0))) {
            Text(text = "Hola, me llamo $name!", modifier = Modifier.padding(22.dp))
        }
    }
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiPrimerKotlin3Theme {
        Greeting("Alberto Capote")
    }
}