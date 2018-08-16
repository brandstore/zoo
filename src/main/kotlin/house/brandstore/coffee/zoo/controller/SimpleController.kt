package house.brandstore.coffee.zoo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class SimpleController {

    @RequestMapping(value="/sample")
    fun simple() = {

//        model.addAttribute("appName", "test")
        "sample"
    }
}