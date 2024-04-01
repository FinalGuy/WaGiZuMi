package de.tfojuth.wagizumi.adapter.`in`

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
class HomeController {

    @GetMapping("/")
    fun greeting(
        @RequestParam(name = "name", required = false, defaultValue = "Schorse") name: String?,
        model: Model
    ): String? {
        model.addAttribute("name", name)
        return "home"
    }

}
