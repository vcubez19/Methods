import kotlin.math.pow


fun main() {


    // Functions to find area
    fun areaOfCircle(pi: Float = 3.14F, radius: Float) {
        println("The area of this circle is " + pi * radius.pow(2) + "\n")
    }


    fun areaOfRectangle(base: Float, height: Float) {
        println("The area of this rectangle is " + base * height + "\n")
    }


    fun areaOfSquare(base: Float, height: Float) {
        println("The area of this square is  " + base * height + "\n")
    }


    fun areaOfTriangle(base: Float, height: Float) {
        println("The area of this triangle is " + base / 2 * height + "\n")
    }


    do {


        // Menu
        println("Please select an option:\n")
        println("1) Circle")
        println("2) Rectangle")
        println("3) Square")
        println("4) Triangle")
        println("5) Exit")


        // User choice
        val choice = readLine()!!.toInt()


        // Collect input & call function for each choice
        when (choice) {
            !in 1..5 -> println("Choice out of range\n")
            1 -> {
                println("Enter radius:  ")
                val radius = readLine()!!.toFloat()

                areaOfCircle(radius = radius)
            }
            2 -> {
                println("Enter base:  ")
                val base = readLine()!!.toFloat()

                println("Enter height:  ")
                val height = readLine()!!.toFloat()

                areaOfRectangle(base, height)
            }
            3 -> {
                println("Enter base:  ")
                val base = readLine()!!.toFloat()

                println("Enter height:  ")
                val height = readLine()!!.toFloat()

                areaOfSquare(base, height)
            }
            4 -> {
                println("Enter base:  ")
                val base = readLine()!!.toFloat()

                println("Enter height:  ")
                val height = readLine()!!.toFloat()

                areaOfTriangle(base, height)
            }


        }


    } while ( choice != 5 )
    println("Goodbye!")


}

