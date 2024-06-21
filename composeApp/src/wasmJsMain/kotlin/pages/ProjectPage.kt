package pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.map_image
import common_ui.*
import data.*
import org.jetbrains.compose.resources.painterResource

@Composable
fun project(modifier: Modifier = Modifier) {

    val questionsList = remember { pageAllQuestionsList.toMutableStateList() }
    var currentId by remember { mutableIntStateOf(-1) }

    Row (modifier = modifier.fillMaxWidth()) {

        Column (modifier = modifier.weight(1f)) {

            //============================LATEST COMPANY, PROJECT, EDUCATION=================================
            LazyColumn(modifier = modifier.padding(top = 10.dp)) {

                items(projectsListPre) {
                    latestCommon(it,modifier)
                }

                item {
                    Text(
                        text = "People also ask",
                        color = Color(0XFFE8E8E8),
                        fontSize = 20.sp,
                        modifier = modifier.padding(top = 12.dp)
                    )

                    horizontalLine(modifier.padding(top = 6.dp))
                }

                items(projectsQuestions) { questions ->

                    questionsItem(
                        question = questions,
                        currentId,
                        onClickOpen = { id ->
                            currentId = if (currentId == id) -1 else id
                        }
                    )
                }

                item {
                    Spacer(modifier = modifier.padding(top = 10.dp))
                }
                items(projectsListPost) {
                    latestCommon(it,modifier)
                }

                item {
                    Spacer(modifier = modifier.padding(vertical = 100.dp))
                }

            }
        }

        verticalLine(modifier = modifier.padding(horizontal = 10.dp, vertical = 30.dp))

        Column (modifier = modifier.weight(1f)){
            sideInfo()
        }
    }
}