package pages1

import geb.Page

class MainPageMiro extends Page {

    static at = { title == "Wikipedia, wolna encyklopedia" }
    //static at = { heading.isDisplayed() }
    static content = {
        showPiwo { $("a", text:"Piwo",0) }
        //heading {$("h1#firstHeading", text:"Wikipedia:Strona główna")}
        // artykulNaMedal { $('#main-page-featured-article') }
    }
}
