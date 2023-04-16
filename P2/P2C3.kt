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

    guessTheType('c')
    guessTheType("c")
    guessTheType(1)
    guessTheType(true)
    guessTheType(listOf("a","b","c"))
    guessTheType(arrayOf("a","b","c"))
}

fun guessTheType(o:Any) = when(o){
    is Int->println("int $o")
    is String->println("string $o")
    is List<*>->println("list $o")
    is Boolean->println("bool $o")
    is Array<*>->println("array $o")
    else->println("other $o")
}