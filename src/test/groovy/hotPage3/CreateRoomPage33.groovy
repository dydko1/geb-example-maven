package hotPage3

import geb.Page
import geb.module.TextInput

class CreateRoomPage33 extends Page {
    static at = { title == "Create Room" }
    static url = "room/create"
    static content = {
        inputField { $(id: it, name: 'name').module(TextInput) }
        saveButton { $('#create').click() }
    }

    void setName(String name) {
        pop('name', name)
    }

    protected void pop(String name, String value) {

        inputField(name).text = value
    }

    void save() {
        saveButton
    }
}
