package factory

object UserFactory {
    fun getUser(userType: UserType, name: String, surname: String): User {
        return when (userType) {
            UserType.Normal -> Normal(name = name, surname = surname)
            UserType.Premium -> Premium(name = name, surname = surname)
        }
    }
}