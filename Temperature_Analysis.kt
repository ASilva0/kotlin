import kotlin.math.roundToInt
import kotlin.math.roundToLong

/*
* Objective: Daily Temperature Analysis
* Class: 2025 SU ITSE-1329-23701
* Instructor: Professor Vo
* Student: Angel Silva, ID 2521604
* Date: 07/21/2025
*/

fun main(args: Array<String>) {

    /// START of ASSIGNMENT

//**\\
////**** Part 1: Basic Functions and Executions
//**\\
    // Task 1.1 Declare Temperature Data

    println("\n1.1 Declare Temperature Data") /// START of 1.1
    var dailyTemperatures:Array<Double> = arrayOf(22.5, 24.1, 18.0, -999.0, 26.3, 19.5, 21.0)
    println("\nend of 1.1\n") /// END of 1.1

    // Task 1.2 Initialize Variables

    println("\n1.2 Initialize Variables") /// START of 1.2
    var totalValidTemperatureSum:Double = 0.0
    var validDayCount:Int = 0
    var highestTemperature:Double = Double.MIN_VALUE // lowest value closets to ZERO (4.9E-324)
    var lowestTemperature:Double = Double.MAX_VALUE // a huge number (1.7976931348623157E308)
    println("\nend of 1.2\n") /// END of 1.2

    // Task 1.3 Iterate and Process (Loop with 'continue')

    println("\n1.3 Iterate and Process") /// START of 1.3
    for (temp in dailyTemperatures) {
        if (temp>56.0 || temp<-89.0) {
            println("An invalid temperature was found")
            continue
        } else if (temp < lowestTemperature) {
            lowestTemperature = temp
        } else if (temp > highestTemperature) {
            highestTemperature = temp
        }
        validDayCount++
        totalValidTemperatureSum+=temp
    }
    println("\nend of 1.3\n") /// END of 1.3

    // Task 1.4 Calculate and print basic Statistics

    println("\n1.4 Calculate and Statistics") /// START of 1.4
    if (validDayCount>0) {
        var averageTemperature:Double = totalValidTemperatureSum/validDayCount
        println("Average valid temperature for the week: %.2f".format(averageTemperature))
        println("Highest temperature recorded: ${highestTemperature}")
        println("Lowest temperature recorded: ${lowestTemperature}")
    }
    println("\nend of 1.4\n") /// END of 1.4

//**\\
////**** Part 1: Basic Functions and Executions
//**\\
    // Task 2.1 count hot and cold days

    println("\n2.1 Count Hot and Cold Days") /// START 2.1
    var hotDaysCount:Int = 0
    var coldDaysCount:Int = 0
    if (hotDaysCount>25) {
        hotDaysCount++
    }
    println("\nend of 2.1\n") /// END of 2.1

    // Task 2.2 check for extreme deviations (loop with break and range)

    println("\n2.2 Checking for extreme Deviations") /// START of 2.2
    println("\nend of 2.2\n") /// END of 2.2

    /// END of ASSIGNMENT
}