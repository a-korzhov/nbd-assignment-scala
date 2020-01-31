package assignment1_2

/**
 * @project assignment-1
 * @author korzh
 * @createdAt 16-Oct-19
 */
object item_3 extends App {

  import assignment1_2.Lists.list

  println(tailRecursiveIteration(list))

  //3
  def tailRecursiveIteration(list: List[String], acc: List[String] = List.empty): String = {
    @scala.annotation.tailrec
    def iter(l: String, res: String): String =
      if (l.isEmpty) res
      else iter(l, res)

    list.mkString(" , ")
  }
}
