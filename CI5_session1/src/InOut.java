import java.util.Scanner

object InOut {
    @JvmStatic
    fun main(args: Array<String>) {
        // Scanner
        val keyboardScanner = Scanner(System.`in`)
        // nextLine
        // nextInt
        println("Enter a text:") // Prompt, question
        val line = keyboardScanner.nextLine()
        // Test
        println(line)

        println("Enter a number")
        val x = keyboardScanner.nextInt() // validate
        println(x)
    }
}
