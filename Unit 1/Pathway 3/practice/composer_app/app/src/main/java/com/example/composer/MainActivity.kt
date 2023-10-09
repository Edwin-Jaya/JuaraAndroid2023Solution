package com.example.composer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composer.ui.theme.ComposerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    JetpackTutorial(judul = stringResource(R.string.judul),
                        definisi = stringResource(R.string.definition) ,
                        desc = stringResource(R.string.desc) )
                }
            }
        }
    }
}

@Composable
fun JetpackTutorial(judul : String, definisi : String, desc : String, modifier: Modifier = Modifier){
    val header_image = painterResource(R.drawable.bg_compose_background)
    Column {
        Image(painter = header_image, contentDescription = null )
        Text(
            text = stringResource(R.string.judul),
            fontSize=24.sp,
            modifier=modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.definition),
            textAlign= TextAlign.Justify,
            modifier=modifier.padding(start = 16.dp, end= 16.dp)
        )
        Text(
            text = stringResource(R.string.desc),
            textAlign= TextAlign.Justify,
            modifier=modifier.padding(16.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PagePreview() {
    ComposerTheme {
        JetpackTutorial(judul = stringResource(R.string.judul),
            definisi = stringResource(R.string.definition) ,
            desc = stringResource(R.string.desc))
    }
}