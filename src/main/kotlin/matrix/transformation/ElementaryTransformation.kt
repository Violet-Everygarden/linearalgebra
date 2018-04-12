package matrix.transformation

import matrix.Matrix
import matrix.transformation.util.MatrixDataUtil

interface ElementaryTransformation {

	val dataUtil: MatrixDataUtil

	fun rowMultiply(row: Int, k: Double)

	fun rowSwap(row1: Int, row2: Int)

	fun rowAddTo(from: Int, to: Int, k: Double)

	fun columnMultiply(column: Int, k: Double)

	fun columnSwap(column1: Int, column2: Int)

	fun columnAddTo(from: Int, to: Int, k: Double)

	fun getResult(): Matrix

}