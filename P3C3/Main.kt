/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 * 
 * Partie 3 - Chapitre 3 : Enrichissez vos classes
 *  
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une classe "User" possedant les proprietes "email", "password" et "urlImage" :
 * 	 * La classe User devra etre une classe "data"
 *   * La classe pourra etre instanciee, soit via son constructeur, soit via une methode
 *     de factory appelee "newInstance()"
 * 	 * Creer un objet pour cette classe et affichez son contenu 
 * 	   dans la console de log.
 * 
 * - Creer une classe "Button" possedant les proprietes "title" et "bgColor". 
 * - Creer une classe "CircleButton" heritant de la classe "Button" et possedant
 * en plus la propriete "radius".
 * - Ces classes devront pouvoir etre construite avec chacune, toute ou aucune de
 * leurs proprietes
 * - Vous devrez egalement creer un objet de chacune de ces deux classes.
 * 
 * 
 * 
 * 
 * A vous de jouer, et bon courage !
 *
 */
open class Button(var title:String="init", var bgColor:String="#FFF") {
    
}
class CircleButton(title:String="cb", bgColor:String="#FFF", var radius:Int=10):Button(title,bgColor){
    
}

data class User(var email:String, var password:String,var urlImage:String?){    
    companion object {
        fun newInstance(email:String, password:String) = User(email, password, null)
    }
}

fun main(args: Array<String>) {
	println("Hello Openclassrooms students !")
    var u1 = User("user1", "password1", "image1")
    println("u1.email = ${u1.email}")
    u1.email = "emailChanged"
    println(u1)
    var u2 = User.Companion.newInstance("user2", "password2")
    println(u2)
    
    var b = Button()
    b = Button("title")
    b = Button(bgColor="color")
    b = Button("title2","color2")
    
    var cb = CircleButton()
    cb = CircleButton("title")
    cb = CircleButton(bgColor="color")
    cb = CircleButton(radius=20)
    cb = CircleButton("title2","color2",30)
}