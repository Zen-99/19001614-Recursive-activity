

object Fibonacci {
  def main(args:Array[String]){
      fibbonacci(10)
  }
  
  def fib(number:Int):Int={
        if(number<=1){
          return number
        }else{
    
          return fib(number-1)+fib(number-2)
        }
  }
  def fibbonacci(value:Int){
      if(value>0){
        fibbonacci(value-1)
      }
      print(fib(value)+" ")
  }
    
  
}