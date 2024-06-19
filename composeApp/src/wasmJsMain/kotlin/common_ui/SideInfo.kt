package common_ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import aoogle.composeapp.generated.resources.ic_globe_asia
import data.SocialData
import data.socials
import org.jetbrains.compose.resources.painterResource


@Composable
fun sideInfo(modifier: Modifier = Modifier) {

    var socialId by remember { mutableIntStateOf(0) }
    var socialUri by remember { mutableStateOf("") }
    val uriHandler = LocalUriHandler.current

    Column (modifier = modifier
        .fillMaxSize()

        .padding(horizontal = 30.dp, vertical = 30.dp)
        .background(color = Color(0XFF202124))
    ) {

        Row (verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(Res.drawable.avatar),
                contentDescription = "Akshay Avatar",
                modifier = modifier
                    .size(56.dp)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop,
            )
            Column (modifier = modifier.padding(start = 16.dp)) {
                Text(
                    text = "Akshay Pawar",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )

                Row (
                    modifier = modifier.padding(top = 1.dp),
                    verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "Software Developer",
                        fontSize = 16.sp,
                        color = Color(0XFFBDC1C6)
                    )

                    smallDot()

                    Text(
                        text = "Android",
                        fontSize = 16.sp,
                        color = Color(0XFFBDC1C6)
                    )
                }
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically) {

            Row (
                modifier = modifier
                    .padding(top = 10.dp, bottom = 10.dp, end = 10.dp)
                    .border(
                        width = 1.dp,
                        color = Color(0XFFBDC1C6),
                        shape = CircleShape
                    )
                    .padding(horizontal = 10.dp, vertical = 3.dp),

                verticalAlignment = Alignment.CenterVertically
            ) {

                Icon(
                    painter = painterResource(Res.drawable.ic_globe_asia),
                    contentDescription = "Globe Asia",
                    modifier = modifier.size(24.dp),
                    tint = Color.White
                )

                Text(
                    text = "codexdroid.com",
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = modifier.padding(start = 4.dp)
                )
            }

            Icon(
                Icons.Default.CheckCircle,
                contentDescription = null,
                tint = Color(0XFF3DA288),
                modifier = modifier
                    .size(26.dp)
                    .align(alignment = Alignment.CenterVertically)
            )
        }

        Text(
            text = "I am a passionate and skilled Android developer with a strong interest in the " +
                    "\nlatest technologies, such as Kotlin. I am currently working as a Software Developer," +
                    "\nand I am excited to be pursuing my goal of becoming a Professional Android " +
                    "\ndeveloper at the Parent company. I am confident that the Skills and experience I have" +
                    "\ngained in my current role will prepare me well for the next stage of my career.",
            color = Color(0XFFBDC1C6)
        )

        Spacer(modifier = modifier.padding(6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Born: ")
            }
            withStyle(style = SpanStyle(color = Color.White)) {
                append("10 July 1996 (age 28 years), ")
            }

            withStyle(style = SpanStyle(color = Color(0XFF99C3FF))) {
                append("Surat, Gujrat")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Education: ")
            }
            withStyle(style = SpanStyle(color = Color.White)) {
                append("Bachelor Degree (IT), ")
            }
            withStyle(style = SpanStyle(color = Color(0XFF99C3FF))) {
                append("Pune University (2019)")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Experience: ")
            }
            withStyle(style = SpanStyle(color = Color.White)) {
                append("3.5+ years in Native Android")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Awards: ")
            }
            withStyle(style = SpanStyle(color = Color.White)) {
                append("3rd Rank in Class (2017)")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Tech Stack: ")
            }

            withStyle(style = SpanStyle(color = Color(0XFF99C3FF))) {
                append("Android, Kotlin, Ktor, Jetpack Compose, XML, DSA, ")
            }

            withStyle(style = SpanStyle(color = Color.White)) {
                append("\nFirebase, RestAPI, MySQL")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Android Apps: ")
            }

            withStyle(style = SpanStyle(color = Color(0XFF99C3FF))) {
                append("Glasswing Partner, Sky Recharge, ERxPharma, M3 Comopse, ")
            }

            withStyle(style = SpanStyle(color = Color.White)) {
                append("\nProject Mamta, Parrot4Business, CreditHive POS")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Area worked on: ")
            }
            withStyle(style = SpanStyle(color = Color.White)) {
                append("Goods Delivery, Food and Drink, Food Delivery, Health, Finance, \nMedical, Educational")
            }
        })

        Spacer(modifier = modifier.padding(top = 6.dp))

        Text(text = buildAnnotatedString {
            withStyle(
                SpanStyle(
                    fontWeight = FontWeight.W800,
                    color = Color.White
                )
            ) {
                append("Interest: ")
            }
            withStyle(style = SpanStyle(color = Color.White)) {
                append("Music, Coding, Driving, Gaming, Travelling, Shopping")
            }
        })

        HorizontalDivider(
            color = Color(0XFF313335),
            modifier = modifier
                .padding(top = 10.dp, bottom = 10.dp))


        Text(text = "Profiles",
            color = Color.White,
            fontSize = 16.sp,
        )

        LazyRow {
            items(socials) {
                socialView(it,{
                    socialUri = it.url
                    socialId = it.id
                })
            }
        }
    }


    when(socialId) {
        1 -> uriHandler.openUri(socialUri)
        2 -> uriHandler.openUri(socialUri)
        3 -> uriHandler.openUri(socialUri)
        4 -> uriHandler.openUri(socialUri)
        5 -> uriHandler.openUri(socialUri)
        6 -> uriHandler.openUri(socialUri)
        7 -> uriHandler.openUri(socialUri)
        else -> {}
    }
}

//val uriHandler = LocalUriHandler.current
//uriHandler.openUri(socialData.url)


@Composable
fun socialView(
    socialData: SocialData,
    onIconClicked: () -> Unit,
    modifier: Modifier = Modifier) {


    Image(
        painter = painterResource(socialData.icon),
        contentDescription = null,
        modifier = modifier
            .size(50.dp)
            .padding(horizontal = 8.dp)
            .clickable {
                onIconClicked()
            }
    )

}