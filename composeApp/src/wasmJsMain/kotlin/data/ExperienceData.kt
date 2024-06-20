package data

import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.avatar
import aoogle.composeapp.generated.resources.img_mobile_llc
import org.jetbrains.compose.resources.DrawableResource


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
        image = Res.drawable.img_innovations,
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


val experienceQuestionsList = listOf(
    QuestionsTemplates(
        id = 0,
        question = "can you tell me something about yourself?",
        answer = "Myself Akshay Pawar having 3+ years of experience to worked on Native Android with Kotlin, I have worked on 15+ apps among them few are existing and most of then are from scratch and hosted 10+ apps on Play store including self crafted app",
    ),

    QuestionsTemplates(
        id = 1,
        question = "How many project you have done?",
        answer = "I have worked on around 20 projects till now, few of them are form existing to make it stable and most of them are from scratch including finance, security, social media, food and drink, health, educational etc domain."
    ),

    QuestionsTemplates(
        id = 2,
        question = "What is your tech-stack?",
        answer = "I usually preferred to work mostly on kotlin, apart from this I also worked on XML, MYSQL, Firebase, HTML, CSS, JS, Java"
    ),

    QuestionsTemplates(
        id = 3,
        question = "Why Kotlin?",
        answer = "When I started my career, In 2017 Google has announced Kotlin as supportive language for android, I seen kotlin as future because Kotlin has multiple flavor to worked on like Android, KMM(KMP), Server-Side (Ktor), Data Science, and Java Interoperable, That's Why Kotlin 😍"
    )
)