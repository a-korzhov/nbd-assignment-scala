package assignment1_2

/**
 * @project assignment-1
 * @author korzh
 * @createdAt 16-Oct-19
 */

case class Student(
                    age: Int,
                    Name: String,
                    marks: Int,
                    gender: Option[String]
                  )

object item_10 extends App {

  val countries: Map[String, String] = Map(
    "Kiev" -> "Ukraine",
    "Warsaw" -> "Poland",
    "London" -> "England")

  val students: Map[Int, Student] = Map(
    1 -> Student(21, "Alexander", 3, Some("male")),
    2 -> Student(18, "Steven", 3, Some("male")),
    3 -> Student(19, "Andrew", 5, Some("male"))
  )

  val st1: Option[Student] = findById(2)

  if (st1.isDefined) {
    println("Age: " + st1.get.age)
    println("Name: " + st1.get.Name)
    println("Mark: " + st1.get.marks)
  }

  //1
  def country(x: Option[String]): String = x match {
    case Some(s) => s
    case None => "<none>"
  }

  //2
  def findById(id: Int): Option[Student] = students.get(id)

    println("Kiev is the capital of " + country(countries.get("Kiev")))
    println("Warsaw is the capital of " + country(countries.get("Warsaw")))
    println("Moscow is the capital of " + country(countries.get("Moscow")))

}

