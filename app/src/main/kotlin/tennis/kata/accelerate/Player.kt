/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tennis.kata.accelerate

class Player {
    var points: String = "40"

    fun increaseScore(rivalPlayer: Player) {
        if (points == "Love") {
            points = "15"
        }
        else if(points == "15") {
            points = "30"
        }
        else if(points == "30"){
            points = "40"
        }
        else if(points == "40"){
            if (rivalPlayer.points == "40"){
                points = "advantage"
            } else if(rivalPlayer.points != "40" && rivalPlayer.points != "advantage"){
                points = "WIN"
            } else if(rivalPlayer.points == "advantage"){
                points = "40"
                rivalPlayer.points = "40"
            }
        }
    }

}

fun main() {
    var player1 = Player()
    var player2 = Player()
    player2.points = "advantage"
    println("player 1 initial points: " + player1.points)
    println("player 2 initial points: " + player2.points)
    player1.increaseScore(player2)
    println("player 1 points after scoring: " + player1.points)
    println("player 2 points after scoring: " + player2.points)
}
