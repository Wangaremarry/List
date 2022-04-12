
fun main() {
    var colours = listOf("Blue", "Red", "Black", "Yellow")
    var streams = mutableListOf("Lisalab", "Lovelace", "AnitaB")
    streams.add("Zambia")
    println(streams)
    var nums = listOf(21, 20, 19, 18, 22, 22, 25, 21, 22)
    var sortedNums=nums.sorted()
    println(sortedNums)
    println(nums.count())
    println(nums.size)
    println(nums.maxOrNull())
    println(nums.average())
    println(nums[3])
    println(nums.first())
    println(nums.last())
    println(nums.lastIndexOf(22))
    val names=listOf("James", "Penina","Peter","Lucy")
    for (name in names){
        println(name)
    }
    var ted=Farmer("Ted", 23)
    println(ted is Farmer)
    var x =Car("Toyota", "Premio")
    var y =Car("Audi", "A5")
    var z =Car("Nissan", "Juke")
    var cars=listOf(x,y,z)
    println(cars)
    var sorted=cars.sortedBy{car-> car.model}
    println(sorted)
    var name=listOf("Abed","Elizabeth","Ephraim", "Tanasha","Edgar")
    var l=name.filter{ name-> name.startsWith("E")}
    println(l)
    var a =Person("Mellisa" ,23)
    var b=Person("Wanjiru", 16)
    var c=Person("Steve", 25)
    var d=Person("Kadenye", 24)
   var people=listOf(a,b,c,d)
    var adult=people.filter { adult-> adult.age>=18 }
    println(adult)


}

class Farmer(var name:String, var age:Int){
}
data class Car(var make:String, var model:String)
data class Person(var name:String , var age:Int)

