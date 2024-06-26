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
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
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
import utils.getActualExperience
import utils.getAge


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
                    modifier = modifier.size(22.dp),
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
            color = Color(0XFFBDC1C6))

        Spacer(modifier = modifier.padding(6.dp))

        Row {
            Text(
                text = "Born: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "10 July 1996 (age ${getAge()} years), ",
                color = Color.White
            )
            Text(
                text = "Surat, Gujrat",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://maps.app.goo.gl/Vq3CD4yDLS7xb3LG6")
                }
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Education: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "Bachelor Degree (IT), ",
                color = Color.White
            )
            Text(
                text = "Pune University (2019)",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://maps.app.goo.gl/RoRQ1v7V8ieN2TPr8")
                }
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Experience: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "${getActualExperience()}+ years in Native Android",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Awards: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)
            Text(
                text = "3rd Rank in Class (2017)",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Tech Stack: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)

            Text(
                text = "Android, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://developer.android.com")
                }
            )

            Text(
                text = "Kotlin, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://kotlinlang.org/")
                }
            )

            Text(
                text = "Ktor, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://ktor.io/")
                }
            )

            Text(
                text = "Jetpack Compose, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://developer.android.com/develop/ui/compose")
                }
            )

            Text(
                text = "XML, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://en.wikipedia.org/wiki/XML")
                }
            )

            Text(
                text = "DSA, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://techdevguide.withgoogle.com/paths/data-structures-and-algorithms/")
                }
            )
        }
        Row {
            Text(
                text = "Firebase, RestAPI, MySQL",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Android Apps: ",
                fontWeight = FontWeight.Bold,
                color = Color.White)

            Text(
                text = "Glasswing Partner, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://play.google.com/store/apps/details?id=in.glasswing.partner")
                }
            )

            Text(
                text = "SKy Recharge, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://play.google.com/store/apps/details?id=com.skyonlinerechargeservices")
                }
            )

            Text(
                text = "ERxPharmaPro, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://play.google.com/store/apps/details?id=com.svsion.erxpharma")
                }
            )

            Text(
                text = "M3 Compose, ",
                color = Color(0XFF99C3FF),
                modifier = modifier.pointerHoverIcon(icon = PointerIcon.Hand).clickable {
                    uriHandler.openUri("https://play.google.com/store/apps/details?id=com.codexdroid.m3compose")
                }
            )
        }

        Row {
            Text(
                text = "Project Mamta, Parrot4Business, CreditHive POS",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Area worked on: ",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
            Text(
                text = "Goods Delivery, Food and Drink, Food Delivery, Health, Finance",
                color = Color.White
            )
        }
        Row {
            Text(
                text = "Medical, Educational",
                color = Color.White
            )
        }

        Spacer(modifier = modifier.padding(top = 6.dp))

        Row {
            Text(
                text = "Interest: ",
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Text(
                text = "Music, Coding, Driving, Gaming, Travelling, Shopping",
                color = Color.White
            )
        }


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
            .pointerHoverIcon(icon = PointerIcon.Hand)
            .clickable {
                onIconClicked()
            }
    )

}