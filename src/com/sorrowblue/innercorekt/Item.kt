package com.sorrowblue.innercorekt

external object Item {
	
	/**
	 * 指定された名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDにアイテムを作成します。
	 */
	fun createFoodItem(nameID: String, name: String, texture: Items.Texture, params: Items.Params = definedExternally)
	
	/**
	 * 指定された名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDに食用のアイテムを作成します。
	 */
	fun createFoodItem(nameID: String, name: String, texture: Items.Texture, params: Items.Params = definedExternally)
	
	/**
	 * 指定した名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDに投擲アイテムを作成します。
	 */
	fun createThrowableItem(nameID: String, name: String, texture: Items.Texture, params: Items.Params = definedExternally) 
	
	/**
	 * 指定された名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDに防具アイテムを作成します。
	 */
	fun createArmorItem(nameID: String, name: String, texture: Items.Texture, params: Items.Armor)
	
	/**
	 * アイテムのプロパティを設定する。
	 */
	fun describeItem(nameID: String, desc: Items.Desc)
	
	/**
	 * カテゴリパラメータのアナログ
	 */
	fun setCategory(id: Int, category: Int)
	
	/**
	 * アナログパラメータエンチャント
	 */
	fun setEnchantType(id: Int, type: Int, value: Int)
	
	/**
	 * toolRenderパラメータのアナログ
	 */
	fun setToolRender(id: Int, enabled: Boolean)
	
	/**
	 * maxDamageパラメータのアナログ
	 */
	fun setMaxDamage(id: Int, maxdamage: Int)
	
	/**
	 * stackByDataパラメータのアナログ
	 */
	fun setStackedByData(id: Int, enabled: Boolean)
	
	/**
	 * プロパティパラメータの類似
	 */
	fun setProperties(id: Int, Any?)
	
	/**
	 * useAnimationパラメータのアナログ
	 */
	fun setUseAnimation(id: Int, animType: Int)
	
	/**
	 * エンコードtrueの場合、次に、IDとデータとオブジェクトまたはブロックの名前を与えるitem.imya.nameまたはblock.imya.name形式に戻します
	 */
	fun getName(id: Int, data: Int, encode: Boolean = definedExternally): String
	
	/**
	 * アイテムに最大のダメージを与えます。
	 */
	fun getMaxDamage(id: Int): Int
	
	/**
	 * スタックのサイズを与える
	 */
	fun getMaxStack(id: Int): Int
	
	/**
	 * 使用アニメーションを返します。
	 */
	fun getUseAnimation(id: Int): Int
	
	/**
	 * このアイテムが存在するかどうかを返します。
	 */
	fun isValid(id: Int, data: Int): Boolean
Item.isNativeItem（id） - このオブジェクトがMCPEオブジェクトであるかどうかを返します。modsではありません。

}
