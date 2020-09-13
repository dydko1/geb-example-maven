/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.os.ExecutableFinder

import static org.apache.commons.lang3.SystemUtils.*

File findDriverExecutable() {
    def defaultExecutable = new ExecutableFinder().find("chromedriver")
    if (defaultExecutable) {
        new File(defaultExecutable)
    } else {
        new File("drivers").listFiles().findAll {
            !it.name.endsWith(".version")
        }.find {
            if (IS_OS_LINUX) {
                it.name.contains("linux")
            } else if (IS_OS_MAC) {
                it.name.contains("mac")
            } else if (IS_OS_WINDOWS) {
                it.name.contains("windows")
            }
        }
    }
}

driver = {
    ChromeDriverService.Builder serviceBuilder = new ChromeDriverService.Builder()
            .usingAnyFreePort()
            .usingDriverExecutable(findDriverExecutable())
    new ChromeDriver(serviceBuilder.build())
}

baseUrl = "http://localhost:8080/"
//baseUrl ="http://dydko1.cba.pl/test.html"
//baseUrl = "http://demo.guru99.com/test/newtours/"
//baseUrl = "http://demo.guru99.com/"
//baseUrl = "https://poczta.o2.pl/zaloguj/"
//baseUrl = "https://pl.wikipedia.org/wiki/Wikipedia:Strona_g%C5%82%C3%B3wna"
//baseUrl = "http://www.jdriven.com/"
//baseURL="http://localhost:8080/geb-example-grails/"
//baseUrl = "http://gebish.org"
//baseUrl = "https://www.google.com"
reportsDir = "build/reports/intellij-geb-reports"
