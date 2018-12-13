package Joker

import Joker.Clouser_Ex.greet_msg

object Clouser_Ex extends App {

  var greet_msg="Hello"

  val g=new Greet
  g.greet("Revathi")

  greet_msg="Welcome"
  g.greet("Revathi")
}

class Greet {

  def greet(name:String): Unit = {
    println(greet_msg + ":" + name)
  }
}

