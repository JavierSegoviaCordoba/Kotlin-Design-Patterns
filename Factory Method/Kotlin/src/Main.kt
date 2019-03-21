import factory.*

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