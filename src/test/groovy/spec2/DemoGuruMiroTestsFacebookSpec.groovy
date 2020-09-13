package spec2

import geb.spock.GebReportingSpec
import pages2.DemoGuruTestRadioCheckPage
import pages2.DemoGuruTestRegisterPage
import spock.lang.Stepwise

@Stepwise
class DemoGuruMiroTestsSpec extends GebReportingSpec {

    def "Go to Main Page"() {
        given: "Go to demo.guru"
        def page1 = to DemoGuruTestRegisterPage

        when:
        page1.email = "miro@wp.pl"
        page1.password = "tajne"

        then:
        page1.email == "miro@wp.pl"
        page1.password == "tajne"
        println("bbbb")

        when:
        page1.btn.click()
        then:
        println("fsdfdsa")
    }

    def "Go to RadioCheckBox"() {
        given: "Go to demo.guru"
        def page1 = to DemoGuruTestRadioCheckPage

        when:
        page1.radio1.click()
        sleep(1000)
        page1.radio2.click()
        sleep(1000)
        page1.radio3.click()

        then:
        println("bbbb")

        when: "safdsa"
        page1.checkBox1.click()
        page1.checkBox2.click()
        page1.checkBox3.click()

        then: "dfsfd"
        println("bbbb")

        sleep(5000)
    }
}


//page1.email2="mir1o@wp.pl"
//page.firstName.value("Mirek")

//dropdownSelectedText == "ANGOLA"
//sleep(5000)
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