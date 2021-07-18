

object EvenSum {
  def main(args:Array[String]){
      println(evenSum(9))
  }
  
  def evenSum(number:Int):Int={
    var num=0
    if(number%2==0){
      num=number-2
    }else if(number%2==1){
      num=number-1
    }
    def sum(num:Int):Int={
      if(num>2){
        return num + sum(num-2)
      }else{
        return 2
      }
    }
    return sum(num)
  }
}