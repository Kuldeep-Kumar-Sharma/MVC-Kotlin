package com.learning.mvc.MVCKotlin.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Employee(@Id @GeneratedValue val id:Long?=null, val name:String? = null, val department:String? = null, val comments:String? = null)
