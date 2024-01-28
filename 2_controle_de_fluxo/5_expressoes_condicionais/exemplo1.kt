/**
 * Expressões condicionais (análogas a operadores ternários).
 *
 * @see [Conditional Expression](https://play.kotlinlang.org/byExample/02_control_flow/05_Conditional%20expression)
 */
fun main() {
    
    fun maxOld(a: Int, b: Int): Int{
        if (a > b){
            return a
        }else{
            return b
        }
    }
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    println(max(99, -42))
    println(maxOld(9, 42))
}