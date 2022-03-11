fun main(){
    modify("Anena", "Faith", "Waiguru", "Gumato") //O
    case(arrayOf("harare", "mumbai", "dodoma", "jakarta"))
    operations(arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62))
    var names=connecting("George", "Paul", "Kim")
    println(names.contentToString())

}

fun modify(w:String, x:String, y:String, z:String){
    var result = arrayOf(w, x, y, z)
    println(result.contentToString())
}

fun case(cities:Array<String>){
    cities.forEach { z ->
        println(z.capitalize())
    }
}

fun operations(numbers:Array<Int>){
    var sum= numbers[0] + numbers[4]
    println(sum)

    var position=numbers.indexOf(158)
    println(position)

    println(numbers.sortedArray().contentToString())
}

fun connecting(name1:String, name2:String, name3:String):Array<String>{
    var names= arrayOf(name1, name2, name3)
    return names
}





