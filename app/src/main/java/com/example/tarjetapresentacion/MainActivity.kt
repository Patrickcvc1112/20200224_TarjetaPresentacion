package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    GreetingImage("Patrick Villafranca", "Android Developer Extraordinaire")
                    ContactInfo(
                        phoneIcon = Icons.Default.Phone,
                        phoneText = "+51 921 098 503",
                        shareIcon = Icons.Default.Share,
                        shareText = "@PatrickVC",
                        emailIcon = Icons.Default.Email,
                        emailText = "patrick.villafranca@unmsm.edu.pe"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(elemento1: String, elemento2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(130.dp)
                .background(Color(0xFF073042))
        ) {
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        Text(
            text = elemento1,
            modifier = Modifier.padding(top = 18.dp, bottom = 8.dp),
            fontSize = 35.sp
        )
        Text(
            text = elemento2,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006D37)
        )
    }
}

@Composable
fun ContactInfo(
    phoneIcon: ImageVector,
    phoneText: String,
    emailIcon: ImageVector,
    emailText: String,
    shareIcon: ImageVector,
    shareText: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
    ) {
        Spacer(modifier = Modifier.weight(1f))
        ContactItem(icon = phoneIcon, text = phoneText)
        ContactItem(icon = shareIcon, text = shareText)
        ContactItem(icon = emailIcon, text = emailText)
    }
}

@Composable
fun ContactItem(icon: ImageVector, text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.padding(bottom = 8.dp)
    ) {
        Spacer(modifier = Modifier.width(55.dp))
        Icon(imageVector = icon, contentDescription = null, tint = Color(0xFF006D3B))
        Text(
            text = text,
            textAlign = TextAlign.Start
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFD2E8D4)
        ) {
            GreetingImage("Patrick Villafranca", "Android Developer Extraordinaire")
            ContactInfo(
                phoneIcon = Icons.Default.Phone,
                phoneText = "+51 921 098 503",
                shareIcon = Icons.Default.Share,
                shareText = "@PatrickVC",
                emailIcon = Icons.Default.Email,
                emailText = "patrickcvc1112@gmail.com"
            )
        }
    }
}
