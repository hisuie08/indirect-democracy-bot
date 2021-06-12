package me.nashiroaoi.democracy

import com.jagrosh.jdautilities.command.CommandClientBuilder
import me.nashiroaoi.democracy.internal.PropertiesIO
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent


class BotClient{
    private lateinit var jda: JDA
    fun main(token: String) {
        val commandClient = CommandClientBuilder()
            .setPrefix("")
            .setOwnerId("")
            .build()
        
        jda = JDABuilder.createLight(token,
            GatewayIntent.GUILD_MESSAGES)
            .addEventListeners(commandClient)
            .build()
    }
    
}

fun main(){
    println(PropertiesIO.propertiesDir)
    PropertiesIO().init()
}