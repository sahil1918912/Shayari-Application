package com.example.shayariapp

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.shayariapp.routing.ShayariRoutingItem
import com.example.shayariapp.ui.theme.primaryColor
import com.example.shayariapp.ui.theme.primaryLight

@Composable
fun CategoryScreen(navHostController: NavHostController) {
    Surface() {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(primaryColor)
        ) {

            Column() {
                MainToolBar(title = "Category") {

                }

                LazyColumn() {
                    items(getList()) { item ->
                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(80.dp)
                                .padding(start = 10.dp, end = 10.dp, top = 15.dp)
                                .clickable {
                                    navHostController.navigate(ShayariRoutingItem.shayariListScreen.route + "/${item.title.toString()}")
                                },
                            colors = CardDefaults.cardColors(primaryLight)
                        ) {
                            Text(
                                text = item.title.toString(),
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp,
                                color = Color.White,
                                modifier = Modifier.padding(start = 15.dp, top = 18.dp)
                            )
                        }
                    }
                }
            }


        }
    }
}