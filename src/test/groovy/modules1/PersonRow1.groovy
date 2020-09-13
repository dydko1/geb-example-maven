package modules1

import geb.Module
import pages1.ShowPage1

class PersonRow1 extends Module {
    static content = {
        cell { $("td", it) }
        cellText { cell(it).text() }
        cellHrefText { cell(it).find('a').text() }
        visible { Boolean.valueOf(cellHrefText(0)) }
        firstName { cellText(1) }
        lastName { cellText(2) }
        showLink1(to: ShowPage1) { cell(0).find("a") } // need adding
    }
}
