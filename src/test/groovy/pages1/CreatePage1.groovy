package pages1

import pages.ScaffoldPage

class CreatePage1 extends ScaffoldPage {
    static at = {
        title ==~ /Create.+/
    }

    static content = {
        createButton(to: ShowPage1) { create() }
    }
}
