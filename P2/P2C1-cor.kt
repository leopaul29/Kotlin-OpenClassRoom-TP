/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 1 : Gerez des choix et des conditions
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction utilisant la structure de controle "if" uniquement.
 * Celle-ci devra retourner le plus petit des deux nombres fournis en parametre.
 * De plus, le résultat devra etre multiplie par 10.
 *
 * - Creer une enumeration representant les trois couleurs primaires. Puis,
 * creer une fonction, retournant pour chaque couleur son nom au format String
 * en anglais (par exemple "RED")
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
    println("Min of those two numbers : ${minOf(10, 11)}")
    println("Red color to string: ${colorToString(Color.RED)}")
}

// --- FUNCTIONS ---

private fun minOf(a: Int, b: Int) = (if (a < b) a else b) * 10
private fun colorToString(color: Color) = when (color) {
   	Color.RED -> "RED"
    Color.BLUE -> "BLUE"
    Color.GREEN -> "GREEN"
}

// --- ENUM ---
private enum class Color { RED, BLUE, GREEN }