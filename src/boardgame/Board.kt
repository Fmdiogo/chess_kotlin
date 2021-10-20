package boardgame

open class Board(var rows: Int, var columns: Int) {
    private val pieces: Array<Array<Piece?>>


    init {
        pieces = Array(rows) { arrayOfNulls(columns) }
    }

    fun piece (row : Int, column: Int ): Piece? {
        return pieces[row][column]
    }
    @Override
    fun piece(position: Position): Piece? {
        return pieces[position.row][position.column]
    }

    open fun placePiece( piece: Piece, position: Position){
        pieces[position.row][position.column] = piece
        piece.position = position
    }
}