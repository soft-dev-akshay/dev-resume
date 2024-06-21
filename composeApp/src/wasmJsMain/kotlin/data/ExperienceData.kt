package data

import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.img_mobile_llc
import kotlinx.browser.window
import kotlinx.datetime.*
import org.jetbrains.compose.resources.DrawableResource
import kotlin.time.*

data class ExperienceData (
    val id: Int,
    val image: DrawableResource,
    val titlePosition: String,
    val websiteLink: String,
    val companyName: String,
    val duration: String,
    val workMode: String,
    val workLocation: String,
    val workType: String,
    val bulletPoints: List<String>
)

val experienceList = listOf(
    ExperienceData(
        id = 1,
        image = Res.drawable.img_mobile_llc,
        titlePosition = "Software Developer",
        websiteLink = "https://www.programming.com/",
        companyName = "Mobile Programming India Pvt. Ltd.",
        duration = "May 2024 - Present",
        workMode = "Full-Time",
        workLocation = "Pune, MH",
        workType = "On-Site (WFO)",
        bulletPoints = listOf(
            "Working at Client Side"
        )
    ),

    ExperienceData(
        id = 2,
        image = Res.drawable.img_mobile_llc,
        titlePosition = "Sr. Android Developer",
        websiteLink = "https://mobihivelabs.com/",
        companyName = "MobiHive Labs Limited London",
        duration = "Sept 2022 - April 2023",
        workMode = "Full Time",
        workLocation = "Sinnar, MH",
        workType = "Remote (WFH)",
        bulletPoints = listOf(
            "Design and Develop from scratch to reduce agent time by 30-50%.",
            "Amplified customer contentment by 20% through the empowerment of agents with a stream lined mobile app.",

            "Elevated customer validation rates by 40% and mitigated fake photos and impersonation by 50%  through the implementation of live image capturing." ,
            "Mastered CRM workflows at 80-90% proficiency, aiding rapid onboarding for new team members.",
            "Led 40% customer base growth, lightened agent workloads by 50% with the self-service Customer App.",
            "Independently resolved 2-5% of agent queries, achieving a 45-60% satisfaction rate and driving a substantial 40% enhancement in CRM efficiency"
        )
    ),

    ExperienceData(
        id = 3,
        image = Res.drawable.img_mobile_llc,
        titlePosition = "Sr. Android Developer",
        websiteLink = "https://innovationshub.in/",
        companyName = "InnovationsHub Services Pvt. Ltd.",
        duration = "Oct 2021 - Sept 2022",
        workMode = "Full Time",
        workLocation = "Nashik, MH",
        workType = "Hybrid",
        bulletPoints = listOf(
            "App (Kitchenbaba): Enhanced app stability and performance by 30% resolving 20% of existing bugs.",
            "App (Project Mamta): Slashed client costs by 40-45% on agent fuel, achieving a 20% boost in location accuracy, resulting in a 40% revenue increase.",
            "App (Sky Recharge): Drove a 40% surge in the client sales via the development and implementation, expanded distributor network by 20%, and processed 10-15 lakh transactions in the last 6-8 months.",
            "App (Parrot4Business): Took initiative of clients achieve their objectives, reducing communication gaps by 60% increasing sales by 20% and fostering customer acquisition and retention through the app.",
            "Productivity: Optimized company operations, reducing costs by 40-60% by streamlining design processes, while building a 40% increase in trust through consistent on-time delivery.",
            "Productivity: Mentored junior developers, boosting their productivity by 30%."
        )
    ),

    ExperienceData(
        id = 3,
        image = Res.drawable.img_mobile_llc,
        titlePosition = "Software Developer",
        websiteLink = "https://www.pinnacleit.in/",
        companyName = "Pinnacle IT Solution",
        duration = "Oct 2021 - Sept 2022",
        workMode = "Full Time",
        workLocation = "Sinnar, MH",
        workType = "Remote (WFH)",
        bulletPoints = listOf(
            "App (Glasswing [Old]): Enhanced app performance by 40% through proactive bug and crash resolution.",
            "App: (Glasswing [New]): Created a sleek new application with a contemporary UI from the ground up.",
            "Productivity: Expanded the user base by 10% and revenue by 30% with a user-centric app, enhancing engagement  and overall experience.",
            "Productivity: Cross-team collaboration, leading to a 10% boost in productivity.")
    )
)

//Ref: https://github.com/Kotlin/kotlinx-datetime?tab=readme-ov-file

fun getTotalExperience(): String {

    val currentTime = Clock.System.now().toLocalDateTime(TimeZone.UTC)

    val currentYear = currentTime.year
    val currentMonth = currentTime.month
    val currentDate = currentTime.dayOfMonth

    val start = LocalDate.parse("2019-07-19")
    val end = LocalDate.parse("${currentYear}-${currentMonth}-${currentDate}")

    val totalMonths = start.monthsUntil(end)
    val years = totalMonths / 12
    val months = totalMonths % 12

    return "$years years and $months Months"
}
fun getActualExperience(): Double {
    return 3.0
}
fun getFreelanceExperience(): Double {
    return 1.0
}

val experienceQuestionsList = listOf(
    QuestionsTemplates(
        id = 0,
        question = "What is your total Experience?",
        answer = "It has been ${getTotalExperience()} years in IT industry where I am having ${getActualExperience()} year of actual experience ${getFreelanceExperience()} years is freelancing expedience"
    ),

    //Total: 48m = 4 years
    // Free: 8 + 8 = 16m = 1 year 4m
    // 9m + 12m + 9m + 2m =  32m = 2y 8m


    QuestionsTemplates(
        id = 1,
        question = "Why did you start career with kotlin?",
        answer = "I have worked on around 20 projects till now, few of them are form existing to make it stable and most of them are from scratch including finance, security, social media, food and drink, health, educational etc domain."
    ),

    QuestionsTemplates(
        id = 2,
        question = "Why did you join same company again in May 2023?",
        answer = "I usually preferred to work mostly on kotlin, apart from this I also worked on XML, MYSQL, Firebase, HTML, CSS, JS, Java"
    ),

    QuestionsTemplates(
        id = 3,
        question = "What is best thing you learn from your career or experience or senior?",
        answer = "When I started my career, In 2017 Google has announced Kotlin as supportive language for android, I seen kotlin as future because Kotlin has multiple flavor to worked on like Android, KMM(KMP), Server-Side (Ktor), Data Science, and Java Interoperable, That's Why Kotlin 😍"
    )
)