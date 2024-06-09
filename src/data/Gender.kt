package data

enum class Gender(val desc: String) {
    MALE("Laki-Laki"),
    FEMALE("Perempuan");

    fun explainDescription(): String {
        return when (this) {
            MALE -> "A"
            FEMALE -> "B"
        }
    }
}