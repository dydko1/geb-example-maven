package pages

import geb.Page

class WeightPage extends Page {

    static at = { title == "Decohere - Planet Weight Calculator" }
    static url = "https://decohere.herokuapp.com/planets"

    static content = {
        weight { $('#wt') }
        //calculate { $('#calculate') }
        calculate { $(".site-button") }
        //mercuryWeight { $ '#outputmrc' }
        mercuryWeight { $('.weight-output').eq(1) } // skip "weight-output valid"

        calculateWeight { weightValue ->
            weight.value(weightValue)
            calculate.click()
        }

        weightOnMercury { mercuryWeight.value()}
    }
}
