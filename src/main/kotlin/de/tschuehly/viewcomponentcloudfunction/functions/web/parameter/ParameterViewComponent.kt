package de.tschuehly.viewcomponentcloudfunction.functions.web.parameter

import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import de.tschuehly.thymeleafviewcomponent.toProperty
import de.tschuehly.viewcomponentcloudfunction.core.ExampleService


@ViewComponent
class ParameterViewComponent(
    private val exampleService: ExampleService
) {
    fun render(parameter: String?, parameter2: String?) = ViewContext(
        "testparameter" toProperty (parameter ?: throw Exception("You need to pass in a parameter")),
        "office" toProperty (parameter2 ?: exampleService.getOfficeHours())
    )
}