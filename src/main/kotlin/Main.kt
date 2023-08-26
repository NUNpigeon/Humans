fun main() {
    val likes = 44;
    var humans: String = "людям"
    if (likes % 10 == 1 && likes % 100 != 11) {
        humans = "человеку"
    }
    println("Понравилось " + likes + " " + humans)
}
