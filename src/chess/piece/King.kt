package chess.piece

import boardgame.Board
import chess.ChessPiece
import chess.Color

class King(board: Board, color: Color) : ChessPiece(board, color) {

    override fun toString(): String {
        return "R"
    }
}