package info.houben.documentorganizer

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController {

    @Autowired
    lateinit var fileReader: FileReaderService

    @GetMapping("/")
    fun main(model: Model): String {
        fileReader.readFilesFromIngoing()
        return "index"
    }

}