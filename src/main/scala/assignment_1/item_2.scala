package assignment_1

/**
 * @project assignment-1
 * @author korzh
 * @createdAt 16-Oct-19
 */
object item_2 extends App {
  import assignment_1.Lists.list

  println("Iteration recursively: " + iterateRecursively(list)("Value: " + _).mkString(" , "))
  println("------------------------------------------------")
  println("Iteration recursively and reverse it:" + iterateRecursivelyReverse(list)(x => "Value: " + x).mkString(" , "))
  println("------------------------------------------------")
  println("Iteration recursively and reverse it(same as previous): "
    + iterateRecursivelyAndReverse(list)("Value: " + _).mkString(" , "))


  // 2 a
  def iterateRecursively(a: List[String])(func: String => String): List[String] = {
    a match {
      case x :: xs => func(x) :: iterateRecursively(xs)(func)
      case _ => Nil
    }
  }

  // 2 b
  def iterateRecursivelyReverse(a: List[String])(f: String => String): List[String] = {
    a match {
      case x :: xs => iterateRecursivelyReverse(xs)(f) :+ f(x)
      case _ => Nil
    }
  } // :+ f(x) ??????!!!!!!

  // 2 b(2)
  def iterateRecursivelyAndReverse(a: List[String])(func: String => String): List[String] = {
    a match {
      case x :: xs => func(x) :: iterateRecursivelyAndReverse(xs)(func)
        a.reverse
      case _ => Nil
    }
  }

}
