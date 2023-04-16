/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 4 : Maitrisez les exceptions
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, isUserOld(), retournant vrai si l'age fournit en parametre
 * est superieur a 65. Sinon, cette fonction renverra faux.
 * En revanche, vous devrez lever une exception differente si :
 *  * l'age est inferieur a 0 ("too young !")
 *  * l'age est superieur a 100 ("too old !")
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
    println("Is user is old ? ${isUserOld(64)}")
    println("Is user is old ? ${isUserOld(67)}")
    println("Is user is old ? ${isUserOld(-2)}")
    println("Is user is old ? ${isUserOld(102)}")
}

// ---

private fun isUserOld(age: Int) = when {
    age > 100 -> throw Exception("too old !")
    age > 65 -> true
    age < 0 -> throw Exception("too young !")
    else -> false
}