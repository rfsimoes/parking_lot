// The array numbers already exists. Write only exchange actions here.
run {
    val temp = numbers[0]; numbers[0] = numbers[numbers.size - 1]; numbers[numbers.size - 1] = temp
}