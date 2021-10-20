package application

import boardgame.Board
import chess.ChessMatch

object Program {
    @JvmStatic
    fun main(args: Array<String>) {
        val board = Board(8, 8)
        val chessMatch = ChessMatch()
        val ui = UI()
        ui.printBoard(chessMatch.pieces)
    }
}