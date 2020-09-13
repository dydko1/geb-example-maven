import geb.spock.GebReportingSpec
import modules.ContactFormModule

class ContactFormSpec extends GebReportingSpec {

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