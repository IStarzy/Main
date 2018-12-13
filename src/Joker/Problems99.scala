package Joker

object Problems99 extends App {

  val  l= List(1,2,3,4,5)
  println("the last element" + recursiveLast(l))
  println("the last element using foldleft" + foldLast(l))
  println("the Kth element" + kthElement(l,2,0))
  def recursiveLast[A](list: List[A]): A= list match {

    case h :: Nil=> h
    case _ :: tail => recursiveLast(tail)
    case _ =>  throw new NoSuchElementException
  }

  def kthElement[A](list:List[A],k:Int,count:Int):A= list match {

    case h :: tail => if (count==k) {h} else kthElement(tail,k,count+1)

  }

  def nthRecursive[A](n: Int, ls: List[A]): A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }

  def foldLast[A](list:List[A]): A =  list.foldLeft[A](list.head){(_,cur)=> cur}

  def foldAverage(list:List[Int]) : Int =  list.foldLeft[Int](0){(acc,i) => (acc+i)/i}

}
