

object Sum {
  def main(args:Array[String]){
      println(sum(8))
  }
  def sum(number:Int):Int={
    if(number>1){
      return number + sum(number-1)
    }else{
      return 1
    }
  }
}