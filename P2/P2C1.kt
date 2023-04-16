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
    println("${mult(8,10)}")
    val c = Color.RED
    writeName(c)
}

enum class Color(val label:String){
    BLUE(label="BLUE"),
    RED(label="RED"),
    YELLOW(label="YELLOW")
}

fun writeName(c:Color) = println(c.label)

fun mult(a:Int, b:Int) =
        if(a<b){
            a*10
        }else {
            b*10
        }
