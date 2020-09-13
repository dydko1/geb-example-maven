package hotPage

import geb.Page
import geb.module.Checkbox
import geb.module.TextInput

import java.time.LocalDate

class CreateBookPage extends Page {

    static at = { title == "Create Booking" }

    static url = "booking/create"

    static content = {
        inputField { $("input", name: it).module(TextInput) }
        emailField { $("input", type: 'email', name: it) }
        telephoneField { $("input", type: 'text', name: it) }

        numberAdults { $("input", type: 'number', name: it) }
        numberChildren { $('input', type: 'number', name: it) }

        selectDay { $('select', name: "${it}_day") }
        selectMonth { $('select', name: "${it}_month") }
        selectYear { $('select', name: "${it}_year") }

        saveButton { $('input', type: 'number', name: it) }

        field { $('li.fieldcontain .property-label', text: it).parent() }
        fieldCheckbox { field(it).find('input', type: 'checkbox', 0).module(Checkbox) }
    }

    void check(String name) {
        fieldCheckbox(name).check()
    }

    void uncheck(String name) {
        fieldCheckbox(name).uncheck()
    }

    void setName(String name) {
        populate('name', name)
    }

    void setEmail(String email) {
        populateEmail('email', email)
    }

    void setTelephone(int telephone) {
        populateTelephone('telephone', telephone)
    }

    void setAdults(int adults) {
        pupulateNumber('adults', adults)
    }

    void setChildren(int children) {
        populateChildren('children', children)
    }

    void populate(String inputName, String value) {
        inputField(inputName).text = value
    }

    void setArrival(LocalDate arrival) {
        populateDate('arrival', arrival.day, arrival.month.value, arrival.year)
    }

    void setDeparture(LocalDate arrival) {
        populateDate('departure', arrival.day, arrival.month.value, arrival.year)
    }

    void populateEmail(String inputField, String value) {
        emailField(inputField).value(value)
    }

    void populateTelephone(String inputName, int value) {
        telephoneField(inputName).value(value)
    }

    void populateDate(String name, int day, int month, int year) {
        selectDay(name).value(day)
        selectMonth(name).value(month)
        selectYear(name).value(year)
    }

    void pupulateNumber(String inputFields, int value) {
        numberAdults(inputFields).value(value)
    }

    void populateChildren(String inputFields, int value) {
        numberChildren(inputFields).value(value)
    }

    void save() {
        saveButton.click()
    }
}
