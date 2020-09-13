package hotSpec

import geb.spock.GebReportingSpec
import hotPage.CreateRoomPage1
import spock.lang.Stepwise

@Stepwise
class HotelCreateRoom1Spec extends GebReportingSpec {

    def "Go to Create Room"() {
        given: "Go to create Page"
        def page = to CreateRoomPage1

        when:
        page.name = 'Room 15'
        page.save()

        page.nav1.extras()
        sleep(1000)
        page.nav1.home()
        sleep(1000)
        page.nav1.rooms()
        println("aaaa")

        then:
        println("bbbb")
        sleep(5000)
    }
}
