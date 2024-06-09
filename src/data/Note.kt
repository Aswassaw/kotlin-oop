package data

class Note(title: String) {
    var title: String = title
}

class NoteWithGS(title: String) {
    var title: String = title
        get() {
            return "Getter $field"
        }
        set(value) {
            if (value.isNotBlank()) {
                field = value
            }
        }

    lateinit var description: String
    fun initDesc(description: String) {
        this.description = description;
    }
}