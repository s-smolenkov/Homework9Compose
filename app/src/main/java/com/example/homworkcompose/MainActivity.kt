package com.example.homworkcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.homworkcompose.ui.theme.HomworkComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomworkComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Homework9()
                }
            }
        }
    }
}

@Composable
fun Homework9() {

    var counter = 0
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row() {
            Button(onClick = {
                    counter += 1
                    if (counter < 1) {
                        Toast.makeText(context, "Variable less than 1", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context, "$counter", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "+")
            }

            Button(
                onClick = {
                    counter -= 1
                    if (counter < 1) {
                        Toast.makeText(context, "Variable less than 1", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(context, "$counter", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "-")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Homework9Preview() {
    Homework9()
}