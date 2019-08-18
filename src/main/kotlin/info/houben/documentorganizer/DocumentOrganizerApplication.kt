package info.houben.documentorganizer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DocumentOrganizerApplication

fun main(args: Array<String>) {
	runApplication<DocumentOrganizerApplication>(*args)
}
