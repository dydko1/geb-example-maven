package spec1

import geb.spock.GebReportingSpec
import spock.lang.Stepwise
import pages1.*

@Stepwise
class WikiOrgMiroSpec extends GebReportingSpec {

    def "Go to Main Page"()
    {
        given: "Go to wiki"
            to MainPageMiro
        when:
            //MainPageMiro.artykul.click() // do zmian
            MainPageMiro.showPiwo()
            println("aaa")
        then:
            print("bbb")
    }
}
