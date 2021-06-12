package me.nashiroaoi.democracy

import com.jagrosh.jdautilities.command.CommandClientBuilder
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.requests.GatewayIntent
import java.nio.file.Paths

lateinit var path: String

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
    val relativePath = Paths.get("")
    path = relativePath.toAbsolutePath().toString()
}