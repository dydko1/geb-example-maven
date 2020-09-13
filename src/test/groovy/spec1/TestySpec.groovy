package spec1
import geb.spock.GebReportingSpec
import pages1.TestyPage

class TestySpec extends GebReportingSpec{
    def 'this is a test...'() {
        given:
        to TestyPage

        when: 'select gigs from dropdown...'
        //dropdown = 'gigs'
        assert $('select', name:'catAbb').value() == 'ccc'
        println("ddd")
        then:
        println("D")

        // assert the currently selected text...
        //dropdownSelectedText == 'gigs'
        // you can also assert the selected value...
        //dropdown.value() == 'ggg'
    }
}
