package com.sorrowblue.innercorekt.wrapper

data class Items(var id: Int, var data: int, var count: Int, var extra: ItemExtraData? = null) {
	
	companion object {
		const val HELMET = "helmet"
		const val CHESTPLATE = "chestplate"
		const val LEGGINGS = "leggings"
		const val BOOTS = "boots"
	}
	
	interface Params {
		val isTech: Boolean get() = fals // trueの場合、クリエイティブに追加する
		val stack: Int get() = 64 // スタックサイズ
		val food: Int get() =  1 // スタミナの回復量
	}
	
	interface Armor {
		val isTech: Boolean get() = false // trueの場合、クリエイティブに追加する
		val armor: Int get() = 1 // 軽減値
    val type: String // Items.HELMET/Items.CHESTPLATE/Items.LEGGINGS/Items.BOOTS
		val texture: String // モデルのテクスチャ
    val durability: Int get() = 1 // 耐久値
	}
	
	interface Texture {
		val name: String // テクスチャ名
		val meta: Int get() = 0 // メタ番号
	}
	
	interface Desc {
		val category: Int get() = 0 // категория в креативе
		val enchant: Enchant get() = object : Enchant {} // тип зачарования
		val toolRender: Boolean get() = false // рендер в руке, как инструмент
		val maxDamage: Int get() =  0 // максимальный дамаг предмета (шкала прочности)
		val stackByData: Boolean get() = false // стакается по data
		val properties: Any? get() = null // родной объект параметров MCPE
		val useAnimation: Int get() = 0 // анимация использозвания
	}
	
	interface Enchant {
		val value: Int get() = 0
		val type: Int get() =  0
	}
	
}
