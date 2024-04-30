package com.plcoding.image_preview

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

    @Composable
    fun ButtonTeo(context: Context){
        Button(onClick = {
            Toast.makeText(context, "Teo Chupa Monda", Toast.LENGTH_SHORT).show()
        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(text = "Click to button")
        }
    }
@Composable
fun ButtonDanilo(context: Context){
    Button(onClick = {
        Toast.makeText(context, "Teo Chupa Monda", Toast.LENGTH_SHORT).show()
    },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Click to button")
    }
}
