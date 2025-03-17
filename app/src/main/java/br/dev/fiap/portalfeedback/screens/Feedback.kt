import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.dev.fiap.portalfeedback.ui.theme.PortalFeedbackTheme
import br.dev.fiap.portalfeedback.R

@Composable
fun FeedbackScreen( modifier: Modifier = Modifier) {
    var nome by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }
    var estrelas by remember { mutableStateOf("") }
    val corCinzaClaro = Color(0xFFF0F0F0)
    var comentario by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.primary)
            .fillMaxSize()
            .padding(16.dp)

    ) {
        Text(
            text = "Portal Feedback",
            color = MaterialTheme.colorScheme.tertiary,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier.height(12.dp))
        Text(
            text = " Sua opinião é essencial para nos!\n " +
                    "Compartilhe seu feedback e ajude-nos a melhorar ainda mais",
            modifier = Modifier.fillMaxWidth(),
            color = MaterialTheme.colorScheme.tertiary,
            textAlign = TextAlign.Center,
            fontSize = 18.sp

        )
        Spacer(modifier = Modifier.height((16.dp)))
        Card(
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(containerColor = corCinzaClaro),
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)

        ) {
            Column(modifier = Modifier.padding(50.dp)) {
                TextField(value = nome, onValueChange = { nome = it }, label = { Text("Nome") })
                TextField(value = cidade, onValueChange = { cidade = it }, label = { Text("Cidade") })
                TextField(value = idade, onValueChange = { idade = it }, label = { Text("Idade") })
                Spacer(modifier = Modifier.height(8.dp))
                Text(text = "Selecione a quantidade de estrelas: ")
                Row {
                    (1..5).forEach { star ->
                        IconButton(onClick = {}) {
                            Icon(
                                painter = painterResource(id = R.drawable.estrelinha),
                                contentDescription = "Stats",
                                tint = Color.Yellow
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = comentario,
                    onValueChange = { comentario = it },
                    label = { Text("Comentário") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(top = 20.dp),
            horizontalAlignment = Alignment.End
        ){
            Button(
                onClick = { /* Lógica de envio */ },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.tertiary),
            ) {
                Text(text = "Enviar meu feedback", color = Color.White)
            }
        }

    }
}


@Preview
@Composable
private fun FeedbackScreenPriview() {
    PortalFeedbackTheme (darkTheme = false){
    FeedbackScreen()}

}

