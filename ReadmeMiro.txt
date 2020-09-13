1. https://www.softwaretestingmaterial.com/failed-to-launch-ie-driver-using-selenium/
2. View->zoom->100% (ctrl+0)
3. mvn clean test (download drivers in background)


//mvn surefire:test -Dtest=secondtestngTest??
mvn clean test -Dtest=secondtestngTest
//bez przecinka
mvn clean test -Dtest=flightsStrapTestngTest,loginTest

taskkill /F /IM chromedriver-windows-32bit.exe /T
--------------
git clone https://github.com/grails-samples/geb-example-grails //nie moje
git clone https://github.com/dydko1/geb-example-grails.git
git clone https://github.com/dydko1/geb-example-maven.git
--------------
cd geb-example-grails
grailsw run-app

mvn clean test -Dtest=GebishOrgSpec1
mvn clean test -Dtest=PersonCRUDSpec
mvn clean test -Dtest=DemoGuruMiroSpec
mvn clean test -Dtest=DemoGuruMiroTestsSpec
mvn test