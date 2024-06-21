package data

import aoogle.composeapp.generated.resources.Res
import aoogle.composeapp.generated.resources.img_m3_compose
import common_ui.MapItemData

val educationData  = listOf(

    PageAllItemData(image = Res.drawable.img_m3_compose,
        heading = "Bachelor Degree (IT)",
        url = "https://svitnashik.in/",
        title = "SVIT Nashik",
        desc = "The establishment of the SVIT in 1998-99, symbolized achievement of academic excellence, quality education from preprimary to collegiate level by PRES Loni, by Late Padmashri Dr. Vitthalrao Vikhe Patil in 1964.",
        duration = "March 2014 - June 2019",
        location = "Nashik",
        extraStr = "68.14 %",
        isFullTime = false
    ),

    PageAllItemData(image = Res.drawable.img_m3_compose,
        heading = "Higher Secondary (HSC)",
        url = "https://www.gmdcollege.in/",
        title = "GMD Collage Sinnar",
        desc = "This  College is one of the leading institutions of higher education imparting student-centric knowledge in Nashik district of Maharashtra state. The college recently celebrated its Golden Jubilee year in 2019-20.",
        duration = "March 2012 - Feb 2014",
        location = "Sinnar",
        extraStr = "56.31%",
        isFullTime = false,
        isUrlSafe = false
    ),

    PageAllItemData(image = Res.drawable.img_m3_compose,
        heading = "Secondary School (SSC)",
        url = "https://tinyurl.com/lsb-waje-vidyalay",
        title = "L.S.B. Waje Vidyalay Sinnar",
        desc = "Get map of LSB Waje Vidyalaya Sinnar, Sinnar, Maharashtra, 422103 by Mappls. Find location,directions,places & brands near LSB Waje Vidyalaya Sinnar",
        duration = "June 2007 - May 2012",
        location = "Sinnar",
        extraStr = "69.82%",
        isFullTime = false,
    ),

    PageAllItemData(image = Res.drawable.img_m3_compose,
        heading = "Primary School",
        url = "https://mvp.edu.in/mvpsite/primary-schools/7",
        title = "Abhinav Bal Vikas Mandir, Sinnar",
        desc = "ABHINAV BALVIKAS MANDIR SINNAR was established in 1990 and it is managed by the Pvt. Aided. It is located in Urban area. It is located in SINNAR block of NASHIK district of Maharashtra.",
        duration = "June 2003 - May 2007",
        location = "Sinnar",
        isFullTime = false,
        extraStr = "69.82%"
    )
)

val educationQuestion = listOf (

    QuestionsTemplates(
        id = 1,
        question = "Why did you choose SVIT and GMD collage?",
        answer = "GMD collage was near to my home by walking distance, and this collage is well recognized in MVP Community, same in 2014 IT dept. in SVIT having poor admission, I got into it by scholarship scheme with less fees.",
        isOpen = false
        ),

    QuestionsTemplates(
        id = 1,
        question = "What kind of study you did at svit and gmd",
        answer = "I took Science in GMD Collage, and IT in SVIT to learn More about technology problem solving tactics.",
        isOpen = false
    ),

    QuestionsTemplates(
        id = 1,
        question = "Why Red warning at GMD Link?",
        answer = "When I visit that site, My antivirus software blocking me visiting site, same thing should not done with visitors hence I shows red icon",
        isOpen = false
    ),
)


val educationLocation = listOf(

    MapItemData (
        title = "SVIT Nashik",
        address = "Nashik - Shirdi Rd, Svit, Maharashtra 422102",
        hours = "Open: 8 AM - 6 PM",
        websiteUrl = "https://svitnashik.in/",
        directionUrl = "https://maps.app.goo.gl/aY4Srjjw5X2A2iaXA"
    ),

    MapItemData(
        title = "GMD Collage, Sinnar",
        address = "Nashik-Pune Highway, Sinner Ta: Sinnar Dist: Nashik Pincode: 422103",
        hours = "Open: 8 AM - 6 PM",
        websiteUrl = "https://www.gmdcollege.in/",
        directionUrl = "https://maps.app.goo.gl/L8qtdaSfFrLkXkph7"

    ),

    MapItemData(
        title = "LSB Waje Vidyalay, Sinnar",
        address = "Near Sinnar Bus Stand, RXVW+J4M, Sinnar, Maharashtra 422103",
        hours = "Open: 8 AM - 6 PM",
        directionUrl = "https://maps.app.goo.gl/8f1L4Tic2WpnR1LMA"

    ),

    MapItemData(
        title = "Abhinav Bal Vikas Mandir, Sinnar",
        address = "Near Sinnar bus Stand, RXVW+J4M, Sinnar, Maharashtra 422103",
        hours = "Open: 8 AM - 2 PM",
        directionUrl = "https://maps.app.goo.gl/5HJy9uqwELNzj9Hr7"

    )
)