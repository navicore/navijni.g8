package $package$

object Main {

  // --- Main method to test our native library
  def main(args: Array[String]): Unit = {
    val $nativeModuleName;format="camel"$ = new $nativeModuleName$
    val square = $nativeModuleName;format="camel"$.intMethod(5)
    val bool = $nativeModuleName;format="camel"$.booleanMethod(true)
    val text = $nativeModuleName;format="camel"$.stringMethod("java")
    val sum = $nativeModuleName;format="camel"$.intArrayMethod(Array(1, 1, 2, 3, 5, 8, 13))

    println(s"intMethod: \$square")
    println(s"booleanMethod: \$bool")
    println(s"stringMethod: \$text")
    println(s"intArrayMethod: \$sum")
  }
}

