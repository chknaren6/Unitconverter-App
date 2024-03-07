package com.example.unitconverter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.makeText
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.unitconverter.ui.theme.UnitConverterTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mainscreen()



        }
    }
}



@Composable
fun Mainscreen() {

    var inputvalue by remember { mutableStateOf("") }
    var inputunit by remember { mutableStateOf("")    }
    var outputvalue by remember { mutableStateOf("")    }
    var outputunit by remember { mutableStateOf("")    }
    var iexpanded by remember { mutableStateOf(false)    }
    var oexpanded by remember { mutableStateOf(false)    }
    val conversionfactor =  remember { mutableStateOf(0.01)    }
    fun conversion(){

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Unit Converter", style = TextStyle(fontSize = 30.sp))
        OutlinedTextField(
            value = inputvalue,
            onValueChange = {},
            label = { Text(text = "Enter Value") })


        Row {
            Box(modifier = Modifier) {
                Button(onClick = { iexpanded= true }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Down arrow")
                }
                DropdownMenu(expanded = iexpanded, onDismissRequest = { iexpanded= false }) {
                    DropdownMenuItem(text = { Text(text = "Centimeters") },
                        onClick = {
                            iexpanded= false
                        inputunit="Centimeters"
                        })
                    DropdownMenuItem(text = { Text(text = "Meters") },
                        onClick = {
                            iexpanded= false
                            inputunit="Meters"
                        })
                    DropdownMenuItem(text = { Text(text = "Kilometers") },
                        onClick = {
                        iexpanded= false
                        inputunit="Kilometers"
                    })
                }
            }



            Spacer(modifier = Modifier.padding(20.dp))

            Box {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Select")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Down arrow")
                }
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text(text = "Centimeters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text = "Kilometers") }, onClick = { /*TODO*/ })
                }
            }
        }

                
                
            }
        }






