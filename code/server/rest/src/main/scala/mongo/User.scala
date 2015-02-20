package com.belongo.mongo

import org.springframework.data.annotation.Id

/**
 * Created by Simon on 20.02.2015.
 */
case class User(@Id id:String, email:String, password:String) {
  def this(email:String, password:String) = this(null, email, password)
}
