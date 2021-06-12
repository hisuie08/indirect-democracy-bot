package me.nashiroaoi.democracy.command

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent

class MessageCommandFactory(event : GuildMessageReceivedEvent){
    init {
        if(event.message.mentionedUsers.contains(event.jda.selfUser)){
            val message = event.message.contentDisplay
                .replace(Regex("@${event.jda.selfUser.name}(\\s*)"),"")
            
            when{
                message.startsWith("register")-> register(event,message)
            }
            
        }
        
    }
    
    private fun register(event : GuildMessageReceivedEvent,message:String){
    }
}