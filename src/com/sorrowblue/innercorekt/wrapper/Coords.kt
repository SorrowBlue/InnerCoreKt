package com.sorrowblue.innercorekt.wrapper

/**
 * 座標管理
 */
interface Coords {
	
	val x: Int
	val y: Int
	val z: Int
	
	val side: Int get() = 0
	
	val relative: Relative get () = object : Relative {
		override val x = 0
		override val y = 0
		override val z = 0
	}
	
	val vec: Vec get() = object : Vec {
		override val x = 0.0
		override val y = 0.0
		override val z = 0.0
	}
	
	interface Relative {
		val x: Int
		val y: Int
		val z: Int
	}
	
	interface Vec {
		val x: Double
		val y: Double
		val z: Double
	}
}

fun coordsOF(
	x: Int, y: Int, z: Int, side: Int = 0,
	relative: Relative = relativeOf(x, y, z),
	vec: Vec = vecOf(x.toDouble(), y.toDouble(), z.toDouble())
) = object : Coords {
	override val x = x
	override val y = y
	override val z = z
	override val side = side
}

fun relativeOf(x: Int, y: Int, z: Int) = object : Coords.Relative {
	override val x = x
	override val y = y
	override val z = z
}

fun vecOf(x: Double, y: Double, z: Double) = object : Coords.Vec {
	override val x: x
	override val y: y
	override val z: z
}
