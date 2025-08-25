package carreiras.com.github.jetpackcompose.componentes

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun SimpleOutlineTextField(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }

    OutlinedTextField(
        modifier = modifier,
        value = text,
        onValueChange = { novoValorDigitado: String ->
            text = novoValorDigitado
            isError = novoValorDigitado.contains("0")
        },
        label = { Text(text = "Nome") },
        isError = isError,
    )
}