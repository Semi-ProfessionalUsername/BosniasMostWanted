fun main() {

    var output = ""

    for (i in 1 .. 100) {

        if (i % 3 == 0) output += "Fizz"
        if (i % 5 == 0) output += "Buzz"

        if (output.equals("")) println(i)
        else println(output)

        output = ""
    }
    
}
