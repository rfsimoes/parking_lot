fun getLength(input: String?): Int {
    return if (input is String) {
        input.length
    } else {
        -1
    }
}