package hotModules2

import geb.Module

class NavMenu extends Module {
    static content = {
        navLink { $('a', tex: contains(it)) }
    }

    private void sel(String link) {
        navLink(link).click()
    }

    void home() {
        sel('Home')
    }

    void rooms() {
        sel('Room List')
    }

    void extras() {
        sel('Extra List')
    }
}
