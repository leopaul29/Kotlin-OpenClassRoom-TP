/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 3 - Chapitre 2 : Decouvrez les extensions
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une extension, toPlural(), permettant de renvoyer le pluriel d'un mot (String). Vous ne
 * gererez PAS les cas speciaux ("al" en "aux" par exemple).
 * 
 * - Afficher le resultat de cette fonction dans la console.
 * 
 * 
 * 
 * A vous de jouer, et bon courage !
 *
 */
import stringExt.toPlural

fun main(args: Array<String>) {
	println("Hello Openclassrooms students !")
    
    var word:String = "table"
    println("${word.toPlural()}")
}