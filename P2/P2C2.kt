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

    val t = listOf("a", "b", "c")
    showArrayContent(t)
}

// FUNCTION
fun while20Items() {
    var i = 20
    while(i>0){
        i--
        println(i)
    }
}

fun showArrayContent(t:Collection<String>){
    for(e in t) {
        println(e)
    }
}