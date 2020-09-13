package spec1

import geb.spock.GebReportingSpec
import pages1.DemoGuruRegisterPage
import spock.lang.Stepwise

@Stepwise
class DemoGuruMiroSpec extends GebReportingSpec {

    def "Go to Main Page"() {
        given: "Go to demo.guru"
        def page = to DemoGuruRegisterPage

        when:
        page.menue.register.click()
        then:
        page.firstName.value("Mirek")
        page.lastName.value("Dyduch")
        page.phone.value("502995535")
        page.email.value("miro@wp.pl")

        page.country.value "POLAND"
        page.btn.click()
        page.link1.click()
        //dropdownSelectedText == "ANGOLA"
        sleep(3000)
    }
}

/*
        sleep(2000)
        menue.flights.click()
        sleep(2000)
        menue.hotels.click()
        sleep(2000)
        menue.carRentals.click()
        sleep(2000)
        menue.cruises.click()
        sleep(2000)
        menue.destinations.click()
        sleep(2000)
        menue.vacations.click()
        sleep(2000)

        //sleep(1000)
        menue.signON.click()
        sleep(2000)
        menue.register.click()
        sleep(2000)
        menue.support.click()
        sleep(2000)
        menue.contact.click()
        sleep(2000)
* */