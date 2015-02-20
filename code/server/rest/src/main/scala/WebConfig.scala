package com.belongo

import com.belongo.mapper.ScalaObjectMapper
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.{Bean, Primary, ComponentScan, Configuration}

/**
 * Created by Simon on 20.02.2015.
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
class WebConfig {


  /*
  This mapper does all the magic to convert scala case classes to json and back :)
   */
  @Bean
  @Primary
  def scalaObjectMapper() = new ScalaObjectMapper


}
