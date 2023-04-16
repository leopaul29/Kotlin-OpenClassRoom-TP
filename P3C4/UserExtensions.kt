inline fun List<User>.maxUser(selector: (User) -> Int): User {
    var maxUser = this.first()
    var maxValue = selector(maxUser)
    var possibleMaxValue: Int
    for (user in this) {
        possibleMaxValue = selector(user)
        if (possibleMaxValue > maxValue) {
            maxValue = possibleMaxValue
            maxUser = user
        }
    }
    return maxUser
}