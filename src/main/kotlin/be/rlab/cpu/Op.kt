package be.rlab.cpu

interface Op {
    fun exec()

    fun mkString(value: Any?): String {
        return when(value) {
            is Register -> value.name
            else -> value.toString()
        }
    }
}
