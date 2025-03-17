package br.dev.fiap.portalfeedback.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.R
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme

@Composable
fun Login(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primary)
            .fillMaxSize()
            .padding(
                start = 40.dp,
                end = 40.dp
            ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(
                    painter = painterResource(R.drawable.comment),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .height(60.dp)
                )
                Column (
                    modifier = Modifier
                        .border(
                            border = BorderStroke(
                                width = 2.dp,
                                color = MaterialTheme.colorScheme.secondary
                            ),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .padding(12.dp),
                ){
                    Image(
                        painter = painterResource(R.drawable.menu),
                        contentDescription = "Logo",
                        modifier = Modifier
                            .height(40.dp)
                    )
                }
            }
            Column {
                Text(
                    text = "Portal feedback",
                    fontSize = 32.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
                Text(
                    text = "sua voz, nossa evolução_ ;-)",
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
            Column {
                TextField(
                    value = "E-mail / Username",
                    onValueChange = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 15.dp)
                )
                TextField(
                    value = "senha",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Column {
                Button(
                    onClick = {},
                    colors = ButtonColors(
                        contentColor = Color.White,
                        disabledContainerColor = MaterialTheme.colorScheme.tertiary,
                        disabledContentColor = MaterialTheme.colorScheme.tertiary,
                        containerColor = MaterialTheme.colorScheme.tertiary
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "Next")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LoginPreview() {
    PortalFeedbackTheme (darkTheme = true) {
        Login()
    }
}