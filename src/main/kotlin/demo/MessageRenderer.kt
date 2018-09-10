package demo

interface MessageRenderer {
    var messageProvider: MessageProvider

    fun render()
}