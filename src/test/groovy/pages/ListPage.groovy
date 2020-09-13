package pages
import modules.PersonRow

class ListPage extends ScaffoldPage {
	//static url = "person/list"
	static url = "http://localhost:8080/geb-example-grails/person/list/"
	
	static at = {
		title ==~ "Person List"
	}
	
	static content = {
		newPersonButton(to: CreatePage) { $("a", text: "New Person") }
		peopleTable { $("div.content table", 0) }
		personRow { personRows[it].module PersonRow }
		personRows(required: false) { peopleTable.find("tbody").find("tr") }
	}
}

