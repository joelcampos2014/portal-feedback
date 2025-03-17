package br.dev.fiap.portalfeedback.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.R
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme

@Composable
fun Conhecimento (modifier: Modifier = Modifier) {
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
                    color = MaterialTheme.colorScheme.tertiary
                )
                Text(
                    text = "sua voz, nossa evolução_ ;-)",
                    fontSize = 16.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(20.dp))

                // Foto de perfil
                Column (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
                ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_picture), // Foto do usuário
                    contentDescription = "Foto de perfil",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Nome do usuário
                Text(text = "Olá", fontSize = 16.sp, color = Color.White)
                Text(
                    text = "Alfredo Torres",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(30.dp))

                // Descrição ESG
                Text(
                    text = "Vamos conhecer mais sobre ESG?",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "É a gestão sustentável de empresas baseada em três pilares: Ambiental, Social e Governança, focando em impacto e ética.",
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()

                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "O conceito ESG surgiu em 2004, impulsionado pela ONU, para guiar investimentos sustentáveis com foco em meio ambiente, social e governança.",
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Agora que você já sabe mais sobre o tema, nos ajude a entender seu nível de conhecimento em relação ao tema ESG.",
                    fontSize = 14.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(24.dp))
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
                        Text(text = "Vamos começar")
                    }
                }
            }
        }
    }
}}
    @Preview(showSystemUi = true)
    @Composable
    private fun ConhecimentoPreview() {
        PortalFeedbackTheme(darkTheme = true) {
            Conhecimento()
        }
    }


