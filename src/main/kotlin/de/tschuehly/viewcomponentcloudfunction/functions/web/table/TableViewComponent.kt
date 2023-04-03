package de.tschuehly.viewcomponentcloudfunction.functions.web.table


import de.tschuehly.thymeleafviewcomponent.ViewComponent
import de.tschuehly.thymeleafviewcomponent.ViewContext
import java.util.function.Supplier

@ViewComponent
class TableViewComponent : Supplier<ViewContext> {
    override fun get() = ViewContext()
}