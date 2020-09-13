
import geb.Module

class ContactFormModule extends Module {

    static content = {
        nameInput{ $("#name") }
        emailInput { $("#from") }
        subjectSelect { $("#subject") }
        bodyTextArea { $("#body") }
        submitButton {$('#fsc-submit') }
    }

    void  fillInValidEntries() {
        nameInput.value("Geb spock test")
        emailInput.value("geb@dummytest.com")
        subjectSelect.value("Overige")
        bodyTextArea.value("Hi, I'm running the Geb spock test from the blog post")
    }

    void submitForm(){
        submitButton.click()
    }

}