class Foo(val opposite: Foo)
case object A extends Foo(B) 
case object B extends Foo(A)
object Test {
  def main(args: Array[String]): Unit = {
    println(A.opposite)
    println(B.opposite)
  }
}

// nopos-error: No warnings can be incurred under -Werror.