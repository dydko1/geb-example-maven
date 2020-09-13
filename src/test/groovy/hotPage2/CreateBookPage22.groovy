package hotPage2

import geb.Page
import geb.module.TextInput

class CreateBookPage22 extends Page {
    static at = { title == "Create Booking" }

    static url = "/booking/create"

    static content = {
        inputField { $("input", id: "name").module(TextInput) }
        inputEmail { $("input#email") }
        telephoneField { $("input", type: 'text', name: 'telephone') }
    }

    void setEmail(String value) {
        inputEmail.value(value)
    }

    String getEmail() {
        return inputEmail.value()
    }

    void setTelephone(int telephone) {
        telephoneField.value(telephone)
    }
}
