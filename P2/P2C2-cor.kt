/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 2 : Iterez grace aux boucles
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, "while20Items", contenant une boucle "while" affichant
 * en message, l'index en cours d'iteration.
 * Cette boucle s'arretera au bout de 20 iterations.
 *
 * - Creer une fonction, "showArrayContent", contenant une boucle "for" affichant
 * en message, l'element du tableau de String en cours d'itération.
 * Ce tableau devra etre passe en parametre de cette fonction.
 *
 * - Afficher le resultat de ces deux fonctions dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
    println("Hello Openclassrooms students !")
    while20Items()
    println("-------------------------------")
    showArrayContent(arrayOf("K", "O", "T", "L", "I", "N"))
}

// ---

private fun while20Items(){
    var i = 0
    while (i < 20){
        println("$i")
        i++
    }
}

private fun showArrayContent(strings: Array<String>){
    for (string in strings) print(string)
}