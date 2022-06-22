fun square(num: Int) = num * num
fun triple(num: Int) = num * 3
fun compose(f: (Int) -> Int, g: (Int) -> Int): (Int) -> Int = { x -> f(g(x)) }
val squareOfTriple = compose(::square, ::triple)

fun <T>compose2(f: (T) -> T, g: (T) -> T): (T)-> T = {x -> f(g(x))}
val squareOfTriple2 = compose2(::square, ::triple)

fun <T, U, V>compose3(f: (U) -> V, g: (T) -> U): (T)-> V = {x -> f(g(x))}
val squareOfTriple3 = compose3(::square, ::triple)

fun printCompositionResult(){
    println("squareOfTriple(2) = ${squareOfTriple(2)}")
    println("squareOfTriple2(2) = ${squareOfTriple2(2)}")
    println("squareOfTriple3(2) = ${squareOfTriple3(2)}")
    // Выводит: squareOfTriple(2) = 36
}
