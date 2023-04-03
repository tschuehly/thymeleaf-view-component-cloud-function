package de.tschuehly.viewcomponentcloudfunction.functions.web.navigation


import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty
import de.tschuehly.viewcomponentcloudfunction.core.ExampleService
import java.util.function.Supplier

@ViewComponent
class NavigationViewComponent(
    private val exampleService: ExampleService
) : Supplier<ViewContext>{
    var counter = 0
    override fun get(): ViewContext {
        counter = counter.plus(1)
        return ViewContext(
            "someOtherProperty" toProperty exampleService.getSomeOtherProperty(),
            "counter" toProperty counter
        )
    }

}