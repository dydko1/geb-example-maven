package hotPage2

import geb.Page
import geb.module.TextInput
import hotModules2.Navi22

class CreateRoomPage22 extends Page {

    static at = { title == "Create Room" }
    static url = "/room/create"

    static content = {
        inputField { $('input', name: it).module(TextInput) }
        saveButton { $('#create').click() }
        navigacja { $('div.nav').module(Navi22) }
    }

    void setName(String name) {
        populate('name', name)

    }

    protected void populate(String inputFieldName, String value) {
        inputField(inputFieldName).text = value
    }

    void save() {
        saveButton
    }
}
