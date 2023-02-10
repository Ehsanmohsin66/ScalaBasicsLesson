object Tetsing_stream extends App {

    val stream = 20 #:: 30 #:: 45 #:: Stream.empty
    println(stream.tail.tail.tail)
    println(stream.head)

    val multiArr = Array.ofDim[Int](2, 2)
    multiArr(0)(0) = 5
  multiArr(0)(1) = 10
  multiArr(1)(0) = 15
  multiArr(1)(1) = 20
  for (i <- 0 to 1; j <- 0 to 1) {
    println("Element " + i + j + " = " + multiArr(i)(j))
  }
  val multiArr2 = Array.ofDim[Int](2, 2)
  multiArr2(0)(0) = 5
  multiArr2(0)(1) = 10
  multiArr2(1)(0) = 15
  multiArr2(1)(1) = 20

  var muti_array=(multiArr,multiArr2)

  for ( j <- 0 to 1 ; k <- 0 to 1) {
    println("Element 0" + j + k + " = " + muti_array._1(j)(k))
    println("Element 0" + j + k + " = " + muti_array._1(j)(k))
  }

}
