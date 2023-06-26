fun main() {
    SharingWidget.display()
    SharingWidget.incrementtwit()
    SharingWidget.incrementfb()
    SharingWidget.display()
}
                                  //singelton
object SharingWidget {
    private var twitlikes = 0
    private var fblikes = 0

    fun incrementtwit() = twitlikes++
    fun incrementfb() = fblikes++
    fun display() = println("Facebook - $fblikes -- Twitter $twitlikes")
}
