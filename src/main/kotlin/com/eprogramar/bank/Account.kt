package com.eprogramar.bank

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "accounts")
data class Account (
        @GeneratedValue
        var id: Long? = null,
        var name:String,
        val document: String,
        val phone: String
)


