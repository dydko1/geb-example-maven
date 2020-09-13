package pages1

import modules.PersonRow
import modules1.PersonRow1
import pages.ScaffoldPage

class ListPage1 extends ScaffoldPage {
    static url = "http://localhost:8080/geb-example-grails/person/list/"

    static at = {
        title ==~ "Person List"
    }

    static content = {
        newPersonButton(to: CreatePage1) { $("a", text: "New Person") }
        peopleTable { $("div.content table", 0) }
        personRow { personRows[it].module PersonRow1 }
        personRows(required: false) { peopleTable.find("tbody").find("tr") }
    }
}
