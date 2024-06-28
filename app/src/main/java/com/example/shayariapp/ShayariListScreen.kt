package com.example.shayariapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayariapp.routing.ShayariRoutingItem
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.primaryLight

@Preview
@Composable
fun PreviewShayariScreen() {
    ShayariListScreen(title = "Love")

}

@Composable
fun ShayariListScreen(navHostController: NavHostController? = null, title: String?) {

    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = primaryColor)
        ) {

            Column() {
                MainToolBar(title = title.toString()) {
                }
                val myFinalList = getList().filter {
                    it.title == title.toString()
                }

                val finalList = myFinalList[0]

                finalList.list?.let { list ->
                    LazyColumn {
                        items(list) { item ->

                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 15.dp, end = 15.dp, top = 15.dp)
                                    .clickable {
                                        navHostController?.navigate(ShayariRoutingItem.finalShayariView.route+"/${item}")
                                    },
                                RoundedCornerShape(15.dp),
                                colors = CardDefaults.cardColors(primaryLight)
                            )
                            {
                                Text(
                                    text = item,
                                    color = Color.White,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(10.dp),
                                    textAlign = TextAlign.Center,
                                    fontSize = 18.sp
                                )
                            }


                        }
                    }
                }
            }


        }
    }

}