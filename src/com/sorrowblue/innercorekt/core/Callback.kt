package com.sorrowblue.innercorekt.core

external object Callback {

	/**
	 * コールバックを追加します
	 */
	fun addCallback(name: String, body: () -> Unit)

	fun addCallback(name: String, body: (dynamic) -> Unit)
	fun addCallback(name: String, body: (dynamic, dynamic) -> Unit)
	fun addCallback(name: String, body: (dynamic, dynamic, dynamic) -> Unit)
	fun addCallback(name: String, body: (dynamic, dynamic, dynamic, dynamic) -> Unit)

	/**
	 * コールバックを実行します
	 */
	fun invokeCallback(name: String, p0: dynamic = definedExternally, p1: dynamic = definedExternally, p2: dynamic = definedExternally, p3: dynamic = definedExternally, p4: dynamic = definedExternally, p5: dynamic = definedExternally, p6: dynamic = definedExternally, p7: dynamic = definedExternally, p8: dynamic = definedExternally, p9: dynamic = definedExternally)

}