package modules1

import geb.Module

class DemoGuruMenu extends Module {
    static content = {

        //left side
        home { $(".mouseOut", 0) }
        flights { $(".mouseOut", 1) }
        hotels { $(".mouseOut", 2) }
        carRentals { $(".mouseOut", 3) }
        cruises { $(".mouseOut", 4) }
        destinations { $(".mouseOut", 5) }
        vacations { $(".mouseOut", 6) }

        // top side
        signON { $(".mouseOut", 7) }
        register { $(".mouseOut", 8) }
        support { $(".mouseOut", 9) }
        contact { $(".mouseOut", 10) }

        //signON { $("a", text:"SIGN-ON") }
        //cell { $("td") }
        //tab1 { cell[0].text() }
        //tab2 {$(".mouseOut",1)}
    }
}
