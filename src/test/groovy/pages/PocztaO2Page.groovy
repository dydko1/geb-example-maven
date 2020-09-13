package pages

import geb.Page

class PocztaO2Page extends Page {
    static at = { title == "Poczta o2 - najszybciej rozwijająca się poczta" }
    static url = "https://poczta.o2.pl/"

    static content = {
        //login { $('#login') }
        login { $('.form__input').eq(0) } //by class
        password { $('#password') }
        btn { $('#login-button') }
        //robocze { $('div.sidebar__labels').find("div.sidebar__label a", 1) }

        loginInto {
            login.value("dydko1@o2.pl")
            password.value("mirdyd123")
            btn.click()
          //  robocze.click()
            //System.out.println(robocze.value().toString())
        }
    }
}
