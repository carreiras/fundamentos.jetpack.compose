package carreiras.com.github.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import carreiras.com.github.jetpackcompose.componentes.SimpleTextField
import carreiras.com.github.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SimpleTextField(Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun Inicial(modifier: Modifier = Modifier) {
        Column(modifier = modifier.background(color = Color.Blue)) {
            TextoCustomizado("Primeira função composable.")
            Row {
                TextoCustomizado("Seja bem vindo!")
                TextoCustomizado("Olá usuário.")
            }
        }
    }

    @Composable
    fun TextoCustomizado(texto: String, modifier: Modifier = Modifier) {
        Text(
            text = texto,
            color = Color.White,
            modifier = modifier
        )
    }

    @Composable
    fun NotificationBage(modifier: Modifier = Modifier) {
        Box(modifier = modifier.padding(16.dp), contentAlignment = Alignment.Center) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
                    .background(color = Color.Green)
            )
            Box(
                modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(color = Color.Red)
                    .align(Alignment.TopEnd)
            )
        }
    }

    @Composable
    fun CardMensagem(modifier: Modifier = Modifier) {
        Row(modifier = modifier.padding(16.dp)) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Foto do contato",
                modifier = Modifier
                    .size(52.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(text = "Autor da mensagem")
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = "Conteúdo da mensagem")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewFuncaoInicial() {
        JetpackComposeTheme {
//            Inicial()
//            TesteModifier()
            TesteButtom()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewNotificationBage() {
        JetpackComposeTheme {
            NotificationBage()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewCardMensagem() {
        JetpackComposeTheme {
            CardMensagem()
        }
    }

    @Composable
    fun TesteModifier() {
        Column {
            Text(
                text = "Item 1",
                modifier = Modifier
                    .border(border = BorderStroke(width = 1.dp, color = Color.Green))
                    .padding(horizontal = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Item 1",
                modifier = Modifier
                    .border(border = BorderStroke(width = 1.dp, color = Color.Green))
                    .padding(horizontal = 8.dp, vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Item 1",
                modifier = Modifier
                    .border(border = BorderStroke(width = 1.dp, color = Color.Green))
                    .padding(horizontal = 8.dp)
            )
        }
    }


    @Composable
    fun TesteButtom() {
        Button(
            onClick = { /* TODO */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Green,
                contentColor = Color.Black
            ),
            shape = RoundedCornerShape(4.dp)
        ) {
            Text(text = "Confirmar")
        }

    }
}