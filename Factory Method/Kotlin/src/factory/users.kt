package factory

enum class UserType { Normal, Premium }

class Normal(override val name: String, override val surname: String) : User {
    override fun status() = "Normal"
    override fun showAds() = true
}

class Premium(override val name: String, override val surname: String) : User {
    override fun status() = "Premium"
    override fun showAds() = false
}