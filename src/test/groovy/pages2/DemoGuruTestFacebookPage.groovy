package pages2

import geb.Page
import org.openqa.selenium.By

class DemoGuruTestFacebookPage extends Page {

    static at = { title == "Forgot Password | Can't Log In | Facebook" }
    static url = "https://www.facebook.com/login/identify?ctx=recover"
    //static at = { heading.isDisplayed() }
    static content = {

        picture(wait: true) { $(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")) }
    }
}
