package com.belongo.main

import com.belongo.WebConfig
import org.springframework.boot.SpringApplication

/**
 * Created by Simon on 20.02.2015.
 */
object Application {

  def main(args: Array[String]) {
    SpringApplication.run(classOf[WebConfig], args:_*)
  }

}

