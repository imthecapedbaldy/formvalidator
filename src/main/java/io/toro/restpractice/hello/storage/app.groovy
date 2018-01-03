package io.toro.restpractice.hello.storage

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ThisWillActuallyRun {

    @RequestMapping("/hello")
    static String home() {
        return "Hello World!"
    }

}
