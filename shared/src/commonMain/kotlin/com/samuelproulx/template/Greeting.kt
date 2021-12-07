package com.samuelproulx.template

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}