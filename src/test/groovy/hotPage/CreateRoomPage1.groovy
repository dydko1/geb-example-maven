package hotPage

import geb.Page
import geb.module.TextInput
import hotModules.Nav1

class CreateRoomPage1 extends Page {

    static at = { title == "Create Room" }
    static url = "room/create"

    static content = {
        inputField { $("input", name: it).module(TextInput) }
        saveButton { $("input", type: "submit") }
        nav1 { $("div.nav").module(Nav1) }
    }

    void save() {
        saveButton.click()
    }

    void setName(String name) {
        populate("name", name)
    }

    public populate(String inputName, String value) {
        inputField(inputName).text = value
    }
}
