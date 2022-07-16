package com.variables

object VariablesTest extends App {
  //val - Immutable variable
  //var - mutable variable
  //Scala is Type Inference
  val name = "scala"
  var num = 10

  val num1:Int = 100

  //name = "Python"  //for VAL - Reassignment is not possible
  //num = 20  // For VAR - Reassignment is possible

  val names = "Python"  // It is destructing the existing one & constructing the new one
  val add = 10 + num

  //REPL => R-read,  E-Evaluate, P-print, L-loop

}
