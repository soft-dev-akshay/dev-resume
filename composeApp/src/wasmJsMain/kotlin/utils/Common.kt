package utils

import kotlinx.datetime.*


//Ref: https://github.com/Kotlin/kotlinx-datetime?tab=readme-ov-file

enum class PAGE {
    HOME, SEARCH
}


private fun getTotalMonths(): Int {
    val currentTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)
    val start = LocalDate.parse("2019-07-19")

    val month = currentTime.month.number

    val end = LocalDate.parse("${currentTime.year}-${if (month in 1 .. 9) "0$month" else month}-${currentTime.dayOfMonth}")

    return start.monthsUntil(end)
}
fun getTotalExperience(): String {
    val totalMonths = getTotalMonths()
    return "${totalMonths / 12} years and ${totalMonths % 12} Months"
}
fun getActualExperience(): Double {
    return getTotalMonths().div(12) - getFreelanceExperience()
}
fun getFreelanceExperience(): Double {
    return 0.8
}

fun getAge(): Int {
    return Clock.System.now().toLocalDateTime(TimeZone.UTC).year - 1996
}