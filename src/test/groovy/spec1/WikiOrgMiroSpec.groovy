package spec1

import spock.lang.Stepwise
import pages1.*

@Stepwise
class WikiOrgMiro {

    def "Go to Main Page"()
    {
        when:
            to MainPageMiro
        then:
            println("fffff")
    }
}
