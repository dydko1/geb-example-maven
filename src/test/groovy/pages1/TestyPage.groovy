package spec1

import geb.Page

class TestyPage extends Page {
    static url = 'http://madison.craigslist.org/'
    static at = {pageTitle}
    static content = {
        pageTitle(wait:true) {title == 'craigslist: madison classifieds for jobs, apartments, personals, for sale, services, community, and events'}
        dropdown(wait:true) {$('select', name:'catAbb')}
        // workaround for getting the selected text from the dropdown....
        dropdownSelectedText {dropdown.find('option', value:dropdown.value()).text()}
    }
}
