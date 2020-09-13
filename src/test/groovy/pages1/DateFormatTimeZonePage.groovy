package pages1

import geb.Page
import geb.module.*

class DateFormatTimeZonePage extends Page {
    static url = "http://dydko1.cba.pl/test.html"

    static content = {
        modalDateDropdown { $("#dateFormat").module(Select) }
        modalTZoneDropdown { $("#timeZonePreference").module(Select) }
    }
}
