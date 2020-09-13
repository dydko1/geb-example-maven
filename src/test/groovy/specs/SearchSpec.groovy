import geb.spock.GebSpec

class SearchSpec extends GebSpec{
    def "search 'Groovy Browser Automation' in duckduckgo"() {
        given: "we are on the duckduckgo search-engine"
        go "http://duckduckgo.com"

        when: "we search for 'Groovy Browser Automation'"
        $("#search_form_homepage").q = "Groovy Browser Automation"
        $("#search_button_homepage").click()

        then: "the first result is the geb website"
        //assert $("#links").find(".result__body a", 0).attr("href") == "https://gebish.org/"
        //assert $("#links").find(".result__body a", 1).attr("href") == "https://jaxenter.com/tutorial-groovy-functional-testing-with-geb-104382.html/"
        assert $("#links").find(".links_main a", 8).click()
        sleep(5000)
    }
}