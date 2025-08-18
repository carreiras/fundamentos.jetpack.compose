package carreiras.com.github.jetpackcompose.componentes

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import carreiras.com.github.jetpackcompose.R

@Composable
fun SimpleText() {
    Text(
        text = stringResource(id = R.string.hello_turma),
        color = Color.Blue,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold
    )
}

@Preview
@Composable
fun Preview() {
    SimpleText()
}