package demo

class StandardOutMessageRenderer : MessageRenderer {
    override lateinit var messageProvider: MessageProvider

    override fun render() {
        println(messageProvider.message)
    }
}