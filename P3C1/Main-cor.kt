/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 3 - Chapitre 1 : Ameliorez vos fonctions
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction "top-level" permettant de verifier si une variable de type
 * String? est differente de 'null' : si elle est egale a 'null', vous declencherez
 * une exception, sinon vous afficherez "This variable is not null !" dans
 * la console.
 * 
 * - Creer 2 proprietes "top-level" stockant :
 *   * Le token Google : "ABCDE_IS_MY_TOKEN"
 *   * l'url d'OpenClassrooms : "https://www.openclassrooms.com"
 * 
 * 
 * - Afficher le resultat de ces fonctions dans la console.
 * 
 * 
 * 
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
	println("Hello Openclassrooms students !")
    checkIfNotNull("This is a test")
    println(TOKEN_GOOGLE)
    println(URL_OPENCLASSROOMS)
}