
import kotlin.math.PI
fun main() {
    
    val sqaureCabin= SeqaureCabin(10,50.0)
    
    with(sqaureCabin){
    println("\n Square Cabin\n============")
    println("capcity:${capacity}")
    println("metrail:${buildingMaterial}")
    println("Has Room??:${hasroom()}")
    println("floorArea:${floorArea()}")
    getroom()
    }
    val roundhut=RoundHut(1,10.0)
    with(roundhut){
        	println("\nRound Hut\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasroom()}")
            println("floorArea:${floorArea()}")
            getroom()
    }
      val roundTower = roundtoure(50,15.0 ,10)
    
    with(roundTower){
        	println("\nRound Tower\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasroom()}")
            getroom()
    }
}

//super class
abstract class Dwelling( private var residents:Int){//Bulding class
    //attributes
     abstract val buildingMaterial:String
     abstract val capacity:Int
    
    //functions-method
    fun hasroom():Boolean{
        return residents<=capacity
    }
    
    fun getroom(){
        if (residents<=capacity){
            residents++
            println("you got a room!")
        }
        else
        println("sorry at capacity and no rooms left ")
    }
    abstract fun floorArea():Double
} 

// subclass
class SeqaureCabin (residents:Int,val length :Double):Dwelling(residents){
    override val buildingMaterial ="wood"
    override val capacity=6
    
    override fun floorArea():Double{
        return length*length
    }
} 

open class RoundHut(residents:Int,val radius:Double) :Dwelling(residents){
    override val buildingMaterial ="straw"
    override val capacity=3
    
     override fun floorArea():Double{
         return PI*radius*radius
     }
    
}
class roundtoure (residents:Int, radius:Double ,val floors:Int=2):RoundHut(residents,radius){
     override val buildingMaterial ="stone"
    override val capacity=4*floors
    
    override fun floorArea():Double{
         return super.floorArea()*floors
     }
}
   
