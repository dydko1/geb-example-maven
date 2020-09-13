package specs

import geb.spock.GebSpec
import pages.WeightPage

class PlanetWeightSpec extends GebSpec {
    def "weight on mercury"() {
        given: "the planet weight page"
        to WeightPage

        when: "calculating a weight of 200"
        calculateWeight('200')

        then: "the weight on Mercury is 75.6"
        assert weight_on_mercury == '75.6'
        sleep(5000)
        System.out.println("ffff")
    }
}