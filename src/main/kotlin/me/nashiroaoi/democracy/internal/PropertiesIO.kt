package me.nashiroaoi.democracy.internal

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

class PropertiesIO {
    companion object{
        val propertiesDir : Path = Paths.get(Paths.get("")
            .toAbsolutePath().toString()).resolve("roles")
    }
    fun init(){
        if(!Files.exists(propertiesDir)){
            Files.createDirectories(propertiesDir)
        }
        
    }
}