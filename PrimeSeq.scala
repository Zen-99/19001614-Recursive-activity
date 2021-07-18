

object PrimeSeq {
  def main(args:Array[String]){
     primeSeq(31)
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
    //printSeq function
    def primeSeq(value:Int){
      if(value > 1) {
        if(prime(value)) {
            print(value+" ");
        }
        primeSeq(value-1); 
    }
    }
}