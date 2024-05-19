fun main(){
    print("hello ")
    println("world")
    var x=3
    println("the value of x="+x)//in java and kotlin
    println("the value of x=$x")//in kotlin only
    println("the value of x+2="+(x+2))//in java and kotlin
    println("the value of x+2=${x + 2}")//in kotlin only
    var name= "kotlin"
    println("my language is ${name.uppercase()}")
    var xx:Int
    xx=6
    val pi=3.14 //like final in java cant be change
    // casting in kotlin don't care about data type size unlike java if datatype large = datatype small it's ok
    // casting in java byte = (byte)int;
    var a:Byte =3
    var b:Int =a.toInt()
    b=a.toInt()
    var name1="ahmed"
    name1=b.toString()//if reverse make Exception but if ahmed = number(100) will be ok
    println(name1)
    /*
    Data types
    ------------
    Integers:-
    Byte - Short - Int - Long
    Floating Points:-
    Float - Double
    Char
    String
    Boolean
    */
    /*
    * Arithmetic operation:-
      * - + / %
    * Comparison operation:-
      > < >= <=
      * in java with primitive data type( int ) == !=
      * in java with object reference data type( String ) .equals !.equals
      == != ( .equals in java)
      === !== ( == in java)
      * more explain for this point look kotlin1 video 45:20 m to 50 m
      is (in java instance of )
      * logical operator
      && || ! (in java & | ! and && || ! ) the both is true in java
      * Bitwise op:-
        and or xor inv
        shr shl ushr
        * (conditional or internal op( inline if ) in java look kotlin1 video 57:4 m to 59 m )
        * don't exist in kotlin because if statement in kotlin is return
     */
    var aa: Int =7/3
    var aaa:Boolean=aa is Int
    println(aaa)
    //receive input from user we can use scanner
    //var xz= Scanner(System.`in`).nextInt()
    //println(xz)
//    print("enter your name: ")
//    var xz=readLine()
//    println(xz)
//    print("enter your salary: ")
//    var salary= readLine()?.toInt()//(nullable explain what null safety is meaning kotlin1 video 1:4m to 1:12m)
//    if (salary != null) {
//        println(salary+50)
//    }else{
//        println("the value is null")
//    }
    /*conditional statements
      if statement
      when statement (switch in java)
     *looping statements
      for
      while
      do - while
     *jumping statements
      break
      continue

     */
//    print("enter your number: ")
//    var xa= readLine()?.toInt()
//        var retval=if (xa!! <9){
//            xa++
//            println("xa is small")
//            "small"
//        }else if (xa==9){
//            println("xa is equal")
//            "equal"
//        }else{
//            println("xa is big")
//            "big"
//        }
//        println(retval)

    var c=2
    var str = if (c == 2) "ok" else "NO"//(inline if like java (6>2)?"OK":"NO";)
    println(str)
    // when statement
    var xl:Int =8
    // as switch in java
    when(xl){
        2-> println("xl = 2")
        4 -> println("xl = 4")
        6 -> println("xl = 6")
        8 -> println("xl = 8")
        in 10..12-> println("in range")
        in listOf<Int>(14,16,18,20,16)-> println("in list")//can be repeat any number like 16
        in setOf<Int>(22,44,66,88)-> println("in set")// can't be repeat any number
        in arrayOf(100,110,120)-> println("in array")
        else-> println("not found")//I can don't use it here
        //else here like default in java
    }
    // when like if make return
    var cc=0
    var rewe= when(cc){
        0,4-> "failed"
        1-> "accept"
        2-> "not accept"
        else->"not found"//I should use it here
    }
    println(rewe)
    // when as if
    var vv=4
    var bb=7
    when{
        vv > bb-> println(vv)
        vv<bb-> println(bb)
        else-> println(" is equal ")
    }
    when{
        odd(vv)-> println("odd")
        even(vv)-> println("even")
        else-> println("problem")
    }
    if (odd(vv)){
        println("odd")
    }else if (even(vv)){
        println("even")
    }else{
        println("problem")
    }
    // for statement
    for (i in 0..2 ){
        println(i)
    }
    println("###############################")
    for (i in 0..4 step 2 ){
        println(i)
    }
    println("###############################")
    for (i in 4.downTo(0) step 2 ){
        println(i)
    }
    println("###############################")
    for (i in 4 downTo 0){
        println(i)
    }
    println("###############################")
    for (i in  0.rangeTo(2) ){
        println(i)
    }
    println("###############################")
    var w= arrayOf(1,2,8,5)
    for (i in w ){
        println(i)
    }
    println("###############################")
    for (i in w.indices ){
        println(w[i])
    }
    println("###############################")
    //while and do while like java
    var j=0
    while (j<5){
        println(j)
        j++
    }
    println("###############################")
    do {
        println(j)
        j++
    }while (j<5)
    println("###############################")
    //jumping statements
    for (i in 0..100 ){
        if (i==3)break
        println(i)
    }
    println("###############################")
    // use label like a: in java but kotlin a@
    a@for (i in 0..5 ){
        b@for (j in 0..5){
            if (j==3)break@a
            println("$i $j")
        }
    }
    println("###############################")
    a@for (i in 0..5 ){
        b@for (j in 0..5){
            if (j==3)continue@a
            println("$i $j")
        }
    }
    println("###############################")



}
fun odd(num:Int)=num%2 !=0 //return true or false
//fun odd(num:Int):Boolean{
//    return num%2 !=0
//}
fun even(num:Int)=num%2 ==0 //return true or false
