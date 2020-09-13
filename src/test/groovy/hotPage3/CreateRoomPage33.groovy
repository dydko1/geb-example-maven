package hotPage3

import geb.Page
import geb.module.TextInput

class CreateRoomPage33 extends Page {
    static at = { title == "Create Room" }
    static url = "/room/create"
    static content = {
        inputField1 { $("id": it).module(TextInput) }
    }

    void ame(String name) {
        pop('name', name)
    }

    protected void pop(String input1, String value1) {
        inputField1(input1).text = value1
    }
}
