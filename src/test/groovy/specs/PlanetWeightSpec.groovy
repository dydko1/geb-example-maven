package specs

import geb.spock.GebSpec
import pages.WeightPage

class PlanetWeightSpec extends GebSpec {
    def "weight of Mercury"() {
        given: "The planet web page"
        to WeightPage

        when: "Calculate a weight of 200"
        calculateWeight("200")

        then: "The weight of Mercury is 75.6"
        assert weightOnMercury == '75.6'
        //System.out.println("Masa na Merkurym:\t" + weightOnMercury)
    }
}
