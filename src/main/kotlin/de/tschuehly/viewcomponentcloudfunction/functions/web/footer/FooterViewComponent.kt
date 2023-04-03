package de.tschuehly.viewcomponentcloudfunction.functions.web.footer

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty
import de.tschuehly.viewcomponentcloudfunction.core.ExampleService

@ViewComponent
class FooterViewComponent(
    private val exampleService: ExampleService,
) {
    fun render() = ViewContext(
        "helloWorld" toProperty exampleService.getHelloWorld()
    )
}