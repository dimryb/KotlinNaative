fun main(args: Array<String>) {
//    printCompositionResult()
//    printCurriedResult()
//    add_test()
    makeString_test()

}

fun printArgs(args: Array<String>) {
    print("args num: ${args.size}, args: ")
    args.forEach { println(it) }
}

fun console() {
    val list: List<String> = listOf("Первое", "Второе")

    list.map { println(it) }

    while (true) {
        val line = readLine()
        if (line == null) {
            println("!!null input!!")
            break
        }
        println("> $line")
        if (line == "exit") break
    }

    println("Hello, Kotlin/Native!")
}