package specs

import geb.spock.GebSpec
import pages.ContactPage

class ContactFormSpec extends GebSpec {

    def "Navigate to contact form and fill in valid form"() {

        given:
        to ContactPage

        and:
        page.contactForm.fillInValidEntries()

        when:
        page.contactForm.submitForm()

        then:
        at ContactPage
        assert driver.currentUrl.endsWith("success=true")
        assert page.contains("Wij hebben uw bericht ontvangen. Wij nemen binnenkort met u contact op.")

    }

}