fun main() {
    val numero = 10                                // numero al que se le calculara el factorial
    val resultado = factorialRecursivo(numero)    // llamamos a la funcion recursiva
    println("El factorial de $numero es: $resultado") // Muestra el resultado
}

// Funcion recursiva para calcular el factorial
fun factorialRecursivo(n: Int): Long {
    if (n <= 1) return 1     
    return n * factorialRecursivo(n - 1)  // Paso recursivo
}
