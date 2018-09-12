package com.sorrowblue.innercorekt

external object Item {
	
	/**
	 * 指定された名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDに食用のアイテムを作成します。
	 */
	fun createFoodItem(stringID: String, name: String "オブジェクト名", texture: Texture, params: FoodParams)

パラメータには書式があります。デフォルト値を変更したくない場合は、書かないでください。

{ 
     isTech ： false 、// trueの場合、クリエイティブ
     スタックにアイテムを追加しません： 64 、 // 
     スタックサイズfood ： 1  // health restitution 
}
スローされたオブジェクトの作成
Item.createThrowableItem（ "文字列ID"、 "オブジェクト名"、テクスチャ、パラメータ） - 指定した名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDにスコープ付きオブジェクトを作成します。

パラメータには書式があります。デフォルト値を変更したくない場合は、書かないでください。

{ 
     isTech ： false 、 // trueの場合、クリエイティブ
     スタックにアイテムを追加しません： 64  // 1つのスタックに含まれるアイテムの数。最大64です
。}
スローされたオブジェクトの例。
// TODO
鎧を作る
Item.createArmorItem（ "文字列ID"、 "サブジェクト名"、テクスチャ、パラメータ） - 指定された名前、テクスチャ、およびパラメータを使用して、以前に登録された文字列IDに装甲オブジェクトを作成します。
パラメータには書式があります。デフォルト値を変更したくない場合は、書かないでください。

{ 
     IsTech ： falseに、 // trueの場合は、創造的にオブジェクトを追加しない
     鎧： 1 、 規模に//追加装甲保護の量を
     種類： < バインディング 値を> 、 //オブジェクトタイプは「ヘルメット」/「胸板」/ 「レギンス」/ "ブーツ" 
     テクスチャ： < 必須 値> 、 //このアーマーのモデルのテクスチャー
     耐久性： 1  //アーマーの強さ
}
	external data class DefaultParams(var isTech: Boolean, var stack: Int)
	external data class FoodParams(var isTech: Boolean, var stack: Int, var health: Int)
	external data class DefaultParams(var isTech: Boolean, var stack: Int)
	external data class Texture(var name: String, var meta: Int)
}
