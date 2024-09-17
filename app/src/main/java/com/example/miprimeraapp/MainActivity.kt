package com.example.miprimeraapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miprimeraapp.ui.theme.MiPrimeraAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiPrimeraAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MiPrimeraApp()
                }
            }
        }
    }
}

@Composable
fun MiPrimeraApp() {
    var textoBoton by remember { mutableStateOf("¡Hola Mundo!") }
    var contadorClics by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = textoBoton)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            contadorClics++
            textoBoton = "Has hecho clic $contadorClics veces"
        }) {
            Text("Haz clic aquí")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MiPrimeraAppTheme {
        MiPrimeraApp()
    }
}
