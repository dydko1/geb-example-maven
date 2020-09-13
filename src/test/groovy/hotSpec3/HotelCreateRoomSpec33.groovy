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
        page.ame ("jozik")
        then: "Finish"
        println "xxxxxxxxxxxxxxxxxxxxxxx" + page.name

        sleep(1500)
    }
}
