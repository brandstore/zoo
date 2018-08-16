package house.brandstore.coffee.zoo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloController {

    @RequestMapping(value="/hello")
    fun hello() = {
        "hello"
    }
}
