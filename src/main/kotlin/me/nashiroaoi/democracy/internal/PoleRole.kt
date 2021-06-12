package me.nashiroaoi.democracy.internal

data class PoleRole(
    val registered:Boolean=false,
    val roleId:String="",
    val roleName:String?=null,
    val poleWeight:Float?=null,
){
    fun write(){
    }
}

