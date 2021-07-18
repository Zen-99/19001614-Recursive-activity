

object OddEven {
  def main(args:Array[String]){
      oddEven(10196)
  }
  def oddEven(number:Int):Unit={
    def isEven(number:Int):Boolean={
      if(number==0){
        return true
      } else if(number==1){
        return false
      }else{
        isEven(number-2)
      }
    }
    if(isEven(number)){
      print("Even")
    }else{
      print("Odd")
    }
  }
}