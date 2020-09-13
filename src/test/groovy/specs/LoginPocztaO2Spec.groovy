package specs

import pages.PocztaO2Page
import  pages.MenuO2Page
import geb.spock.GebSpec

class LoginPocztaO2Spec extends GebSpec{
    def "Should loging with valid pass and username"() {
        given: "Go to poczta.o2.pl"
        to PocztaO2Page

        when: "Login as dydko1"
        loginInto()

        then: "OK"
        System.out.println("OK udało sie 1111 ;)")
        sleep(1000)
    }

    def "Should clicking on menue"() {
        given: "Go to menu o2.pl"
        to MenuO2Page

        when: "Login as dydko1"
        loginInto()

        then: "OK"
        System.out.println("OK udało sie 2222 ;)")
        sleep(5000)
    }
}
