import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.window.ComposeViewport
import common_ui.sideInfo
import kotlinx.browser.document
import pages.homePage
import pages.searchPage
import utils.PAGE

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        MaterialTheme {
            starter()
        }

    }
}

@Composable
fun starter() {
    var currentPage by remember { mutableStateOf(PAGE.HOME.name) }
    val localUri = LocalUriHandler.current
    when (currentPage) {
        PAGE.HOME.name -> homePage(
            onNavigate = {
                currentPage = PAGE.SEARCH.name
            },
            onViewResume = {
                localUri.openUri("https://pwraxe.github.io/compose/profile/assets/Akshay_Pawar_Android_Resume.pdf")
            }
        )
        PAGE.SEARCH.name -> searchPage(onNavigate = {
            currentPage = PAGE.HOME.name
        })
        else -> sideInfo()
    }
}















