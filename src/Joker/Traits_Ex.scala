package Joker


trait test {

  def m1 () :Unit

}

class c1 extends test
{
  override def m1(): Unit = println("tested")

}

object Traits_Ex {

  def main(args:Array[String]): Unit =
  {
    val c= new c1()
    c.m1()
    val z=null


  }

}
