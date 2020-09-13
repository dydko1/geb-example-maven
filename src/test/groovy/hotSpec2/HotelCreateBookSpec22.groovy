package hotSpec2

import geb.spock.GebReportingSpec
import hotPage2.CreateBookPage22
import spock.lang.Stepwise

@Stepwise
class HotelCreateBookSpec22 extends GebReportingSpec {
    def "Go to create booking room"() {
        given: "Go to create booking page"
        def page = to CreateBookPage22
        when:
        page.inputField.value("Ala")
        page.email = "miro@wp.pl"
        page.telephone = 502995535
        sleep(2000)
        then:
        page.email == "miro@wp.pl"
        print("then")
    }
}
