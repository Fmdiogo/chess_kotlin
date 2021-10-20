package chess

import boardgame.Board
import boardgame.Position
import chess.piece.King
import chess.piece.Rook

class ChessMatch {
    private val board: Board
    val pieces: Array<Array<ChessPiece?>>
        get() {
            val mat = Array(board.rows) {
                arrayOfNulls<ChessPiece>(
                    board.columns
                )
            }
            for (i in 0 until board.rows) {
                for (j in 0 until board.columns) {
                    mat[i][j] = board.piece(i, j) as ChessPiece?
                }
            }
            return mat
        }

    init {
        board = Board(8, 8)
        initialSetup()
    }


    fun initialSetup() {
        board.placePiece(Rook(board, Color.WHITE), Position(2, 1))
        board.placePiece(King(board, Color.BLACK), Position(0, 4))
        board.placePiece(King(board, Color.WHITE), Position(7, 4))

    }

}

