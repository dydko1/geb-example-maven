package pages1

import geb.Page

class O2MiroPage extends Page {

    static at = { title == "Poczta o2 - najszybciej rozwijająca się poczta" }
    //static at = { heading.isDisplayed() }
    static content = {
        //showPiwo { $("a", text:"Piwo",0) }
        //login { $('#login') }
        login { $('.form__input').eq(0) } //by class
        password { $('#password') }
        btn { $('#login-button') }
        //btn2 { $("#searchInput") }
        btn2 { $(".search-input") }
        link1{$("a").eq(0)}
        //btn2 {$(".sc-fhYwyz.iQYzNO")}
    }
}
