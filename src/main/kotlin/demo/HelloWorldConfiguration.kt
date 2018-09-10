package demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class HelloWorldConfiguration {
    @Bean
    fun provider() = HelloWorldMessageProvider()

    @Bean
    fun renderer() : MessageRenderer {
        val renderer = StandardOutMessageRenderer()
        renderer.messageProvider = provider()
        return renderer
    }
}