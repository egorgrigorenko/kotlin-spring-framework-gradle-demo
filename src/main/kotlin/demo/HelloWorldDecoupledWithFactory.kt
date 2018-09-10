package demo

fun main(args: Array<String>) {
    val mr = MessageSupportFactory.renderer
    val mp = MessageSupportFactory.provider
    if (mr != null && mp != null) {
        mr.messageProvider = mp
        mr.render()
    }
}