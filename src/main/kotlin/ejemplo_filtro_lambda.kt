
fun main() {
    println("Hello, world!!!")
    var lista = listOf("Hola","Adios","Pepe","Juan","Argentina")
    var lista2 = lista.Mifiltro{it.length > 5}
    print(lista2)
}


fun <T> List<T>.Mifiltro(lambda:(T) -> Boolean):List<T>{
    var lista = mutableListOf<T>()
    for (e in this)
        if (lambda(e))
            lista.add(e)
    return lista
}