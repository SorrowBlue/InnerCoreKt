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
	
	interface Relative {
		val x: Double
		val y: Double
		val z: Double
	}
}
