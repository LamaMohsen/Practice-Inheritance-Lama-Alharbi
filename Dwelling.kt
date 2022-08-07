fun main() {
    
    val sqaureCabin= SeqaureCabin(10)
    
    with(sqaureCabin){
    println("\n Square Cabin\n============")
    println("capcity:${capacity}")
    println("metrail:${buildingMaterial}")
     println("Has Room??:${hasroom()}") }
    val roundhut=RoundHut(1)
    with(roundhut){
        	println("\nRound Hut\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasroom()}")
    }
      val roundTower = roundtoure(1)
    
    with(roundTower){
        	println("\nRound Tower\n============")
    		println("Material: ${buildingMaterial}")
    		println("Capacity: ${capacity}")   
    		println("Has Room?? ${hasroom()}")
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
} 

// subclass
class SeqaureCabin (residents:Int):Dwelling(residents){
    override val buildingMaterial ="wood"
    override val capacity=6
} 

open class RoundHut(residents:Int) :Dwelling(residents){
    override val buildingMaterial ="straw"
    override val capacity=4
    
}
class roundtoure (residents:Int):RoundHut(residents){
     override val buildingMaterial ="stone"
    override val capacity=3
}
