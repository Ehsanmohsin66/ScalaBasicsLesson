trait Printer {
  //non abstract
  def print(msg : String) = println (msg)
  //abstract
  def greet():Unit
}

trait DelimitWithHyphen extends Printer {
  override def print(msg : String) {
    println("-------------")
    super.print(msg)
  }

  override def greet():Unit ={
    println("greet from hyphen")
    //super.greet()
  }
}

trait DelimitWithStar extends Printer  {
  override def print(msg : String) {
    println("*************")
    super.print(msg)
  }

  override def greet(): Unit = {
    println("greet from star")
    //super.greet()
  }
}

class CustomPrinter extends Printer with DelimitWithHyphen with DelimitWithStar

object traitsDemo{
  def main(args: Array[String]) {
    new CustomPrinter().print("Hello World!")

    new CustomPrinter().greet()

  }
}