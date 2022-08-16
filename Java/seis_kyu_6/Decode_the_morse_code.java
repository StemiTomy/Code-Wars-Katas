package seis_kyu_6;

/*
In this kata you have to write a simple Morse code decoder. While the Morse code is now mostly superseded by voice and digital data communication channels, it still has its use in some applications around the world.
The Morse code encodes every character as a sequence of "dots" and "dashes". For example, the letter A is coded as ·−, letter Q is coded as −−·−, and digit 1 is coded as ·−−−−. The Morse code is case-insensitive, traditionally capital letters are used. When the message is written in Morse code, a single space is used to separate the character codes and 3 spaces are used to separate words. For example, the message HEY JUDE in Morse code is ···· · −·−−   ·−−− ··− −·· ·.

NOTE: Extra spaces before or after the code have no meaning and should be ignored.

In addition to letters, digits and some punctuation, there are some special service codes, the most notorious of those is the international distress signal SOS (that was first issued by Titanic), that is coded as ···−−−···. These special codes are treated as single special characters, and usually are transmitted as separate words.

Your task is to implement a function that would take the morse code as input and return a decoded human-readable string.

For example:

MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. .")
//should return "HEY JUDE"
NOTE: For coding purposes you have to use ASCII characters . and -, not Unicode characters.

The Morse code table is preloaded for you as a dictionary, feel free to use it:

Coffeescript/C++/Go/JavaScript/Julia/PHP/Python/Ruby/TypeScript: MORSE_CODE['.--']
C#: MorseCode.Get(".--") (returns string)
F#: MorseCode.get ".--" (returns string)
Elixir: @morse_codes variable (from use MorseCode.Constants). Ignore the unused variable warning for morse_codes because it's no longer used and kept only for old solutions.
Elm: MorseCodes.get : Dict String String
Haskell: morseCodes ! ".--" (Codes are in a Map String String)
Java: MorseCode.get(".--")
Kotlin: MorseCode[".--"] ?: "" or MorseCode.getOrDefault(".--", "")
Racket: morse-code (a hash table)
Rust: MORSE_CODE
Scala: morseCodes(".--")
Swift: MorseCode[".--"] ?? "" or MorseCode[".--", default: ""]
C: provides parallel arrays, i.e. morse[2] == "-.-" for ascii[2] == "C"
NASM: a table of pointers to the morsecodes, and a corresponding list of ascii symbols
All the test strings would contain valid Morse code, so you may skip checking for errors and exceptions. In C#, tests will fail if the solution code throws an exception, please keep that in mind. This is mostly because otherwise the engine would simply ignore the tests, resulting in a "valid" solution.

Good luck!

After you complete this kata, you may try yourself at Decode the Morse code, advanced.
*/

public class Decode_the_morse_code {
    // mejor solucion (DA ERROR PORQUE EL MoreseCode estaba dentro del ejercicio):
    class MorseCodeDecoder2 {
        static String decode(String morseCode) {
            String result = "";
            for (String word : morseCode.trim().split("   ")) {
                for (String letter : word.split("\\s+")) {
                    result += MorseCode.get(letter);
                }
                result += ' ';
            }
            return result.trim();
        }
    }

    // mi solucion MALISIMA!
    class MorseCodeDecoder {
        static String decode(String morseCode) {
            // your brilliant code here, remember that you can access the preloaded Morse
            // code table through MorseCode.get(code)

            // usar un trim de String para quitar espacios de delante y detras

            // primero, separar el codigo morse por espacios (tres espacios es
            // un espacio entre palabras!), asi tenemos todas las letras
            morseCode = morseCode.trim();
            String[] splitedMorse = morseCode.split(" (?!\s\s)");

            String mensajeOculto = "";

            // segundo, ver qué es cada letra, juntarlas y devolver el codigo morse!
            // NOTA: he hecho trampa con el switch y los espacios :/
            for (String letra : splitedMorse) {
                switch (letra) {

                    case "...---...":
                        mensajeOculto += "SOS";
                        break;

                    case "...---... ":
                        mensajeOculto += "SOS ";
                        break;

                    case "-.-.--":
                        mensajeOculto += "!";
                        break;

                    case "-.-.-- ":
                        mensajeOculto += "! ";
                        break;

                    case ".-.-.-":
                        mensajeOculto += ".";
                        break;

                    case ".-":
                        mensajeOculto += "A";
                        break;

                    case "-...":
                        mensajeOculto += "B";
                        break;

                    case "-.-.":
                        mensajeOculto += "C";
                        break;

                    case "-..":
                        mensajeOculto += "D";
                        break;

                    case ".":
                        mensajeOculto += "E";
                        break;

                    case ". ":
                        mensajeOculto += "E ";
                        break;

                    case "..-.":
                        mensajeOculto += "F";
                        break;

                    case "--.":
                        mensajeOculto += "G";
                        break;

                    case "....":
                        mensajeOculto += "H";
                        break;

                    case "..":
                        mensajeOculto += "I";
                        break;

                    case ".---":
                        mensajeOculto += "J";
                        break;

                    case "-.-":
                        mensajeOculto += "K";
                        break;

                    case "-.- ":
                        mensajeOculto += "K ";
                        break;

                    case ".-..":
                        mensajeOculto += "L";
                        break;

                    case "--":
                        mensajeOculto += "M";
                        break;

                    case "-.":
                        mensajeOculto += "N";
                        break;

                    case "-. ":
                        mensajeOculto += "N ";
                        break;

                    case "---":
                        mensajeOculto += "O";
                        break;

                    case "--- ":
                        mensajeOculto += "O ";
                        break;

                    case ".--.":
                        mensajeOculto += "P";
                        break;

                    case "--.-":
                        mensajeOculto += "Q";
                        break;

                    case ".-.":
                        mensajeOculto += "R";
                        break;

                    case ".-. ":
                        mensajeOculto += "R ";
                        break;

                    case "...":
                        mensajeOculto += "S";
                        break;

                    case "... ":
                        mensajeOculto += "S ";
                        break;

                    case "-":
                        mensajeOculto += "T";
                        break;

                    case "..-":
                        mensajeOculto += "U";
                        break;

                    case "...-":
                        mensajeOculto += "V";
                        break;

                    case ".--":
                        mensajeOculto += "W";
                        break;

                    case "-..-":
                        mensajeOculto += "X";
                        break;

                    case "-..- ":
                        mensajeOculto += "X ";
                        break;

                    case "-.-- ":
                        mensajeOculto += "Y ";
                        break;

                    case "--..":
                        mensajeOculto += "Z";
                        break;

                    case ".----":
                        mensajeOculto += "1";
                        break;

                    case "..---":
                        mensajeOculto += "2";
                        break;

                    case "...--":
                        mensajeOculto += "3";
                        break;

                    case "....-":
                        mensajeOculto += "4";
                        break;

                    case ".....":
                        mensajeOculto += "5";
                        break;

                    case "-....":
                        mensajeOculto += "6";
                        break;

                    case "--...":
                        mensajeOculto += "7";
                        break;

                    case "---..":
                        mensajeOculto += "8";
                        break;

                    case "----.":
                        mensajeOculto += "9";
                        break;

                    case "-----":
                        mensajeOculto += "0";
                        break;
                }
            }

            return mensajeOculto;

        }
    }
}
