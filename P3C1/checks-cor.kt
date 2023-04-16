fun checkIfNotNull(str: String?) {
    if (str == null){
        throw Exception("This variable is null !")
    } else {
        println("This variable is not null !")
    }
}