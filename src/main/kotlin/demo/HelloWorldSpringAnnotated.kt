package demo

import org.springframework.beans.factory.getBean
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main(args: Array<String>) {
    val ctx = AnnotationConfigApplicationContext(HelloWorldConfiguration::class.java)
    val mr = ctx.getBean<MessageRenderer>("renderer")
    mr.render()
}