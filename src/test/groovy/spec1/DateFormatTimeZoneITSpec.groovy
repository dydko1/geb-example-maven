package spec1

import geb.spock.GebReportingSpec
import geb.module.*
import pages1.DateFormatTimeZonePage

class DateFormatTimeZoneITSpec extends GebReportingSpec {
    def "Check texts for selected drop-down elements"() {
        given:
        def page = to DateFormatTimeZonePage

        when: "selecting drop-down elements by unique value"
        page.modalDateDropdown = "DD/MM/YYYY"
        page.modalTZoneDropdown = "US/Samoa"

        then: "corresponding texts match"
        page.modalDateDropdown.selectedText == "DD/MM/YYYY"
        page.modalTZoneDropdown.selectedText == "GMT -11:00, Samoa Time Samoa"

        when: "selecting drop-down default element with non-unique value by text"
        page.modalTZoneDropdown = "- Select time zone -"

        then: "corresponding value matches"
        page.modalTZoneDropdown.selected == "America/Chicago"

        when: "selecting another drop-down element with non-unique value by text"
        page.modalTZoneDropdown = "GMT -06:00, Central Time (Chicago)"

        then: "corresponding value matches"
        page.modalTZoneDropdown.selected == "America/Chicago"
    }
}
