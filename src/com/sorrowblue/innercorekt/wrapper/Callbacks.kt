package com.sorrowblue.innercorekt.wrapper

import com.sorrowblue.innercorekt.core.Callback

object Callbacks {
	
	/**
	 * すべてのセーブを読む
	 */
	fun addReadSaves(body: () -> Unit) = Callback.addCallback("ReadSaves", body)
	
	/**
	 * すべての保存を記録する
	 */
	fun addWriteSaves(body: () -> Unit) = Callback.addCallback("WriteSaves", body)
	
	/**
	 * 座標による地獄の塊の生成
	 */
	fun addGenerateNetherChunk(body: (chunkX: Int, chunkZ: Int) -> Unit) = Callback.addCallback("GenerateNetherChunk" , body)
	
	/**
	 * Ender世界におけるチャンクの座標による生成
	 */
	fun addGenerateEndChunk(body: (chunkX: Int, chunkZ: Int) -> Unit) = Callback.addCallback("GenerateEndChunk" , body)
	
	/**
	 * 普通の世界のチャンクの座標による生成
	 */
	fun addGenerateChunk(body: (chunkX: Int, chunkZ: Int) -> Unit) = Callback.addCallback("GenerateChunk" , body)
	
	/**
	 * 地上チャンクの生成
	 */
	fun addGenerateChunkUndeground(body: (chunkX: Int, chunkZ: Int) -> Unit) = Callback.addCallback("GenerateChunkUndeground", body)
	
	/**
	 * 	bl（？）を再起動する前に
	 */
	fun addPreRestart(body: () -> Unit) = Callback.addCallback("PreRestart" , body)
	
	/**
	 * チーク
	 */
	fun addTick(body: () -> Unit) = Callback.addCallback("tick", body)
	
	/**
	 * 	世界のブートを開始する
	 */
	fun addLevelSelected(body: (nameWorld: String, dirWorld: String) -> Unit) = Callback.addCallback("LevelSelected", body)
	
	/**
	 * 世界のブートの終わり
	 */
	fun addLevelLoaded(body: () -> Unit) = Callback.addCallback("LevelLoaded", body)
	
	/**
	 * 世界を出る
	 */
	fun addLevelLeft(body: () -> Unit) = Callback.addCallback("LevelLeft", body)
	
	/**
	 * ブロックを破壊する。
	 */
	fun addDestroyBlock(body: (coords: Coords, blocks: Blocks, player: Long) -> Unit) = Callback.addCallback("DestroyBlock", body)
	
	/**
	 * ブロックを破壊し始める
	 */
	fun addDestroyBlockStart(body: (coords: Coords, blocks: Blocks, player: Long) -> Unit) = Callback.addCallback("DestroyBlockStart", body)
	
	/**
	 * ブロックの破壊の継続。ティックで3回呼び出される（？）
	 */
	fun addDestroyBlockContinue(body: (coords: Coords, blocks: Blocks, progress: Int, player: Long) -> Unit) = Callback.addCallback("DestroyBlockContinue", body)
	
	
	/**
	 * 爆発
	 */
	fun addExplosion(body: (coords: Coords, params: Any) -> Unit): Unit = Callback.addCallback("Explosion", body)
	
	/**
	 * 登録消費者のレッドストーンの信号レベルの変化
	 */
	fun addRedstoneSignal(body: (coords: Coords, params: Any, blocks: Blocks) -> Unit) = Callback.addCallback("RedstoneSignal", body)
	
	/**
	 * コマンド
	 */
	fun addNativeCommand(body: (cmd: String) -> Unit) = Callback.addCallback("NativeCommand", body)
	
	/**
	 * チャットメッセージ
	 */
	fun addClientChat(body: (msg: String) -> Unit) = Callback.addCallback("ClientChat", body)
	
	/**
	 * サポートされていないマルチプレイヤー
	 */
	fun addServerChat(body: (msg: String) -> Unit) = Callback.addCallback("ServerChat", body)
	
	/**
	 * アイテムの使用
	 */
	fun addItemUse(body: (coords: Coords, items: Items, blocks: Blocks) -> Unit) = Callback.addCallback("ItemUse", body)
	
	/**
	 * プレイヤーの攻撃
	 */
	fun addPlayerAttack(body: (player: Long, victim: Long) -> Unit) = Callback.addCallback("PlayerAttack", body)
	
	/**
	 * クリーチャーを追加する
	 */
	fun addEntityAdded(body: (entity: Long) -> Unit) = Callback.addCallback("EntityAdded", body)
	
	/**
	 * クリーチャーを削除する
	 */
	fun addEntityRemoved(body: (entity: Long) -> Unit) = Callback.addCallback("EntityRemoved", body)
	
	/**
	 * クリーチャーの死
	 */
	fun addEntityDeath(body: (entity: Long) -> Unit) = Callback.addCallback("EntityDeath", body)
	
	/**
	 * 暴徒による被害
	 */
	fun addEntityHurt(body: (attack: Long, receive: Long, damage: Int) -> Unit) = Callback.addCallback("EntityHurt", body)
	
	/**
	 * スローされるオブジェクトは（？）にあります。
	 */
	fun addProjectileHit(body: (tile: Long, items: Items, target: Long) -> Unit) = Callback.addCallback("ProjectileHit", body)
	
	
	/**
	 * ブロックにスローされるオブジェクト
	 */
	fun addProjectileHitBlock(body: (shot: Long, coords: Coords, blocks: Blocks) -> Unit) = Callback.addCallback("ProjectileHitBlock", body)
	
	/**
	 * クリーチャーに投げ込まれているオブジェクト
	 */
	fun addProjectileHitEntity(body: (shot: Long, entity: Long) -> Unit) = Callback.addCallback("ProjectileHitEntity", body)
	
	/**
	 * 食べ物を食べる
	 */
	fun addFoodEaten(body: (food: Int, ratio: Double) -> Unit) = Callback.addCallback("FoodEaten", body)
	
	/**
	 * ゲームのネイティブ画面を変更する
	 */
	fun addNativeGuiChanged(body: (name: String) -> Unit) = Callback.addCallback("NativeGuiChanged", body)
	
	/**
	 * プレーヤーの経験を増やす
	 */
	fun addExpAdd(body: (levelAmount: Int, player: Long) -> Unit) = Callback.addCallback("ExpAdd", body)
	
	/**
	 * プレーヤーレベルを上げる
	 */
	fun addExpLevelAdd(body: (levelAmount: Int, player: Long) -> Unit) = Callback.addCallback("ExpLevelAdd", body)
	
	/**
	 * フォルダmodを読み込んだ直後
	 */
	fun addModDirLoaded(body: () -> Unit) = Callback.addCallback("ModDirLoaded", body)
	
	/**
	 * ブロックを追加する前に
	 */
	fun addPreBlocksDefined(body: () -> Unit) = Callback.addCallback("PreBlocksDefined", body)
	
	/**
	 * ブロックの追加
	 */
	fun addBlocksDefined(body: () -> Unit) = Callback.addCallback("BlocksDefined", body)
	
	/**
	 * 最終的なダウンロードの前に
	 */
	fun addPreLoaded(body: () -> Unit) = Callback.addCallback("PreLoaded", body)
	
	/**
	 * mods APIを読み込むには
	 */
	fun addAPILoaded(body: () -> Unit) = Callback.addCallback("APILoaded", body)
	
	/**
	 * すべてのファッションが読み込まれます（？）
	 */
	fun addModsLoaded(body: () -> Unit) = Callback.addCallback("ModsLoaded", body)
	
	/**
	 * すべての最終ダウンロード
	 */
	fun addPostLoaded(body: () -> Unit) = Callback.addCallback("PostLoaded", body)
	
}
