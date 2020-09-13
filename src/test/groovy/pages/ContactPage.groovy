package pages

import geb.Page
import modules.ContactFormModule

class ContactPage extends Page {

    static url = "contact"

    static at = { heading.text() == "Contact" }

    static content = {
        heading { $("h2") }
        contactForm { module ContactFormModule }
    }
}