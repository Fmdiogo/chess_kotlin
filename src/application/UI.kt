package application

import boardgame.Piece
import chess.ChessPiece

class UI {

    fun printBoard(pieces: Array<Array<ChessPiece?>>){
        for (i in pieces.indices){
            print(8-i)
            print(" ")
            for (j in pieces.indices){
                pieces[i][j].let { printPiece(it) }
            }
            println()
        }
        println("  a b c d e f g h")
    }

    private fun printPiece(piece: ChessPiece?){
        if (piece == null){
            print("-")
        }else{
            print(piece)
        }
        print(" ")
    }

}
