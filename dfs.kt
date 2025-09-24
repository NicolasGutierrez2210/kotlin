fun main() {
    // Grafo con listas de adyacencia
    val grafo = mapOf(
        1 to listOf(2, 3),
        2 to listOf(4, 5),
        3 to listOf(6),
        4 to emptyList(),
        5 to emptyList(),
        6 to emptyList()
    )

    val visitados = mutableSetOf<Int>()     // marca los  nodos visitados
    dfsConPila(1, grafo, visitados)         // Se inicia el dfs desde el nodo 1
}

// DFS iterativo usando pila 

fun dfsConPila(inicio: Int, grafo: Map<Int, List<Int>>, visitados: MutableSet<Int>) {
    val pila = ArrayDeque<Int>()            // Creacion de la pila
    pila.addLast(inicio)                    // Agregacion  del nodo inicial

    while (pila.isNotEmpty()) {             // Mientras haya elementos en la pila
        val nodo = pila.removeLast()        // Sacamos el ultimo como en LIFO

        if (nodo !in visitados) {           // Si no ha sido visitado
            println("Visitando nodo $nodo") // Muestra el nodo
            visitados.add(nodo)             // Lo marcamos como visitado

            
            // reversed() mantiene el orden de recorrido como en la version recursiva
            for (vecino in grafo[nodo]?.reversed() ?: emptyList()) {
                pila.addLast(vecino)
            }
        }
    }

}
