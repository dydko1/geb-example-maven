package hotSpec3

import geb.spock.GebSpec
import hotPage3.CreateRoomPage33
import spock.lang.Stepwise

@Stepwise
class HotelCreateRoomSpec33 extends GebSpec {
    String someText = "aaaaaaaaaaaaaaaaaaaaa"

    def "Go to Create Room"() {
        given: "Go to main Page"
        def page = to CreateRoomPage33
        when: "Some text"
        page.name = "Miro"
        page.save()
        then: "Finish"
        println "xxxxxxxxxxxxxxxxxxxxxxx"

        sleep(1500)
    }
}
