package tests.sb

import org.testng.annotations.Test
import pageobjects.sb.SbPage
import tests.BaseTest

class SbTest : BaseTest() {

    private val sb = SbPage()

    @Test
    fun example() {
        Thread.sleep(5000)
    }
}