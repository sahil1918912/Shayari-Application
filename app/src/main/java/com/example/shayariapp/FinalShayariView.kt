package com.example.shayariapp

import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.primaryLight

@Preview
@Composable
fun PreviewFinalShayari() {
    FinalShayariView(finalShayari = "हारना तो तब है जब आप मान लेते हैं, जब तक आप नहीं मानते तब तक आप नहीं हारते।")
}


@Composable
fun FinalShayariView(finalShayari: String) {
    Surface() {

        val content = LocalContext.current
        val clipboardManager: ClipboardManager = LocalClipboardManager.current
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryColor),
            contentAlignment = Alignment.Center
        ) {

            Column() {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    colors = CardDefaults.cardColors(primaryLight.copy(0.8f)),
                    shape = RoundedCornerShape(15.dp),
                    border = BorderStroke(width = 2.dp, color = Color.White)
                ) {
                    Box(modifier = Modifier.fillMaxWidth())
                    {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(25.dp),
                            text = finalShayari,
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card(
                        modifier = Modifier
                            .size(55.dp, 40.dp)
                            .clickable {
                                val shareIntent = Intent().apply {
                                    action = Intent.ACTION_SEND
                                    putExtra(Intent.EXTRA_TEXT, finalShayari)
                                    type = "text/plain"
                                }
                                startActivity(content, shareIntent,null)
                            },
                        colors = CardDefaults.cardColors(primaryLight.copy(0.8f)),
                        shape = RoundedCornerShape(100.dp),
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_share),
                                contentDescription = "share",
                                tint = Color.White
                            )
                        }
                    }

                    Card(
                        modifier = Modifier
                            .size(55.dp, 40.dp)
                            .clickable {
                                clipboardManager.setText(
                                    AnnotatedString(
                                        finalShayari.toString()
                                    )
                                )
                                Toast
                                    .makeText(
                                        content,
                                        "Text Copied Successfully!!",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            },
                        colors = CardDefaults.cardColors(primaryLight.copy(0.8f)),
                        shape = RoundedCornerShape(100.dp),
                    ) {
                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        )
                        {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_copy),
                                contentDescription = "share",
                                tint = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}