package specs

import geb.spock.GebSpec

class JDrivenBlogSpec extends GebSpec {
    def "Check if there main link refer to homepage"()
    {
        go "http://www.jdriven.nl"
        $('a', text: contains('JDriven')).eq(0).click()

        expect:
        driver.currentUrl=="https://jdriven.com/events/social/jdriven-pubquiz-2020/"
    }
}
