package com.sorrowblue.innercorekt.core

external object Game {
    /**
     * コンテキストでゲームの動作をキャンセルします。
     */
    fun prevent()

    /**
     * メッセージmsgをチャットに書き込みます。
     */
    fun message(msg: String)

    /**
     * メッセージの上にメッセージmsgを書き込みます。
     */
    fun tipMessage(msg: String)

    /**
     * ダイアログにタイトルタイトルのメッセージmsgを書き込みます。
     */
    fun dialogMessage(message: String, title: String)

    /**
     * 難易度を設定します。
     */
    fun setDifficulty(difficulty: Int)

    /**
     * 複雑さを返します。
     */
    fun getDifficulty(): Int

    /**
     * ゲームのバージョンを返します。
     */
    fun getMinecraftVersion(): String

    /**
     * エンジンのバージョンを返します。
     */
    fun getEngineVersion(): String

    /**
     * レベルを開始します。
     */
    fun selectLevel(name: String)

    /**
     * プレーヤーのカメラをエンティティエンティティに切り替えます。
     */
    fun setCamera(entity: Int)

    /**
     * ゲームの速度を1秒当たりのティックの速度に設定します。
     */
    fun setTickingSpeed(speed: Int)
}