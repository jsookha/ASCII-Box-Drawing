/*
 * Kotlin Example: Box Drawing with JSON Dataset
 *
 * Use Case:
 * - Demonstrates how Kotlin can parse JSON with Jackson.
 * - Useful for Android or JVM projects needing text-based diagrams.
 * - Teaches students about data classes and functional style.
 */

import java.io.File
import com.fasterxml.jackson.module.kotlin.*

data class CharEntry(val symbol: String, val unicode: String)

fun main() {
    val mapper = jacksonObjectMapper()
    val chars: List<CharEntry> = mapper.readValue(File("../datasets/box-drawing-common.json"))

    fun getSymbol(code: String) = chars.first { it.unicode == code }.symbol

    val horiz = getSymbol("U+2500")
    val vert  = getSymbol("U+2502")
    val tl    = getSymbol("U+250C")
    val tr    = getSymbol("U+2510")
    val bl    = getSymbol("U+2514")
    val br    = getSymbol("U+2518")

    fun boxText(text: String): String {
        val width = text.length
        return "$tl${horiz.repeat(width)}$tr\n" +
               "$vert$text$vert\n" +
               "$bl${horiz.repeat(width)}$br"
    }

    println(boxText("Hello World"))
}