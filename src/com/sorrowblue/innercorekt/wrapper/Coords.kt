package com.sorrowblue.innercorekt.wrapper

/**
 * 座標管理クラス
 */
data class Coords(var x: Int, var y: Int, var z: Int, var side: Int = 0,
				  var relative: Relative = Relative(x, y + 1, z),
				  var vec: Vec = Vec(x.toDouble(), y.toDouble(), z.toDouble())) {
	
	data class Relative(var x: Int, var y: Int, var z: Int)
	
	data class Vec(var x: Double, var y: Double, var z: Double)
	
}