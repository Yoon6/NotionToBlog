package ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainScreen() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Notion To Blog",
                modifier = Modifier.padding(0.dp, 100.dp).align(Alignment.CenterHorizontally),
                fontSize = 40.sp
            )
            Button(onClick = {}, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                Text("Start")
            }
        }
    }
}