fun main() {
    // Dos numeros para calcular el MCD
    val a = 56
    val b = 98
    
    // Llamamos a la funcion 
    
val resultado = mcdEuclides(a, b)
    println("El MCD de $a y $b es: $resultado")
}

// Funcion que implementa el algoritmo de Euclides

fun mcdEuclides(a: Int, b: Int): Int {
    var x = a
    var y = b
    
 // Mientras el segundo numero sea diferente de 0
    
while (y != 0) {
        // Guardamos el valor de y
        val temp = y
       
 // y pasa a ser el residuo de la división
        y = x % y
        
// x toma el valor de y anterior
        x = temp
    }
    
    // Cuando y es 0, x es el contiene el MCD
    return x
}
