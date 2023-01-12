import cmdExecutor.Companion.runCommand
import java.io.File

fun _init_(){
    var tempdir = File("/tmp/").toPath()
    println(tempdir)
}

fun argsCheck(args: Array<String>): Any {
    if(args[0].startsWith("-")) {
        when(args[0]) {
            "-R" -> funcs.Companion.remove(args[1])
            "-I" -> funcs.Companion.install(args[1])
            "-U" -> funcs.Companion.update(args[1])
            "-S" -> funcs.Companion.sync()
            else -> {
                "Unknown option!"
            }
        }
    }
    return buildString { append("0") }
}

class funcs() {
    companion object {

        fun remove(name: String){
            //pacman -Ql {oackage} - list of files
            println("Removing package $name")
            println("ls -la /")
        }

        fun install(name: String){
            fun fromAUR(link: String) { println("installing package $name from AUR via $link") }
            if(name.startsWith("https://")) {
                when(name.removePrefix("https://")) {
                }
            }


            //pacman -Qi {package} - list of deps
            println("Installing package $name")

        }

        fun update(name: String){
            println("Updating package $name")
        }

        fun sync(){
            println("Syncing with database")
        }

    }
}

fun main(args: Array<String>) {

    println(argsCheck(args))
}
//#!/bin/bash
//echo '#!/usr/bin/java -jar' > kopack
//cat /home/konstantin/IdeaProjects/KoPack2/KoPack/build/libs/KoPack-1.0-SNAPSHOT.jar >> kopack
//chmod +x kopack