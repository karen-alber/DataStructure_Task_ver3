import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val inputList = mutableListOf<String>()
    val newList = mutableListOf<String>()
    print("Enter iteration number: ")
    var iterations = scanner.nextInt()
    scanner.nextLine()

    while(iterations > 0){
        print("Enter any name: ")
        val input = scanner.nextLine()
        inputList.add(input)
        iterations--
    }
    println("Names List:  $inputList")


    for(items in inputList){
        if(items.contains('B') || items.contains('b') || items.contains('M') || items.contains('m'))
        {
            newList.add(items.uppercase())
        }
    }
    println("Names List containing 'B' and 'M' characters only:  $newList")

}