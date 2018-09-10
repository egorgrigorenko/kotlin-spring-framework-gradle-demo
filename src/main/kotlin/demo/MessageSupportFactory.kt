package demo

import java.util.*
import kotlin.reflect.full.primaryConstructor

object MessageSupportFactory {
    val renderer: MessageRenderer?
    val provider: MessageProvider?

    init {
        val props = Properties()
        props.load(javaClass.getResourceAsStream("/msf.properties"))
        renderer = createInstance(props, "renderer.class")
        provider = createInstance(props, "provider.class")
    }

    private inline fun <reified T> createInstance(props: Properties, className: String) : T? {
        val fullClassName = props.getProperty(className)

        @Suppress("UNCHECKED_CAST")
        val kClazz = Class.forName(fullClassName).kotlin
        val ctor = kClazz.primaryConstructor
        return if (ctor != null && ctor.parameters.isEmpty())
            ctor.call() as T else
            null
    }
}