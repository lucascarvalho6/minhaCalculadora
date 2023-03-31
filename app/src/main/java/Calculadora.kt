class Calculadora {

    fun sun (a: Double, b: Double): Double = a + b

    fun subtract (a: Double, b: Double): Double = a - b

    fun multiply (a: Double, b: Double): Double = a * b

    fun divide (a: Double, b: Double): Double {
        if (b==0.0) throw java.lang.IllegalArgumentException("Divisão por zero não pode...")
        return a/b
    }

}