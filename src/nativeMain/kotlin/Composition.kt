fun square(num: Int) = num * num
fun triple(num: Int) = num * 3
fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { x -> f(g(x)) }
val squareOfTriple = compose(::square, ::triple)

fun printResult(){
    println("squareOfTriple(2) = ${squareOfTriple(2)}")
    // Выводит: squareOfTriple(2) = 36
}
