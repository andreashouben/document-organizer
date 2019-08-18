package info.houben.documentorganizer

import org.springframework.stereotype.Service
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

@Service
class FileReaderService {

    fun readFilesFromIngoing() {
        try {
            Files.walk(Paths.get("src/test/resources/testfiles")).use { paths ->
                paths
                        .filter { f -> Files.isRegularFile(f) }
                        .forEach({ f -> println(f) })
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

}
