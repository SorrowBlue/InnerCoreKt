package com.sorrowblue.innercorekt

import com.sorrowblue.innercorekt.wrapper.Coords
import org.w3c.dom.CanvasTextAlign

external object Callback {
	
	fun addCallback(name: String, body: () -> Unit)
	fun addCallback(name: String, body: (Nothing) -> Unit)
	fun addCallback(name: String, body: (Nothing, Nothing) -> Unit)
	fun addCallback(name: String, body: (Nothing, Nothing, Nothing) -> Unit)
	fun addCallback(name: String, body: (Nothing, Nothing, Nothing, Nothing) -> Unit)

}