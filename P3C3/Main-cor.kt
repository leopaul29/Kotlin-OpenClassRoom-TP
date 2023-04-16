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

fun main(args: Array<String>) {
	println("Hello Openclassrooms students !")
   
    val user = User("toto@gmail.com", "azerty", "https://url.com")
    println(user)
    
    val button = Button()
    val circleButton = CircleButton()
}

// ---

data class User (var email: String,
                var password: String,
                var urlImage: String){
    companion object {
        fun newInstance(email: String, password: String, urlImage: String) = User(email, password, urlImage)
    }
}

// ---

open class Button(var title: String = "button",
                  var bgColor: String = "#FFF")

class CircleButton(_title: String = "circleButton",
                   _bgColor: String = "#FFF",
                   var radius: Float = 1.0f): Button(_title, _bgColor)
