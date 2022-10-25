package com.example.appimms

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.appimms.ui.theme.APPIMMSTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Component()
        }
    }
}

@Composable
fun Component() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(modifier = Modifier
            .background(color = Color(0xFF00685b))
            .padding(3.dp)) {
                Column(modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.1f)) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .padding(top = 15.dp, start = 20.dp)) {
                        Text(text = "IMSS Digital", modifier = Modifier.align(Alignment.TopStart),
                        Color.White
                        , fontWeight = FontWeight.Bold
                        ,fontSize = 20.sp
                        )
                        Text(text = "Bienvienido", modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(top = 8.dp),
                        Color.White)
                    }
                }
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f)) {
                    Box( Modifier.fillMaxSize()) {
                        Text(text = "Consulta",modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(top = 12.dp, end = 35.dp),
                        Color.White)
                        Text(text = "NSS",modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .padding(top = 35.dp, end = 35.dp)
                            .clip(CircleShape)
                            .background(Color.White)
                            .padding(5.dp)
                            , fontWeight = FontWeight.Bold
                            , fontSize = 14.sp)
                    }
                }
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(top = 8.dp, bottom = 2.dp)) { //First Row img
                Card( modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(start = 10.dp, end = 3.dp),
                    elevation = 10.dp,
                    shape = RoundedCornerShape(20.dp),
                    border = BorderStroke(1.dp, color = Color.LightGray)) {
                    Column(modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 20.dp, bottom = 14.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.pulmones),
                            contentDescription = "ImgPulmones",
                            modifier = Modifier
                                .fillMaxWidth()
                                .size(40.dp)
                        )
                        Text(text = "Módulo Atención Respiratoria (MARSS)",
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                    }
                }
            Card( modifier = Modifier
                .fillMaxWidth()
                .padding(start = 3.dp, end = 10.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.coronavirus),
                        contentDescription = "ImgCOVID",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Permiso COVID 4.0",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 2.dp)) { //Second Row img
            Card( modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(start = 10.dp, end = 3.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.calendario),
                        contentDescription = "ImgCita",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Cita medicina familiar",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card( modifier = Modifier
                .fillMaxWidth()
                .padding(start = 3.dp, end = 10.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.cuidado_de_la_salud),
                        contentDescription = "ImgCHKT",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "CHKT en línea",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 2.dp)) { //Third Row img
            Card( modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(start = 10.dp, end = 3.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.archivo),
                        contentDescription = "ImgDoc",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Vigencia de derechos",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card( modifier = Modifier
                .fillMaxWidth()
                .padding(start = 3.dp, end = 10.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.marcador_de_posicion),
                        contentDescription = "imgCambioUbi",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Alta o cambio de clínica",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Row( modifier = Modifier
            .fillMaxWidth()
            .padding(top = 2.dp, bottom = 2.dp)) { //Fourd Row img
            Card( modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(start = 10.dp, end = 3.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(15.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.informacion_personal),
                        contentDescription = "ImgInformacion",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(60.dp)
                    )
                    Text(text = "Infórmate de tu familiar",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card( modifier = Modifier
                .fillMaxWidth()
                .padding(start = 3.dp, end = 10.dp),
                elevation = 10.dp,
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)) {
                Column(modifier = Modifier
                    .padding(20.dp)
                    .padding(top = 20.dp, bottom = 20.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.oso_de_peluche),
                        contentDescription = "ImgLicencia",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Licencia 140 Bis",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 100.dp),
        ) {
            Box(modifier = Modifier.fillMaxWidth(0.44f).padding(start =40.dp)) {
                Image(painter = painterResource(id = R.drawable.home), contentDescription = "imgCasa", modifier = Modifier
                    .size(50.dp))
            }
            Box(modifier = Modifier.fillMaxWidth(0.6f)) {
                Image(painter = painterResource(id = R.drawable.marker), contentDescription = "imgUbicacion", modifier = Modifier.size(50.dp))
            }
                Image(painter = painterResource(id = R.drawable.calendar), contentDescription = "imgFecha", modifier = Modifier.size(50.dp))

        }
        }
    
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Component()
}