

object PrimeNumber {
  def main(args:Array[String]){
      println(prime(29))
  }
  def prime(value:Int):Boolean={
    val number=value
    val changer=2
    def primeNumber(number:Int,changer:Int):Int={
     if(changer==number){
       return 1
     }
     if(number%(changer)==0){
        return 0
      }else return primeNumber(number,changer+1)
  }
    if(primeNumber(number,changer)==1){
      return true
    }else {
      return false
    }
  }
}