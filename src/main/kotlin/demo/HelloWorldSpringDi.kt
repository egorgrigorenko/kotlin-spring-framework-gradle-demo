package demo

import org.springframework.beans.factory.getBean
import org.springframework.context.support.ClassPathXmlApplicationContext

fun main(args: Array<String>) {
    val ctx = ClassPathXmlApplicationContext("spring/app-context.xml")
    val mr = ctx.getBean<MessageRenderer>("renderer")
    mr.render()
}