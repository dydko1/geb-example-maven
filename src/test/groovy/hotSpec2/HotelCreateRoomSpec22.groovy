package hotSpec2

import geb.spock.GebSpec
import hotPage2.CreateRoomPage22
import spock.lang.Stepwise

@Stepwise
class HotelCreateRoomSpec22 extends GebSpec {

    String napis = "Co tu pisze"

    def "Go to Create Room"() {
        given: "Go to main Page"
        def page = to CreateRoomPage22
        when: "bbb"
        page.name = "Alladin Room"
        page.save()
        page.navigacja.home()
        sleep(2000)
        page.navigacja.rooms()
        sleep(1000)
        page.navigacja.extras()
        sleep(1000)

        then: "ccc"
        println(napis)
        sleep(2000)
    }
}
