package me.nashiroaoi.democracy.internal

import java.io.File
import java.io.FileWriter
import java.net.URI
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.util.*

class PropertiesIO {
    companion object{
        private val propertiesDir : Path = Paths.get(Paths.get("")
            .toAbsolutePath().toString()).resolve("roles")
        
        fun init(){
            if(!Files.exists(propertiesDir)){
                Files.createDirectories(propertiesDir)
            }
        }
        
        fun write(roleID : String,data:Array<Pair<String,String>>){
            val roleFile = propertiesDir.resolve("$roleID.properties").also {
                if(Files.exists(it)){Files.createFile(it)}
            }
            val fileWriter = FileWriter(File(URI(roleFile.toString())),Charsets.UTF_8)
            val properties = Properties()
            data.forEach { d->
                properties[d.first] = d.second
            }
            properties.store(fileWriter,null)
        }
        
        fun load(roleID : String){
            val roleFile = propertiesDir.resolve("$roleID.properties").also {
                if(Files.exists(it)){Files.createFile(it)}
            }
        }
        
        fun exists(roleID:String):Boolean = Files.exists(
            propertiesDir.resolve("$roleID.properties"))
        
    }
}