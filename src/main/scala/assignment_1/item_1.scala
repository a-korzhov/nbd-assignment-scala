package assignment_1

/**
 * @project assignment-1
 * @author korzh
 * @createdAt 16-Oct-19
 */
object item_1 extends App {

  import assignment_1.Lists.list

  println("Simple iteration: " + iterateAndToString(list)) // a)
  println("------------------------------------------------")
  println("Days that start on 'S': " + daysStartsWithS(list)) // b)
  println("------------------------------------------------")
  println("Iteration with while loop: " + whileLoop(list))
  println("------------------------------------------------")
  println("Foreach loop: " + foreachFunc(list))

  // 1 a
  def iterateAndToString(list: List[String]): String = list.mkString(" , ")


  // 1 b

  def daysStartsWithS(list: List[String]): String =
    (for (day <- list if day.startsWith("S")) yield day).mkString(", ")


  // 1 c
  def whileLoop(list: List[String]): String = {
    var i = 0
    val s = list.size
    while (i < s) {
      list(i)
      i += 1
    }
    list.mkString(" , ")
  }

  // 1 test
  def foreachFunc(list: List[String]): String = {
    val s = list.size
    (0 until s) foreach (i => list(i))

    list.mkString(" , ")
  }
}
