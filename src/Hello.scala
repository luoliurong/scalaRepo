object Hello extends App {
  println("Hello, world!")

  var greetStrings = new Array[String](3)

  greetStrings(0) = "Hello"
  greetStrings(1) = ", "
  greetStrings(2) = "world!\n"

  for(i<-0 to 2){
    print(greetStrings(i))
  }

  //simpler way to define array in scala
  val numNames = Array("zero", "one", "two")

  for(i<-0 to 2){
    println(numNames(i))
  }
}