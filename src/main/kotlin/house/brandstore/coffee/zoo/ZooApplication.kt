package house.brandstore.coffee.zoo

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class ZooApplication

fun main(args: Array<String>) {
    runApplication<ZooApplication>(*args)
}
