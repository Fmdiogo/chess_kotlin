package chess.piece

import boardgame.Board
import boardgame.Position
import chess.ChessPiece
import chess.Color

class Rook(board: Board, color: Color) : ChessPiece(board, color) {

    override fun toString(): String {
        return "T"
    }
}