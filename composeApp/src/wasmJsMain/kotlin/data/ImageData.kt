package data

import aoogle.composeapp.generated.resources.*
import org.jetbrains.compose.resources.DrawableResource

data class ImageData (val id: Int,
    val image: DrawableResource,
    val title: String,
    val description: String,
)



val imageList = listOf(

    ImageData(0,Res.drawable.logo_boss,"Boss Sab Dekhta Hai","Boss | Tracking | Hospital | Visiting"),
    ImageData(1,Res.drawable.logo_erxpharma,"ERxPharmaPro","Doctor Software Service | Doctor | Digital Prescription | OPD | IPD"),
    ImageData(2,Res.drawable.logo_innovations, Details.COMPANY.INNOVATIONS,"IT Company | Service base Company in Nashik | Software Developments"),
    ImageData(3,Res.drawable.logo_mobihive,Details.COMPANY.MOBIHIVE,"Fintech service | mobile on Credit | Buy Now Pay Later"),
    ImageData(4,Res.drawable.logo_credithive,"CreditHive | Easy Smartphone Credit","CreditHive London, Africa | Mobile on Credit"),

    ImageData(5,Res.drawable.logo_glasswing,"Glasswing Partner, Consignment","Goods deliver in PAN | Affordable Shifting | Goods Tracking Shifting Company"),
    ImageData(6,Res.drawable.logo_gmd,"11th, 12th Collage","Best Collage | Collage in Sinnar | Science Collage in Nashik | MVP"),
    ImageData(7,Res.drawable.logo_grampanchayat,"Grampanchayat App for Village","Local App | Grampanchayat | Gramin App | Rural App"),
    ImageData(8,Res.drawable.logo_kichenbaba,"Food Delivery Partner","Online Food Order | Zomato | Local Hotel | Online Food Order"),
    ImageData(9,Res.drawable.logo_m3_compose,"App in Jetpack Compose of Material-3","Learning | Education | Compose App | Learn Jetpack Compose | Material 3"),

    ImageData(10,Res.drawable.avatar,"My Profile Avatar","Avatar | Profile Pic | DP | Gmail Account"),
    ImageData(11,Res.drawable.ic_google,"Google","Google, Account, Gmail, Company, US Based Company, Career"),
    ImageData(12,Res.drawable.ic_github,"GitHub/pwraxe","Github repo, code, github Project | Github account, profile"),
    ImageData(13,Res.drawable.ic_linkedin,"LinkedIn/AkshayPawar","LinkedIn | Profile, account, Linkedin member, working at, profile"),
    ImageData(14,Res.drawable.ic_leetcode,"Leetcode/AkshayPawar","Leetcode| LC | Problem solved, DSA, Language, LC Level, premium?, min problems"),


    ImageData(15,Res.drawable.logo_mobile_llc,Details.COMPANY.PROGRAMMING,"Mobile Company, Mobile Development Company, Service based Company, Pune Branch"),
    ImageData(16,Res.drawable.logo_pinnale,Details.COMPANY.PINNACLE,"First Company | Service Based company, Pune based company"),
    ImageData(17,Res.drawable.logo_sky_recharge,"Online Sky Recharge Service","Online Recharge, Recharge App | Mobile App for multi recharge"),
    ImageData(18,Res.drawable.logo_svit,"SVIT Nashik","Engineering Collage in Nashik | Engineering, Pharmacy, Pravara | Degree Collage"),
    ImageData(19,Res.drawable.logo_the_guru,"The Guru App","Seva, Satsang | The guru")

    //Add Certificates
)