package pages

import geb.Page

class MenuO2Page extends Page {
    //static at = { title == "@o2  (877) Odebrane - Poczta o2" }
    static url = "https://poczta.o2.pl/"

    static content = {
        //login { $('#login') }

        robocze { $('div.sidebar__labels').find("div.sidebar__label a", 1) }

        loginInto {

            robocze.click()
            //System.out.println("ddddd")
        }
    }
}
