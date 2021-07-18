

object Fibonacci {
  def main(args:Array[String]){
      fibbonacci(10)
  }
  
  def fibbonacci(value:Int){
      var number:Int=0
      for(number<-0 to value-1){
        print(fib(number)+" ")
        
      }
      def fib(number:Int):Int={
        if(number<=1){
          return number
        }else{
    
          return fib(number-1)+fib(number-2)
        }
      }
    }
    
  
}