package spec2

import geb.spock.GebReportingSpec
import pages2.HotelPage
import spock.lang.Stepwise

@Stepwise
class HotelSpec extends GebReportingSpec {

    def "Go to Main Page"() {
        given: "Go to Facebook Page"
        def page1 = to HotelPage

        when:
        println(page1.divs.text())
        println("aaaa")

        then:
        println("bbbb")
        sleep(5000)
    }
}
