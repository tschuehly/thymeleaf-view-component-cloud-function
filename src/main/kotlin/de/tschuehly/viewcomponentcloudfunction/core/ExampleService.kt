package de.tschuehly.viewcomponentcloudfunction.core

import org.springframework.stereotype.Service

@Service
class ExampleService {
    fun getHelloWorld(): String{
        return "Hello World from a Spring Cloud Function"
    }

    fun getSomeOtherProperty(): String {
        return "Hello Wim"
    }

    fun getCoffee(): String{
        return "Watch Coffee + Software with Josh Long!"
    }

    fun getOfficeHours(): String{
        return "Watch the Spring Office Hours!"
    }
}