fun <A, B, C> partialA(a: A, f: (A) -> (B) -> C): (B) -> C = f(a)

fun <A, B, C> partialB(b: B, f: (A) -> (B) -> C): (A) -> C = { a: A ->
    f(a)(b)
}

fun <A, B, C, D> func(a: A) = { a: A -> { b: B -> { c: C -> { d: D -> "$a, $b, $c, $d" } } } }

fun <A, B, C> curry(f: (A, B) -> C): (A) -> (B) -> C =
    { a: A ->
        { b: B ->
            f(a, b)
        }
    }