/*
 * - Creer une fonction "top-level" permettant de verifier si une variable de type
 * String? est differente de 'null' : si elle est egale a 'null', vous declencherez
 * une exception, sinon vous afficherez "This variable is not null !" dans
 * la console. 
 */

package utils

fun checkIsNull(prop:String?) = if(prop!=null) println("This variable is not null !") else throw Exception("This variable is null !")
