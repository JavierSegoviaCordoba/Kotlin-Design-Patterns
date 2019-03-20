package factory

interface User {
    val name: String
    val surname: String
    fun getFullName() = "$name $surname"
    fun status(): String
    fun showAds(): Boolean
}