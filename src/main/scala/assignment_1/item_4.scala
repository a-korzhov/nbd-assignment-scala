package assignment_1

/**
 * @project assignment-1
 * @author korzh
 * @createdAt 16-Oct-19
 */
object item_4 extends App {

  import assignment_1.Lists.list

  println("foldRight: " + foldRightFunc(list))
  println("------------------------------------------------")
  println("foldLeft: " + foldLeftFunc(list))
  println("------------------------------------------------")
  println("foldLeft only with 'S': " + foldLeftFuncWithS(list))


  //4 a
  def foldLeftFunc(list: List[String]): String =
    list.foldLeft("")((acc, s) => if (acc.isEmpty) s else acc + "," + s)

  // 4 b
  def foldRightFunc(list: List[String]): String = {
    val lastElement = list.last
    val listWithoutLast = list.drop(0).dropRight(1)
    val str = listWithoutLast.foldRight("")((x, y) => x + "," + y)
    str + lastElement
  }

  // for task 4 c
  def selectWithS(list: List[String]): List[String] = for (day <- list if day.startsWith("S")) yield day

  //4 c
  def foldLeftFuncWithS(list: List[String]): String = {
    val value = selectWithS(list)
    val str = value.tail.foldLeft("")((x, y) => x + " , " + y)
    value.head + str
  }
}
