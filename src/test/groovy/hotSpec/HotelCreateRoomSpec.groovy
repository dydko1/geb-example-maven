package hotSpec

import geb.spock.GebReportingSpec
import geb.spock.GebSpec
import hotPage.CreateRoomPage
import spock.lang.Stepwise

@Stepwise
class HotelCreateRoomSpec extends GebSpec {

    def "Go to Create Room"() {
        given: "Go to create Page"
        def page = to CreateRoomPage

        when:
        page.name = 'Room 1201'
        page.save()
        page.nav.extras()
        sleep(1000)
        page.nav.home()
        sleep(1000)
        page.nav.rooms()

        println("aaaa")

        then:
        println("bbbb")
        sleep(5000)
    }
}
