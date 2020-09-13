package pages1

import pages.ScaffoldPage

class EditPage1 extends ScaffoldPage {
    static at = {
        heading.text() ==~ /Edit.+/
    }

    static content = {
        updateButton(to: ShowPage1) { $("input", value: "Update") }
        deleteButton(to: ListPage1) { $("input", value: "Delete") }
    }
}
