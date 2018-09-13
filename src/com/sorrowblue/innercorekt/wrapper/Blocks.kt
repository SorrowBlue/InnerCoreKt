package com.sorrowblue.innercorekt.wrapper

//data class Blocks(var id: Int, var data: Int)

interface Blocks {
	val id: Int
	val data: Int
	
	val relative : Relative
	interface Relative {
		val x: Int
		val y: Int
	}
}

