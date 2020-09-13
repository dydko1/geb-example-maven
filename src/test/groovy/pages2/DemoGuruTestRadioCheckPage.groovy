package pages2

import geb.Page

//import geb.module.Select

class DemoGuruTestRadioCheckPage extends Page {

    static at = { title == "Radio Button & Check Box Demo" }
    static url = "test/radio.html"
    //static at = { heading.isDisplayed() }
    static content = {

        radio1 { $("#vfb-7-1") }
        radio2 { $("#vfb-7-2") }
        radio3 { $("#vfb-7-3") }

        checkBox1 { $("#vfb-6-0") }
        checkBox2 { $("#vfb-6-1") }
        checkBox3 { $("#vfb-6-2") }

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