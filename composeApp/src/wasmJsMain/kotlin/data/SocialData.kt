package data

import aoogle.composeapp.generated.resources.*
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.ic_gmail
import aoogle.composeapp.generated.resources.ic_google
import aoogle.composeapp.generated.resources.ic_linkedin
import org.jetbrains.compose.resources.DrawableResource

data  class SocialData(val id: Int, val icon: DrawableResource,val name:String, val url: String,)

val socials = listOf(
    SocialData(id = 1, Res.drawable.ic_gmail,"Gmail", "pawarakshay13@gmail.com"),
    SocialData(id = 2, Res.drawable.ic_google,"Google", url = "https://g.dev/akshay96"),
    SocialData(id = 3, Res.drawable.ic_linkedin,"LinkedIn", url = "https://www.linkedin.com/in/akshay-pawar-b7a0a8135"),
    SocialData(id = 4, Res.drawable.ic_playstore,"Play Store", url = "https://play.google.com/store/apps/details?id=com.codexdroid.m3compose"),
    SocialData(id = 5, Res.drawable.ic_leetcode,"Leetcode", url = "https://leetcode.com/pawarakshay13"),
    SocialData(id = 6, Res.drawable.ic_github,"GitHub", url = "https://github.com/pwraxe"),
    SocialData(id = 7, Res.drawable.ic_internet,"Jetpack Compose", url = "https://pwraxe.github.io/compose/index.html"),
)