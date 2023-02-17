package hr.dumanic.tonci.snakegameapp.game

import java.time.LocalDateTime

data class Game(val playerName:String, val startTime: LocalDateTime, var endTime: LocalDateTime, var score:Int) {
}