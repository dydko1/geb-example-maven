package spec1

import geb.spock.GebReportingSpec
import pages1.*
import spock.lang.Stepwise

@Stepwise
class O2MiroSpec extends GebReportingSpec {

    def "Go to Main Page"()
    {
        given: "Go to o2"
            to O2MiroPage
        when:
            login="dydko1@o2.pl"
            password.value("mirdyd123")
            btn.click()
            println("aaa")
            sleep(2000)
        then:
            btn2.value("ffffff")
            link1.click()
            sleep(4000)
            print("bbb")
    }
}
