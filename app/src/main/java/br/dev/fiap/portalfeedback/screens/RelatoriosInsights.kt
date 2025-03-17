package br.dev.fiap.portalfeedback.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.R
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme
import androidx.compose.ui.graphics.Brush

@Composable
fun RelatoriosInsightsScreen() {
    Box(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.primary)
            .fillMaxSize()
            .padding(
                start = 40.dp,
                end = 40.dp
            )
    ) {
        Column(
            modifier = Modifier
                .padding(top = 130.dp)
        ) {
            Text(
                text = "Portal feedback",
                fontSize = 32.sp,
                color = MaterialTheme.colorScheme.tertiary
            )
            Text(
                text = " sua voz, nossa evolução_ ;-)",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.tertiary
            )

            Spacer(modifier = Modifier.height(30.dp))

            ResultadosSection()

            Spacer(modifier = Modifier.height(20.dp))

            TrafegoSection()

            Spacer(modifier = Modifier.height(20.dp)) //os spacers foram usados para espaçar cada seção

            EngajamentoLikesComentariosSection()

            Spacer(modifier = Modifier.height(8.dp))

            TopFeedbacksESGSection()

            Spacer(modifier = Modifier.height(22.dp))

            ExportarRelatorioSection()

        }

        Image(
            painter = painterResource(id = R.drawable.menu),
            contentDescription = "Menu",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.TopEnd)
                .padding(top = 20.dp, start = 30.dp)              //l70 - l77 Imagem de 3 riscos (menu)- Server para acessar o menu das telas
        )

        Image(
            painter = painterResource(id = R.drawable.comment),
            contentDescription = "Balão de fala",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.TopStart)
                .padding(top = 20.dp, end = 30.dp)          //l79 - l86 Imagem de balão de fala (logo)
        )
    }
}

@Composable
fun ResultadosSection() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color(0xFF00FF94))
                .padding(horizontal = 10.dp, vertical = 2.dp)
        ) {
            Text("→", fontSize = 18.sp, color = Color.Black)
            Spacer(modifier = Modifier.width(6.dp))
            Text("RESULTADOS", fontSize = 12.sp, color = Color.Black)
        }

        Column(
            modifier = Modifier
                .border(2.dp, Color(0xFF00FF94))
                .padding(10.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("+500", fontSize = 24.sp, color = Color(0xFF00FF94))
                    Text("seguidores", fontSize = 10.sp, color = Color(0xFF00FF94))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("+115", fontSize = 24.sp, color = Color(0xFF00FF94))
                    Text("novos feedbacks", fontSize = 10.sp, color = Color(0xFF00FF94))
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("+30%", fontSize = 24.sp, color = Color(0xFF00FF94))
                    Text("tráfego no site", fontSize = 10.sp, color = Color(0xFF00FF94))
                }
            }
        }
    }
}          //l90 - l130 seção de resultados (caixa de resultados + textos)

@Composable
fun TrafegoSection() {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 10.dp, vertical = 2.dp)
        ) {
            Text("→", fontSize = 18.sp, color = Color.Black)
            Spacer(modifier = Modifier.width(6.dp))
            Text("TRÁFEGO", fontSize = 12.sp, color = Color.Black)
        }

        Column(
            modifier = Modifier
                .border(2.dp, Color.White)
                .padding(8.dp)
        ) {
            Spacer(modifier = Modifier.height(12.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.upload),
                        contentDescription = "Upload",
                        modifier = Modifier.size(24.dp)
                    )
                    Text("110 ADS", fontSize = 24.sp, color = Color.White)
                    Text("publicados", fontSize = 9.sp, color = Color.White)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.olho),
                        contentDescription = "Impressões",
                        modifier = Modifier.size(24.dp)
                    )
                    Text("370k", fontSize = 24.sp, color = Color.White)
                    Text("impressões", fontSize = 9.sp, color = Color.White)
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.saco_dinheiro),
                        contentDescription = "Valor investido",
                        modifier = Modifier.size(24.dp)
                    )
                    Text("$2.5k", fontSize = 24.sp, color = Color.White)
                    Text("investidos", fontSize = 9.sp, color = Color.White)
                }
            }
        }
    }
}           //l132 - l 187 seção de tráfego, onde foram adicionadas imagens e textos dentro da box de resultados

@Composable
fun EngajamentoLikesComentariosSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                LinearProgressIndicator(
                    progress = { 0.37f },
                    modifier = Modifier.width(50.dp).height(8.dp),
                    color = Color(0xFF00FF94),
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("37% Engajamento", fontSize = 10.sp, color = Color.White)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                LinearProgressIndicator(
                    progress = { 0.60f },
                    modifier = Modifier.width(50.dp).height(8.dp),
                    color = Color(0xFF00ffff),
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("60% Likes", fontSize = 10.sp, color = Color.White)
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                LinearProgressIndicator(
                    progress = { 0.49f },
                    modifier = Modifier.width(50.dp).height(8.dp),
                    color = Color(0xFFffff00),
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text("49% Comentários", fontSize = 10.sp, color = Color.White)
            }
        }


        Image(
            painter = painterResource(id = R.drawable.grafico),
            contentDescription = "Gráfico com corações e porcentagem",
            modifier = Modifier
                .weight(1f)
                .size(58.dp)
        )
    }
}      //l189 - l247 seção de porcentagens de engajamentos, likes e comentários + imagem do gráfico estático feito no canva

@Composable
fun TopFeedbacksESGSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 10.dp, vertical = 2.dp)
        ) {
            Text("→", fontSize = 14.sp, color = Color.Black)
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "TOP 5 FEEDBACKS RECEBIDOS",
                fontSize = 10.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(2.dp))

        // lista de Feedbacks
        Column {
            FeedbackItem(
                number = 1,
                text = "Excelente atendimento!",
                stars = 5,
                percentage = "31.2%"
            )
            FeedbackItem(
                number = 2,
                text = "Atenciosos, me senti especial! ",
                stars = 0,
                percentage = "28%"
            )
            FeedbackItem(
                number = 3,
                text = "Sustentável e inovador! ",
                stars = 0,
                percentage = "27.6%"
            )

        }
    }
}

@Composable
fun FeedbackItem(number: Int, text: String, stars: Int, percentage: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "#$number",
            fontSize = 10.sp,
            color = Color.Gray,
            modifier = Modifier.width(30.dp)
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = text,
                fontSize = 10.sp,
                color = Color.White
            )
            if (stars > 0) {
                Spacer(modifier = Modifier.width(4.dp))
                for (i in 1..stars) {
                    Image(
                        painter = painterResource(id = R.drawable.estrelinha),
                        contentDescription = "Estrela",
                        modifier = Modifier.size(12.dp)
                    )
                }
            }
            if (text.contains("Atenciosos, me senti especial!")) {
                Spacer(modifier = Modifier.width(4.dp))
                Image(
                    painter = painterResource(id = R.drawable.coracao),
                    contentDescription = "Coração",
                    modifier = Modifier.size(12.dp)
                )
            }
            if (text.contains("Sustentável e inovador!")) {
                Spacer(modifier = Modifier.width(4.dp))
                Image(
                    painter = painterResource(id = R.drawable.muda),
                    contentDescription = "Planta",
                    modifier = Modifier.size(12.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = percentage,
            fontSize = 10.sp,
            color = Color (0xFF00FF94)
        )
    }
} //l249 - l356 seção de feedbacks

@Composable
fun ExportarRelatorioSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(Color(0xFF00FFFF), Color(0xFF00FF94))
                )
            )
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.quadradosbrancos),
            contentDescription = "Ícone de exportar",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = "Exportar relatório",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}   //l358 - l384 seção do botão de exportar relatórios

@Preview(showBackground = true)
@Composable
fun RelatoriosInsightsPreview() {
    PortalFeedbackTheme(darkTheme = true) {
        RelatoriosInsightsScreen()
    }
}