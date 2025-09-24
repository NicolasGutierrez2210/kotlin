fun main() {
    // Numero que vamos  a verificar
    val numero = 29
    
    // Llamamos a la funcion esPrimo y mostramos el resultado
    if (esPrimo(numero)) {
        println("$numero es un numero primo")
    } else {
        println("$numero no es un numero primo")
    }
}

// Funcion que determinara si un numero es primo
fun esPrimo(n: Int): Boolean {
    
// Los numeros menores a 2 no son primos
    if (n < 2) return false
    
    // Recorremos desde 2 hasta la raíz cuadrada de n
    
for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
        // Si encontramos un divisor exacto, no es primo
        if (n % i == 0) return false
    }
    
    // Si no se encuentra el  divisor, es primo
    return true
}
