package com.belongo.mapper

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

/**
 * Created by Simon on 20.02.2015.
 */
class ScalaObjectMapper extends ObjectMapper {
  registerModule(DefaultScalaModule)
}
