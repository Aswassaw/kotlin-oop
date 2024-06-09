package data

object Utilities {
    val name: String = "My Utilities"

    fun toUpper(value: String): String {
        return value.uppercase()
    }
}

class Application(val name: String) {
    companion object {
        fun toUpper(name: String): String {
            return name.uppercase()
        }
    }
}