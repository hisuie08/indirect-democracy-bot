package me.nashiroaoi.democracy

import me.nashiroaoi.democracy.command.MessageCommandFactory
import net.dv8tion.jda.api.JDA
import net.dv8tion.jda.api.JDABuilder
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent
import net.dv8tion.jda.api.hooks.ListenerAdapter
import net.dv8tion.jda.api.requests.GatewayIntent


class BotClient:ListenerAdapter(){
    private lateinit var jda: JDA
    fun main(token: String) {
        jda = JDABuilder.createLight(token,
            GatewayIntent.GUILD_MESSAGES,
            GatewayIntent.GUILD_MESSAGE_REACTIONS,
            GatewayIntent.GUILD_PRESENCES)
            .addEventListeners(this)
            .build()
    }
    
    override fun onGuildMessageReceived(event : GuildMessageReceivedEvent) {
        MessageCommandFactory(event)
    }
}

fun main(){
    val botClient = BotClient()
    botClient.main("TOKEN")
}