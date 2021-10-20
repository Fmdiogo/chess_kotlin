package boardgame

class Position(
    val row: Int,
    val column: Int) {

    constructor() : this(
        -1,
        -1
    )

    override fun toString(): String {
        return "$row, $column "
    }

}