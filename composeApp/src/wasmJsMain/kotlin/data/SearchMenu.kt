package data

data class SearchMenu (
    val id: Int,
    val text: String
)

val searchMenu = listOf(
    SearchMenu(0, "All"),
    SearchMenu(1, "Experience"),
    SearchMenu(2, "Projects"),
    SearchMenu(3, "Education"),
    SearchMenu(4, "Images"),
)