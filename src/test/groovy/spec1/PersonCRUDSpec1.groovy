package spec1

import geb.spock.GebReportingSpec
import pages.ListPage
import pages.ShowPage
import pages1.*
import spock.lang.Stepwise

@Stepwise
class PersonCRUDSpec1 extends GebReportingSpec {

    def "There are no persons"() {
        when:
        to ListPage1
        then:
        personRows.size() == 0
        sleep(1000)
    }

    def "Add a person"() {
        when:
        newPersonButton.click()
        then:
        at CreatePage1
        sleep(1000)
    }

    def "Enter the details"()
    {
        when:
        $("#visible").click()
        firstName = "Miro"
        lastName = "Dydu"
        createButton.click()
        then:
        at ShowPage1
        sleep(1000)
    }

    def "Check entered details"()
    {
        expect:
        firstName == "Miro"
        lastName == "Dydu"
        visible == true
        sleep(1000)
    }

    def "Edit the page"()
    {
        when:
        editButton.click()
        then:
        at EditPage1
        $("#visible").click()
        updateButton.click()
        then:
        at ShowPage1
        sleep(1000)
    }

    def "check in listing"() {
        when:
        to ListPage1
        then:
        personRows.size() == 1
        def row = personRow(0)
        row.firstName == "Miro"
        row.lastName == "Dydu"
        sleep(1000)
    }

    def "show person"() {
        when:
        personRow(0).showLink1.click()
        then:
        at ShowPage1
        sleep(1000)
    }

    def "delete user"() {
        given:
        def deletedId = id
        when:
        withConfirm { deleteButton.click() }
        then:
        at ListPage1
        message == "Person $deletedId deleted"
        personRows.size() == 0
        sleep(1000)
    }
}
