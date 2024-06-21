package pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyHorizontalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import aoogle.composeapp.generated.resources.*
import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.img_mobile_llc
import aoogle.composeapp.generated.resources.img_svit
import aoogle.composeapp.generated.resources.map_image
import org.jetbrains.compose.resources.painterResource
import kotlin.random.Random


@Composable
fun images(modifier: Modifier = Modifier) {

    val imageList = listOf(
        Res.drawable.img_mobile_llc,
        Res.drawable.map_image,
        Res.drawable.img_svit,
        Res.drawable.img_m3_compose,
        Res.drawable.img_innovations
    )

    LazyVerticalStaggeredGrid(StaggeredGridCells.Adaptive(240.dp)) {
        items(40) {
            Image(
                painter = painterResource(imageList[it % imageList.size]),
                contentDescription = "",
                modifier = modifier
                    .padding(5.dp)
                    .clip(RoundedCornerShape(10.dp))
                , contentScale = ContentScale.Crop
            )
        }
    }
}