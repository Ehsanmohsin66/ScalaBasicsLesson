

object Main {
  def sum(x:Int,y:Int):Int={ x+y} //return is optional
  def main(args: Array[String]): Unit = {
    println("Hello world!")
    println(sum(4,5))
    val v=sum(4,5)
    if (v > 20)
      {
        println("Value greater than threshold")
      }
    else
      {

        println("Value less than threshold")
      }
      val lst=List(23,4,5,6,7)
      for (e <- lst)
    {
       println(e)
    }

    case class employee(emp_id:Int,fname:String) //case class where getter, setter and constructor automatically created

    val emp1=employee(102,"Mohsin")
    var emp2=employee(103,"Rekha")
    var emp3=employee(104,"Rupali")

    case class Movie(title: String, rating: Double)
    class AdFilm(title: String, lengthInSeconds: Int)

    val fordVsFerrari = Movie("Ford vs Ferrari", 7.4)
        // Prints the string representation of the object.
    println(fordVsFerrari)
    val nikeAdFilm= new AdFilm("Nike Jordan", 185)
        // Prints the hash of the object.
    println(nikeAdFilm)
    // fordvsferrari has getter for parameter title
    println(fordVsFerrari.title)
    //However nikeAdFilm has not getter for parameter title
    //this is compiler error println(nikeAdFilm.title)
    println(fordVsFerrari==("Ford vs Ferrari", 7.4))
    println(fordVsFerrari==Movie("Ford vs Ferrari", 7.4))
    fordVsFerrari.equals(("Ford vs Ferrari", 7.4))
    println(fordVsFerrari.equals(("Ford vs Ferrari", 7.4)))
    println(fordVsFerrari.equals(Movie("Ford vs Ferrari", 7.4)))
    println(nikeAdFilm==new AdFilm("Nike Jordan", 185)) //it tries to equate addresses here

    val i:Int =3
    val nameofdigit:String = i match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "unknown"
    }
    println(nameofdigit)

    val id:Int= 102

    val name_employee:String= id match {
      case 102 => "Mohsin"
      case 103 => "Rekha"
      case 104 => "Rupali"
      case _ => "Unknown"
    }
    println(name_employee)
    // emp3.emp_id=123. This line gives following error reassignment to val emp3.emp_id=123
    for (emp <- List(emp1,emp2,emp3)){
      //this case statement here with case class shows real power of case classes by pattern matching
      emp match {
        case employee(102,"Mohsin") => println ("Hello Mohsin")
        case employee(103, "Rekha") => println ("Hello Ray")
        case _ => println("Employee not in this list with ID: " + emp.emp_id + ", Employee:" + emp.fname)
        //this last case for "ELSE" can be written as below
        // case employee(emp_id,fname ) => println("Employee not in this list with ID: " + emp_id + ", Employee:" + fname)
      }}

    val lst_testing=List(10,20,30,40,56)
    //example of map with lambda function
    var lst_new=lst_testing.map(k => k /10)
    //example of map with pre defined function
    lst_new.map(println)

    // example of reduce with pre defined function
    val sum_lst=lst_new.reduce(sum) //(x,y) => x+y)
    println("Sum of new list of integers is:" + sum_lst)

    // example of reduce with lambda function
    val sum_lst2 = lst_new.reduce((x,y) => x+y)
    println("Sum of new list of integers is:" + sum_lst2)

    // example of reduce with lambda function
    val filtered_lst = lst_testing.filter(p =>  p%10 ==0)
    println("Filtered list is:" + filtered_lst)
  }
}