package de.tschuehly.viewcomponentcloudfunction.functions.web.home

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty
import de.tschuehly.viewcomponentcloudfunction.core.ExampleService
import java.util.function.Supplier

@ViewComponent
class HomeViewComponent(
    private val exampleService: ExampleService,
) : Supplier<ViewContext> {
    override fun get() = ViewContext(
        "helloWorld" toProperty exampleService.getHelloWorld(),
        "coffee" toProperty exampleService.getCoffee()
    )
}
