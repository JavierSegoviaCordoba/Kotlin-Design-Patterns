import factory.Normal
import factory.Premium
import factory.User
import factory.UserType

fun main() {
    val normal = UserFactory.getUser(UserType.Normal, "James", "Smith")
    with(normal) {
        println(getFullName())
        println(status())
        println("Show ads: ${showAds()}")
    }

    val premium = UserFactory.getUser(UserType.Premium, "Peter", "Brown")
    with(premium) {
        println(getFullName())
        println(status())
        println("Show ads: ${showAds()}")
    }
}

object UserFactory {
    fun getUser(userType: UserType, name: String, surname: String): User {
        return when (userType) {
            UserType.Normal -> Normal(name = name, surname = surname)
            UserType.Premium -> Premium(name = name, surname = surname)
        }
    }
}