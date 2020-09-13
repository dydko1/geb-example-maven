package hotSpec

import geb.spock.GebReportingSpec
import hotPage.CreateBookPage
import spock.lang.Stepwise

import java.time.LocalDate

@Stepwise
class HotelCreateBookSpec extends GebReportingSpec {

    def "Go to Create Room"() {
        given: "Go to create Page"
        def page = to CreateBookPage

        when:
        page.name = "Mirosław"
        page.email = 'miro@wp.pl'
        page.telephone = 502955535
        page.arrival = LocalDate.of(2017, 12, 30)
        page.departure = LocalDate.of(2050, 10, 11)
        page.adults = 30
        page.children = 15
        //page.check('Room 103')
        //page.check('new room')
        //page.inputField('email').text = "xxix@wp.pl"
        println("aaaa")

        then:
        println("bbbb")
        sleep(1500)
    }
}
