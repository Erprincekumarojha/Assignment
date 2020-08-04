//2. Write a function to validate the Date
var MAX_VALID_YR: Int = 9999
var MIN_VALID_YR = 1800

fun main(args: Array<String>) {
    if (isValidDate(10, 12, 2000))
        println("Yes") else println("No")
    if (isValidDate(31, 11, 2000))
        println("Yes") else println("No")
}

fun isLeap(year: Int): Boolean {
    // Return true if year is
    // a multiple of 4 and not
    // multiple of 100.
    // OR year is multiple of 400.
    return year % 4 == 0 &&
            year % 100 != 0 ||
            year % 400 == 0
}

// Returns true if given
// year is valid or not.
fun isValidDate(d: Int,
                m: Int,
                y: Int): Boolean {
    // If year, month and day
    // are not in given range
    if (y > MAX_VALID_YR ||
            y < MIN_VALID_YR) return false
    if (m < 1 || m > 12) return false
    if (d < 1 || d > 31) return false

    // Handle February month
    // with leap year
    if (m == 2) {
        return if (isLeap(y)) d <= 29 else d <= 28
    }

    // Months of April, June,
    // Sept and Nov must have
    // number of days less than
    // or equal to 30.
    return if (m == 4 || m == 6 || m == 9 || m == 11) d <= 30 else true
}


