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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.R
import br.dev.fiap.portalfeedback.ui.theme.DarkGray
import br.dev.fiap.portalfeedback.ui.theme.Green
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme

@Composable
fun FeedbackList(modifier: Modifier = Modifier) {
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
                Column(
                    modifier = Modifier
                        .border(
                            border = BorderStroke(
                                width = 2.dp,
                                color = MaterialTheme.colorScheme.secondary
                            ),
                            shape = RoundedCornerShape(15.dp)
                        )
                        .padding(12.dp),
                ) {
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
                    color = Green
                )
                Text(
                    text = "sua voz, nossa evolução_ ;-)",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
            }
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 50.dp)
            ){
                Text(
                    text = "Olá, administrador.",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
                Text(
                    text = "Esses são seus feedbacks:",
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.tertiary
                )
            }
            Column {
                Row {
                    Button(
                        onClick = {},
                        colors = ButtonColors(
                            contentColor = Color.White,
                            disabledContainerColor = Green,
                            disabledContentColor = Green,
                            containerColor = Green
                        ),
                        modifier = Modifier
                            .padding(2.dp)
                    ) {
                        Text(
                            text = "5 dias",
                            fontSize = 9.sp,
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonColors(
                            contentColor = Color.White,
                            disabledContainerColor = Green,
                            disabledContentColor = Green,
                            containerColor = Green
                        ),
                        modifier = Modifier
                            .padding(2.dp)
                    ) {
                        Text(
                            text = "10 dias",
                            fontSize = 9.sp,
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonColors(
                            contentColor = Color.White,
                            disabledContainerColor = Green,
                            disabledContentColor = Green,
                            containerColor = Green
                        ),
                        modifier = Modifier
                            .padding(2.dp)
                    ) {
                        Text(
                            text = "30 dias",
                            fontSize = 9.sp,
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonColors(
                            contentColor = Color.White,
                            disabledContainerColor = Green,
                            disabledContentColor = Green,
                            containerColor = Green
                        ),
                        modifier = Modifier
                            .padding(2.dp)
                    ) {
                        Text(
                            text = "Pers.",
                            fontSize = 8.sp
                        )
                    }
                }
            }
            Column {
                Card(
                    shape = RoundedCornerShape(20.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier.fillMaxWidth(),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)

                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Column {
                            Text(
                                text = "Alfredo Torres",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(
                                        start = 30.dp,
                                        top = 30.dp
                                    ),
                                color = DarkGray
                            )
                            Text(
                                text = "São Paulo - 32 anos",
                                modifier = Modifier
                                    .padding(
                                        start = 30.dp
                                    ),
                                color = DarkGray
                            )
                            Row (
                                modifier = Modifier
                                    .padding(
                                        start = 30.dp
                                    )
                            ){
                                for (i in 1..4) {
                                    Image(
                                        painter = painterResource(id = R.drawable.estrelinha),
                                        contentDescription = "Estrela",
                                        modifier = Modifier
                                            .size(17.dp)
                                    )
                                }
                            }
                            Text(
                                text = "Ótimo ver a empresa comprometida com ESG! Sustentabilidade, ética e impacto social fazem  diferença no futuro.",
                                modifier = Modifier
                                    .padding(
                                        start = 30.dp,
                                        bottom = 30.dp,
                                        top = 20.dp
                                    ),
                                color = DarkGray
                            )
                        }
                    }
                }
            }
            Column {
                Button(
                    onClick = {},
                    colors = ButtonColors(
                        contentColor = Color.White,
                        disabledContainerColor = Green,
                        disabledContentColor = Green,
                        containerColor = Green
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Text(text = "Gerar meu relatório")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun FeedbackListPrev() {
    PortalFeedbackTheme(darkTheme = true) {
        FeedbackList()
    }
}