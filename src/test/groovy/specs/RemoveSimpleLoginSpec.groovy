import geb.spock.GebSpec

class SimpleLoginSpec extends GebSpec {
    def "should login with valid username and password"() {
        when:
        go ".login.html"

        then:
        $(".page-header").text() == "Login"

        when:
        $("#login-form input[name=username]").value("user1@example.com")
        $("#login-form input[name=password]").value("goodpassword")
        $("#login-form input[type=submit]").click()

        then:
        $(".page-header").text() == "User Home Page"
    }

    def "should redisplay form with an error message when password is bad"() {
        when:
        go "login.html"

        then:
        $(".page-header").text() == "Login"

        when:
        $("#login-form input[name=username]").value("user1@example.com")
        $("#login-form input[name=password]").value("badpassword")
        $("#login-form input[type=submit]").click()

        then:
        $(".page-header").text() == "Login"
        $(".errors li").size() == 1
        $(".errors li")[0].text() == "Invalid username or password"
    }
}