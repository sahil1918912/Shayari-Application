package com.example.shayariapp

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shayariapp.model.ShayariModel
import com.example.shayariapp.ui.theme.primaryLight


@Preview()
@Composable
fun MainToolBarPreview() {
    MainToolBar(title = "Category", {  })
}


@Composable
fun MainToolBar(title: String, onClick: ()->Unit ) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .height(60.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .size(45.dp)
                .clickable {
                    onClick.invoke()
                },
            colors = CardDefaults.cardColors(primaryLight),
            shape = RoundedCornerShape(
                CornerSize(100.dp)
            ),
        ) {
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                Icon(
                    painter = painterResource(id = R.drawable.back_img),
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }
        Text(
            text = title,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(start = 25.dp)
        )
    }
}

fun getList() : List<ShayariModel> {
    return listOf<ShayariModel>(
        ShayariModel(
            "Love", listOf(
                "इश्क़ वो नहीं जो ज़ुबान से बयां हो, इश्क़ तो वो है जो आँखों से बयां हो।",
                "दिल को धड़कना सिखा दिया आपने, हर धड़कन को एक नया सपना दिखा दिया आपने।",
                "प्यार में कोई तो दिल तोड़ देता है, दोस्ती में कोई तो भरोसा तोड़ देता है।",
                "मोहब्बत की कोई हद नहीं होती, मोहब्बत हद से परे होती है।",
                "तू मेरी धड़कन, तू मेरी जान है, तू ही मेरे दिल का अरमान है।",
                "तुम्हारे बिना ये वक्त ये लम्हे, कैसे गुजारू हर दिन तन्हाई में।",
                "तू है तो सब कुछ अच्छा लगता है, तू नहीं तो कुछ भी अच्छा नहीं लगता।",
                "तू मेरे दिल की धड़कन है, तू मेरी आँखों की चमक है।",
                "तेरे बिना ये आलम नहीं गुजार सकता, तेरे बिना ये दिल किसी और का नहीं हो सकता।",
                "तेरे बिना ये दिल किसी और को नहीं चाहता, तेरे बिना ये दिल उदास रहता है।"
            )
        ),
        ShayariModel(
            "Friendship", listOf(
                "दोस्ती का मतलब ही अनमोल होता है, ये रिश्ता सभी रिश्तों से अनमोल होता है।",
                "दोस्त वो नहीं जो वक्त के साथ बदल जाए, दोस्त वो है जो वक्त बदल दे।",
                "हर मुश्किल को आसान बना देते हैं दोस्त, हर दर्द को खुशी में बदल देते हैं दोस्त।",
                "दोस्ती की मिसालें तो बहुत मिलेंगी, पर सच्ची दोस्ती हर किसी को नहीं मिलती।",
                "दोस्त वो होता है जो मुश्किल वक्त में काम आए, बाकी सब तो सिर्फ नाम के होते हैं।",
                "दोस्ती में शक नहीं होता, दोस्ती में सिर्फ विश्वास होता है।",
                "दोस्त वो होता है जो हमारे दिल की बातें समझ ले, बिना कहे ही हमारी भावनाओं को जान ले।",
                "सच्चे दोस्त वो होते हैं जो मुश्किल वक्त में भी साथ निभाते हैं।",
                "दोस्त वो होते हैं जो हमारे बुरे वक्त में भी साथ खड़े होते हैं।",
                "दोस्ती का मतलब ही खास होता है, सच्चे दोस्त जिंदगी को खास बना देते हैं।"
            )
        ),
        ShayariModel(
            "Motivational", listOf(
                "सपनों को सच करने से पहले सपने देखना जरूरी है।",
                "कामयाबी उन्हीं को मिलती है, जिनके सपनों में जान होती है।",
                "हारना तो तब है जब आप मान लेते हैं, जब तक आप नहीं मानते तब तक आप नहीं हारते।",
                "जितना कठिन संघर्ष होगा, जीत उतनी ही शानदार होगी।",
                "बिना मेहनत के सफलता का कोई मोल नहीं होता।",
                "समय और स्थिति कभी भी बदल सकती है, इसलिए मेहनत करते रहो।",
                "हर बड़ी सफलता के पीछे एक बड़ी संघर्ष की कहानी होती है।",
                "संघर्ष ही सफलता का सबसे बड़ा रहस्य है।",
                "अपने सपनों को पाने के लिए मेहनत करो, क्योंकि सपने देखने वालों के ही सपने सच होते हैं।",
                "हार मत मानो, क्योंकि असली जीत की कहानी हार के बाद ही शुरू होती है।",
                "जो लोग अपने सपनों का पीछा नहीं करते, वो दूसरों के सपनों के लिए काम करते हैं।",
                "अगर आप में आत्मविश्वास है तो आप कुछ भी कर सकते हैं।",
                "बिना जोखिम के कुछ भी बड़ा नहीं हासिल होता।",
                "सफलता उन्हीं को मिलती है जो उसे पाने के लिए संघर्ष करते हैं।",
                "समय बहुत कीमती है, इसे व्यर्थ मत गवाओ।"
            )
        ),
        ShayariModel(
            "Sad", listOf(
                "दिल से प्यार करने वालों का कभी दिल नहीं भरता, चाहे कितना भी दर्द मिल जाए।",
                "जिन्हें हम सबसे ज्यादा चाहते हैं, वही लोग हमें सबसे ज्यादा दर्द देते हैं।",
                "दर्द वो नहीं जो दिखता है, दर्द वो है जो सहा जाता है।",
                "कभी-कभी जिंदगी में दर्द का भी एक अपना मजा होता है।",
                "आँसू वो नहीं जो आँख से बहते हैं, आँसू वो हैं जो दिल से बहते हैं।",
                "जिंदगी में हर किसी को हर चीज नहीं मिलती, कभी किसी को कुछ नहीं मिलता।",
                "दर्द दिल का होता है, और दर्द का इलाज भी दिल ही होता है।",
                "जिसे हम सबसे ज्यादा चाहते हैं, वही हमें सबसे ज्यादा दर्द देता है।",
                "दिल से पूछो तो दर्द की कोई सीमा नहीं होती।",
                "दर्द भरे दिन और रातें हमें अकेला बना देती हैं।",
                "दर्द की कोई भाषा नहीं होती, दर्द की कोई आवाज नहीं होती।",
                "दिल टूटने का दर्द सबसे ज्यादा होता है।",
                "कभी-कभी हम किसी के लिए सब कुछ होते हैं, और कभी-कभी हम किसी के लिए कुछ भी नहीं होते।",
                "दर्द को सहना भी एक कला है।",
                "दिल की बातें दिल में ही रह जाती हैं।"
            )
        ),
        ShayariModel(
            "Nature", listOf(
                "प्रकृति का हर रंग हमें कुछ न कुछ सिखाता है।",
                "पेड़, पौधे, और फूल जीवन का असली आनंद देते हैं।",
                "सूरज की किरणें हमें नई उम्मीदें देती हैं।",
                "प्रकृति की सुंदरता अनमोल होती है।",
                "बारिश की बूंदें दिल को सुकून देती हैं।",
                "पक्षियों की चहचहाहट हमें खुशियों का एहसास दिलाती है।",
                "प्रकृति हमें हर दिन एक नया सबक सिखाती है।",
                "पहाड़ों की ऊँचाई हमें जीवन में ऊँचाइयों की याद दिलाती है।",
                "नदियों की बहती धारा हमें निरंतरता का संदेश देती है।",
                "समुद्र की लहरें हमें जीवन के उतार-चढ़ाव का एहसास कराती हैं।",
                "प्रकृति का हर स्वरूप हमें प्रेरित करता है।",
                "जंगल की शांति हमें आंतरिक शांति का अनुभव कराती है।",
                "फूलों की खुशबू हमें सकारात्मक ऊर्जा देती है।",
                "बादलों का घुमड़ना हमें उम्मीद की नई किरणें दिखाता है।",
                "प्रकृति का हर नजारा अद्वितीय और अद्भुत होता है।"
            )
        )
    )
}