package pages

import geb.Page

class WeightPage1 extends Page {
    static at = { title == "Decohere - Planet Weight Calculator" }
    static url = "https://decohere.herokuapp.com/planets"

    static content = {
        weight { $('#wt') }
        calculate { $('#calculate') }
        //mercury_weight { $('#outputmrc') }
        //mercury_weight { $(class: "weight-output valid") }
        mercury_weight { $('#outputmrc') }

        calculateWeight { weightValue ->
            weight.value(weightValue)
            calculate.click()
        }

        weight_on_mercury { mercury_weight.value() }
    }
}