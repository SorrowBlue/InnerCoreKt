package com.sorrowblue.innercorekt.core

import com.sorrowblue.innercorekt.wrapper.*

external object World {

	/**
	 * このIDとメタデータを持つブロックを座標x、y、zに設定します。
	 */
	fun setBlock(x: Int, y: Int, z: Int, id: Int, data: Int)

	/**
	 * id、dataという値を持つオブジェクトを取得し、与えられたIDとメタデータを持つブロックを座標x、y、zに設定します
	 */
	fun setFullBlock(x: Int, y: Int, z: Int, block: Blocks)

	/**
	 * 座標値x、y、zにIDとメタデータを渡す値id、dataを持つオブジェクトを返します
	 */
	fun getBlock(x: Int, y: Int, z: Int): Blocks

	/**
	 * 座標x、y、z上のブロックのidを返します
	 */
	fun getBlockID(x: Int, y: Int, z: Int): Int

	/**
	 * - x、y、z座標のブロックメタデータを返します。
	 */
	fun getBlockData(x: Int, y: Int, z: Int): Int

	/**
	 * ドロップがisstenenならば座標x、y、z上のブロックを破棄し、それをドロップします
	 */
	fun destroyBlock(x: Int,y: Int, z: Int, drop: Boolean)
	
	// タイルエンティティとコンテナの操作
	/**
	 * x、y、z座標のタイルエンティティを返します。存在しない場合はnullを返します。
	 */
	fun getTileEntity(x: Int, y: Int, z: Int): TileEntities?
	
	/**
	 * 座標x、yにおけるブロックは、zは単位タイルエンティティであり、活性化されない、それを活性化し、作成されたオブジェクトタイルエンティティを返す場合
	 */
	fun addTileEntity(x: Int, y: Int, z: Int): TileEntities
	
	/**
	 * 座標X、Y、Zは、タイルのエンティティを有する場合、それを破壊します。
	 */
	fun removeTileEntity(x: Int, y: Int, z: Int): Boolean
	
	/**
	 * もし座標X、Y、Zは、（それが炉や胸、コンテナはメソッドrefreshSlots（）/ applyChangesを有している場合、容器に戻し、胸、オーブン又はタイルエンティティです）
	 */
	fun getContainer(x: Int, y: Int, z: Int): Containers?
	
	//	環境との連携
	/**
	 * メインスレッドのクロック番号を入口から世界に返します
	 */
	fun getThreadTime(): Int
	
	/**
	 * ゲーム時間をティックで返します
	 */
	fun getWorldTime(): Int
	
	/**
	 * ゲーム時間をティックで設定します
	 */
	fun setWorldTime(time: Int)
	
	/**
	 * isDayがtrueの場合は太陽を日の位置に移動させ、そうでない場合は夜間に太陽を移動させます
	 */
	fun setDayMode(isDay: Boolean)
	
	/**
	 * isNightがtrueの場合、太陽を夜間の位置に移動させ、そうでない場合は昼間に移動させます
	 */
	fun setNightMode(isNight: Boolean)
	
	/**
	 * 気象データ、雨雨レベル、雷雨レベルのオブジェクトを返します。
	 */
	fun getWeather(): Weathers
	
	/**
	 * 気象データ、雨 - 降雨レベル、雷 - 雷雨のレベルでオブジェクトの天気を設定します。
	 */
	fun setWeather(weathers: Weathers)

	//	他の方法
	/**
	 * 項目[id、count、data]をx、y、z座標にドロップして返します
	 */
	fun drop(x: Int, y: Int, z: Int, id: Int, count: Int, data: Int): Long
	
	/**
	 *  パワーのx、y、z座標上に爆発を作成します。火災が真であれば、爆発領域のすべてを発火させます
	 */
	fun explode(x: Int, y: Int, z: Int, power: Int, fire: Boolean)
	
	/**
	 * 座標x、z上のバイオームの数値IDを与える
	 */
	fun getBiom(x: Int, z: Int): Int
	
	/**
	 * 座標x、z上のバイオームの名前を与える
	 */
	fun getBiomeName(x: Int, z: Int): String
	
	/**
	 * 座標x、z上の草の色を1つの数値の形で返します
	 */
	fun getGrassColor(x: Int, z: Int): Int
	
	/**
	 * 座標x、z上の草の色を1つの数値の形で設定します
	 */
	fun setGrassColor(x: Int, z: Int, color: Int)
	
	/**
	 * 0〜255の3つの色成分r、g、bを含むオブジェクトの形で座標x、z上に草の色を与える
	 */
	fun getGrassColorRGB(x: Int, z: Int): Colors

	/**
	 * 3つの色成分r、g、bを含むオブジェクトの形式で座標x、z上の草の色を0から255まで設定します
	 */
	fun setGrassColorRGB(x: Int, z: Int, colors: Colors)
	
	/**
	 *  空がx、y、zの点から見える場合はtrueを返し、そうでない場合はfalseを返します
	 */
	fun canSeeSky(x: Int, y: Int, z: Int): Boolean
	
	/**
	 * x、y、z座標の標準音を "0"から "100"までの音量で消します。
	 */
	fun playSound(x: Int, y: Int, z: Int, name: String, volume: Int, pitch: Double)
	
	/**
	 * 0から100までのボリューム音量を持つこのmobエンティティの座標の標準サウンド "name"を失う
	 */
	fun playSoundAtEntity(entity: Long, name: String, volume: Int, pitch: Double)
}