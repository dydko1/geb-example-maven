package pages2

import geb.Page

//import geb.module.Select

class DemoGuruRegisterPage extends Page {

    static at = { title == "Login Page" }
    static url= "test/login.html"
    //static at = { heading.isDisplayed() }
    static content = {

        /*
        firstName(wait: true) { $(name: "firstName") }
        lastName(wait: true) { $(name: "lastName") }
        phone(wait: true) { $(name: "phone") }
        email(wait: true) { $(name: "userName") }
        country(wait: true) { $('select', name: 'country') }//.module(Select) }
        btn { $(name: "submit") }
        link1 {$(text: "sign-in")}
         */
    }
}
//$("form").servClass = "First"
//country { $(By.name("country")) }
//signON { $(".mouseOut a", 1) }
/*
//showPiwo { $("a", text:"Piwo",0) }
//login { $('#login') }
login { $('.form__input').eq(0) } //by class
password { $('#password') }
btn { $('#login-button') }
//btn2 { $("#searchInput") }
btn2 { $(".search-input") }
link1{$("a").eq(0)}
//btn2 {$(".sc-fhYwyz.iQYzNO")}
 */