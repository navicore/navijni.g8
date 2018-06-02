package $package$

import ch.jodersky.jni.nativeLoader

@nativeLoader("$nativeModuleName;format="lower"$0")
class $nativeModuleName$ {
  // --- Native methods
  @native def intMethod(n: Int): Int
  @native def booleanMethod(b: Boolean): Boolean
  @native def stringMethod(s: String): String
  @native def intArrayMethod(a: Array[Int]): Int
}

