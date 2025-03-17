package br.dev.fiap.portalfeedback.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.R
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme

@Composable
fun FeedbackDashboard() {
    Column(
        modifier = Modifier
            .background(color = Color.Black)
            .fillMaxSize()
    ) {
        Header()
        MenuBar()

        Spacer(modifier = Modifier.height(20.dp))

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 40.dp,
                    end = 40.dp
                ),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Ranking",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green
                )

                Spacer(modifier = Modifier.height(20.dp))

                Image(
                    painter = painterResource(id = R.drawable.grafico_barras),
                    contentDescription = "Gráfico de Barras",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "Feedbacks recebidos",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Green
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = "595 nos últimos dias",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Image(
                    painter = painterResource(id = R.drawable.line_chart),
                    contentDescription = "Gráfico de Linhas",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Governança",
                        color = Color(0xFFA8FF99),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Resp. Social",
                        color = Color(0xFF7FFF55),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 24.dp, end = 24.dp)
                    )

                    Spacer(modifier = Modifier.height(50.dp))

                    Text(
                        text = "Sustentabilidade",
                        color = Color(0xFF0B4F0B),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00C853)),
                    modifier = Modifier.fillMaxWidth(0.8f)
                ) {
                    Text("Enviar meu feedback", color = Color.White, fontSize = 16.sp)
                }

                Spacer(modifier = Modifier.height(50.dp))
            }
        }
    }
}

@Composable
fun Header() {
    Spacer(modifier = Modifier.height(10.dp))
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        Image(
            painter = painterResource(R.drawable.comment),
            contentDescription = "Logo",
            modifier = Modifier
                .height(50.dp)
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
        ) {
            Image(
                painter = painterResource(R.drawable.menu),
                contentDescription = "Menu",
                modifier = Modifier
                    .height(20.dp)
            )
        }
    }

    Spacer(modifier = Modifier.height(10.dp))
}


@Composable
fun MenuBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF04CCA4))
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Empresas", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = "Feedbacks", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = "Ranking", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
        Text(text = "Suporte", color = Color.White, fontSize = 16.sp, fontWeight = FontWeight.Bold)
    }
}

@Preview(showBackground = true)
@Composable
fun FeedbackDashboardPreview() {
    PortalFeedbackTheme(darkTheme = true) {
    FeedbackDashboard()
}}


