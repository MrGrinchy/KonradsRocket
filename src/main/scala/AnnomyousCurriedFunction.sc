import java.io.Serializable

case class Request()
case class User(name: String)
case class Result(status: String)

def doAction(testNumber:Int) =AuthorizedXYZ(testNumber:Int) { request => user =>Int=> {
   testNumber match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case _ => "Another"
  }
}
}

def AuthorizedXYZ(testNumber:Int)(f:(Request=>User=>Int=>String))={

  val user=User("Some Name")
  val request=Request()

  if(true) {
    f(request)(user)(testNumber)
  }else{
    "FAILURE"
  }
}

doAction(2)








