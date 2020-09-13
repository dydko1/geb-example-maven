package spec2

import geb.spock.GebReportingSpec
import pages2.*
import spock.lang.Stepwise

@Stepwise
class DemoGuruMiroTestsFacebookSpec extends GebReportingSpec {

    def "Go to Main Page"() {
        given: "Go to Facebook Page"
        def page1 = to DemoGuruTestFacebookPage

        when:
        page1.picture.click()
        println("aaaa")
        then:
        println("bbbb")
        sleep(5000)
    }
}
