package com.electrofire.myapplication2.repositories

import com.electrofire.myapplication2.data.User

object UserRepository {

    private val users = mutableListOf<User>()

    init {
        users.add(User(1504L, "bbayarri", "abc123", "Brian", "Bayarri", 3500000.50, "2022/12/10"))
        users.add(User(2802L, "AHOZ", "lock_password", "Aylen", "Hoz", 200000.50, "2021/01/11"))
        users.add(User(1510L, "Diegote", "@12345", "Diego", "Gonzalez", 120000.0, "2018/04/15"))
    }

    fun login(username : String, password : String) : User? {
        return users.find { it.nickName == username && it.password == password}
    }

    fun restarPrecioAlSaldo(usuario: User, precio: Double){
        usuario.money = usuario.money.minus(precio) }

}