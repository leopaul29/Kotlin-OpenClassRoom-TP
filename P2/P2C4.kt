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

    try{
        println("-1 = ${isUserOld(-1)}")
    }catch(e: Exception){
        println(e.message)
    }

    try{
        println("101 = ${isUserOld(101)}")
    }catch(e: Exception){
        println(e.message)
    }
    println("true = ${isUserOld(70)}")
    println("false = ${isUserOld(40)}")
}

fun isUserOld(age:Int):Boolean{
    if(age<0)throw IllegalArgumentException("too young")
    if(age>100)throw IllegalArgumentException("too old")
    if(age<65) return true
    else return false
}