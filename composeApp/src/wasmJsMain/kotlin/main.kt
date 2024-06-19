import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import kotlinx.browser.document
import pages.searchPage

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    ComposeViewport(document.body!!) {
        starter()
    }
}

@Composable
fun starter() {
    MaterialTheme {
        //homePage()
        searchPage()
        //sideInfo()
    }
}















