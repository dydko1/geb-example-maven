package pages1

import geb.Page
//import geb.module.Select
import modules1.DemoGuruMenu

class DemoGuruRegisterPage extends Page {

    static at = { title == "Welcome: Mercury Tours" }
    static url= "test/newtours/"
    //static at = { heading.isDisplayed() }
    static content = {
        menue { module DemoGuruMenu }

        firstName(wait: true) { $(name: "firstName") }
        lastName(wait: true) { $(name: "lastName") }
        phone(wait: true) { $(name: "phone") }
        email(wait: true) { $(name: "userName") }
        country(wait: true) { $('select', name: 'country') }//.module(Select) }
        btn { $(name: "submit") }
        link1 {$(text: "sign-in")}
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