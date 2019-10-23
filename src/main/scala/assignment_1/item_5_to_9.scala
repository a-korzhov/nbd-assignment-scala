package assignment_1

/**
 * @project assignment-1
 * @author korzh
 * @createdAt 16-Oct-19
 */

object item_5_to_9 extends App {

  import assignment_1.Lists.myMap
  import assignment_1.Lists.listInt

  private val reduced: Map[String, Int] = reduceMapValue(myMap)
  private val value: List[Int] = increaseByOne(listInt)

  val listIntForRange = List.range(-5, 12)
  val tuple = Tuple3(1, " text ", 2.2)

  println("Reduced values: " + reduced)
  println("------------------------------------------------")
  println("Increased by 1: " + value)
  println("------------------------------------------------")
  println("Absolute values of Ints: " + absoluteValues(listIntForRange))
  print("Tuples: ")
  printTuples(tuple)

  // 5
  def reduceMapValue(store: Map[String, Int]): Map[String, Int] = store.view.mapValues(_ / 10).toMap

  //6
  def increaseByOne(list: List[Int]): List[Int] = list.map(p => p + 1)

  //7
  def absoluteValues(list: List[Int]): List[Int] = list.map(p => p)

  //8
  def printTuples[A, B, C](tuple3: (A, B, C)): Unit = println(tuple3)

  //9
//  def withoutZero(list: List[Int], zero: Int): List[Int] =
//    if (zero == 0)
//      list.drop(zero)
//    else withoutZero()
}
