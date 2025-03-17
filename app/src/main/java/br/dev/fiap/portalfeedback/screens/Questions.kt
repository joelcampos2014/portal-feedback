package br.dev.fiap.portalfeedback.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme
import br.dev.fiap.portalfeedback.R

@Composable
fun ESGQuestionnaireScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.primary)
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(

            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier
                .fillMaxHeight()
                .padding(top = 40.dp)
        ) {
            // Header
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Bem-vindo novamente",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                    Text(
                        text = "Alfredo Torres",
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.profile_picture),
                    contentDescription = "User Profile",
                    modifier = Modifier
                        .size(46.dp)
                        .border(2.dp, MaterialTheme.colorScheme.secondary, CircleShape)
                )
            }

            // List of Questions
            val questions = listOf(
                "O que significa ESG e quais são seus principais pilares?" to listOf(
                    "a) Ambiental, Social e Governança;",
                    "b) Sustentabilidade e Gestão;",
                    "c) Ética, Sociedade e Gestão;",
                    "d) Não sei"
                ),
                "Você já teve contato com práticas ou relatórios de ESG em alguma empresa que trabalhou ou investiu?" to listOf(
                    "a) Sim, já participei de iniciativas relacionadas a ESG;",
                    "b) Não, mas já ouvi falar sobre o tema;",
                    "c) Nunca tive contato com ESG"
                ),
                "Qual dessas ações melhor representa uma prática de Governança dentro do ESG?" to listOf(
                    "a) Redução do consumo de água e energia;",
                    "b) Programas de inclusão e diversidade;",
                    "c) Transparência na comunicação com stakeholders e auditorias internas;"
                )
            )

            questions.forEach { (question, options) ->
                Card(
                    shape = RoundedCornerShape(8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            width = 2.dp,
                            color = MaterialTheme.colorScheme.secondary,
                            shape = RoundedCornerShape(12.dp) // Igual ao shape do Card
                        )
                )
                {
                    Column(modifier = Modifier.padding(5.dp)) {
                        Text(
                            text = question,
                            fontSize = 18.sp,
                            color = MaterialTheme.colorScheme.tertiary
                        )
                        Spacer(modifier = Modifier.height(6.dp))
                        options.forEach { option ->
                            Text(text = option, color = MaterialTheme.colorScheme.primary)
                        }
                        Spacer(modifier = Modifier.height(6.dp))
                        Button(
                            onClick = {},
                            modifier = Modifier.fillMaxWidth(),
                            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary)
                        ) {
                            Text(text = "Enviar")
                        }

                    }
                }
            }

            // Navigation Bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 2.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.dashboard),
                        contentDescription = "Dashboard",
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.dois),
                        contentDescription = "Stats",
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                }
                IconButton(onClick = {}) {
                    Icon(
                        painter = painterResource(id = R.drawable.tres),
                        contentDescription = "Profile",
                        tint = MaterialTheme.colorScheme.tertiary
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun ESGQuestionnairePreview() {
    PortalFeedbackTheme(darkTheme = true) {
        ESGQuestionnaireScreen()
    }
}
