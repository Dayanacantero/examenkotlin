package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//fun main() {
//    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
//    fun sumarPares(numeros: Array<Int>): Int {
//        return numeros.filter { it % 2 == 0 }.sum()
//    }
//    println(sumarPares(numeros))
//
//}
// 2 precio de producto con iva
////}
//    class Producto(val nombre: String, val precio: Double) {
//
//        fun mostrarPrecioConIVA() {
//            val iva = 0.16 // Supongamos que el IVA es del 16%
//            val precioConIVA = precio * (1 + iva)
//            println("Precio con IVA: $precioConIVA")
//        }
//    }
//
//    fun main() {
//        val laptop = Producto("Laptop X", 1500.0)
//        laptop.mostrarPrecioConIVA()
//    }


//fun main() {
//    val numero = 5
//
//    fun duplicarNumero() {
//        val resultado = numero * 2
//        println("Número duplicado: $resultado")
//    }
//
//    duplicarNumero()
////
////
//}
//funcion odrden superior
//fun aplicarOperacion(numero: Int, operacion: (Int) -> Int): Int {
//    return operacion(numero)
//}
//
//
//fun cuadrado(numero: Int): Int {
//    return numero * numero
//}
//
//
//fun main() {
//    val resultado = aplicarOperacion(5, ::cuadrado)
//    println(resultado)
//}


//calcular areas

//    abstract class FiguraGeometrica {
//        abstract fun calcularArea(): Double
//    }
//
//
//    class Rectangulo(val base: Double, val altura: Double) : FiguraGeometrica() {
//
//        override fun calcularArea(): Double {
//            return base * altura
//        }
//    }
//
//
//    class Circulo(val radio: Double) : FiguraGeometrica() {
//
//        override fun calcularArea(): Double {
//            val PI = 3.141592653589793
//            return PI * radio * radio
//        }
//    }
//
//
//    fun main() {
//        val rectangulo = Rectangulo(5.0, 3.0)
//        val circulo = Circulo(4.0)
//
//        println("Área del rectángulo: ${rectangulo.calcularArea()}")
//        println("Área del círculo: ${circulo.calcularArea()}")
//    }
//

//perfil de susario

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Nombre: $name")
        println("Años: $age")
    }

}

