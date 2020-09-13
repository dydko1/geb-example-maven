package hotModules2

import geb.Module

class Navi22 extends Module {
    static content = {
        //navLink { $('a', text: contains(it)) }
        //        selectYear { $('select', name: "${it}_year") }
        //navLink { $('a', "${it}") }
        //navLink { $('a', class: it).eq(0) }
        navLink { $('a', class: it) }
    }

    private void sel(String link, int ii) {
        navLink(link).eq(ii).click()
    }

    void home() {
        //sel('Home')
        sel('home', 0)
    }

    void rooms() {
        //sel('Room List')
        //sel('list', '0')
        sel('list', 0)
    }

    void extras() {
        //sel('Extra List')
        sel('list', 1)
    }
}
