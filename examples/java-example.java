/*
 * Java Example: Box Drawing with JSON Dataset
 *
 * Use Case:
 * - Demonstrates how Java can parse JSON using Jackson.
 * - Useful for enterprise applications that need text-based diagrams.
 * - Teaches students about collections, streams, and string manipulation.
 */

import java.nio.file.*;
import java.util.*;
import com.fasterxml.jackson.databind.*;

public class BoxDrawing {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Map<String, String>> chars = mapper.readValue(
            Files.readAllBytes(Paths.get("../datasets/box-drawing-common.json")),
            List.class
        );

        String horiz = getSymbol(chars, "U+2500");
        String vert  = getSymbol(chars, "U+2502");
        String tl    = getSymbol(chars, "U+250C");
        String tr    = getSymbol(chars, "U+2510");
        String bl    = getSymbol(chars, "U+2514");
        String br    = getSymbol(chars, "U+2518");

        System.out.println(boxText("Hello World", horiz, vert, tl, tr, bl, br));
    }

    static String getSymbol(List<Map<String, String>> chars, String code) {
        return chars.stream().filter(c -> c.get("unicode").equals(code))
                    .findFirst().get().get("symbol");
    }

    static String boxText(String text, String horiz, String vert,
                          String tl, String tr, String bl, String br) {
        int width = text.length();
        return tl + horiz.repeat(width) + tr + "\n" +
               vert + text + vert + "\n" +
               bl + horiz.repeat(width) + br;
    }
}
