import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

fun main(){
    // array is mutable and fixed size
    var x= arrayOf(1,"ahmed",3,4)//int[] x={1,2,3,4,5,6} in java
    println(x.size)//length in java
    println(x[1])
    println(x.size-1)
    x[2]=5
    println(x[2])
    println(Arrays.toString(x))//like java
    println(x.contentToString())//only on kotlin
    var x1= IntArray(3)// int[] x=new int[3]; in java
    println(x1.contentToString())
    var x2= IntArray(3){10}
    println(x2.contentToString())
    var x3= IntArray(3){index: Int -> (index+2)*2  }//anonymous fun
    println(x3.contentToString())
    var x4= Array<String>(3){ "item$it" }//{index: Int -> "item$index" }
    println(x4.contentToString())
    x4.forEach { println(it) }//higher order fun take fun as a parameter or return fun
    //List dynamic size
    val list= listOf<Int>(1,2,2,4)// readonly
    println(list)
    val list1= mutableListOf<Int>(1,2,3,4)
    println(list1)
    list1[0]=5
    list1.add(3)
    list1.add(1,1)
    println(list1)
    val arlist= arrayListOf<Int>(1,2,3,4)
    arlist.add(5)
    arlist[0]=6
    println(arlist)
    //set unique values
    val y= setOf<Int>(10,20,30,10)//readonly [10, 20, 30] write only one 10
    println(y)
    val y1= mutableSetOf<Int>(10,20,30)//set don't work with index
    y1.add(40)
    println(y1)
    //map don't belong to collection interface it has own interface
    val z= mapOf<String,String>("a" to "ahmed","m" to "mohamed")//readonly
    println(z)
    println(z["a"])
    println(z.keys)
    println(z.values)
    for (t in z.entries){
        println("${t.key} - ${t.value}")
    }
    val z1= mutableMapOf<String,String>("a" to "ahmed","m" to "mohamed")
    z1["m"]="mahmoud"
    println(z1)
    //stack
    val ss=Stack<Int>()
    val qu:Queue<Int> = LinkedList<Int>()
    val lin= LinkedList<Int>()
    val ha=HashMap<Int,Int>()
    val has=HashSet<Int>()
    val tr=TreeMap<Int,Int>()
    val tre=TreeSet<Int>()







}