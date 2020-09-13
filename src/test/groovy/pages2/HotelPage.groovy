package pages2

import geb.Page

class HotelPage extends Page {

    static at = {
        title == "Booking List"
    }
    static url = "http://localhost:8080/"
    //static at = { heading.isDisplayed() }
    static content = {

        //divs { $("h1",0) }
        divs { $(".list", 1) }
    }
}
