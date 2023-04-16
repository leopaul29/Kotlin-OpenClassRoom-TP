/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 3 : Decouvrez le Smart Cast
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, guessTheType, permettant de deviner et d'afficher
 * dans la console le type d'un objet passe en parametre.
 * Les types supportes seront Int, String, List, Boolean et Array
 *
 * - Afficher le resultat de cette fonction dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")
    guessTheType(10)
    guessTheType("Troll")
    guessTheType(arrayOf(1, 2))
    guessTheType(listOf(1, 2))
    guessTheType(false)
    guessTheType(9.0) // It's a Double...
}

private fun guessTheType(any: Any) = when (any){
    is Int -> println("It's an Integer !")
    is String -> println("It's a String !")
    is Array<*> -> println("It's an Array !")
    is List<*> -> println("It's a List !")
    is Boolean -> println("It's a Boolean !")
    else -> println("Error ! Type not recognized...")
}