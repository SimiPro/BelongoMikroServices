package com.belongo.rest

import com.belongo.mongo.{UserRepository, User}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestBody, RequestMethod, RequestMapping, RestController}

/**
 * Created by Simon on 20.02.2015.
 */
@RestController
class TestController {

  @Autowired
  var repo:UserRepository = _

  @RequestMapping(value = Array("test"), method= Array(RequestMethod.POST))
  def test(@RequestBody request:TestRequest) = {
    TestResponse(request.content)
  }


  @RequestMapping(value = Array("register"), method = Array(RequestMethod.POST))
  def register(@RequestBody request:RegisterRequest) = {
    val user:User = new User(request.email, request.password)
    val savedUser = repo.save(user)
    new RegisterResponse(savedUser.id)
  }
}

case class TestRequest(content:String)
case class TestResponse(content:String)

case class RegisterRequest(email:String, password: String)
case class RegisterResponse(id:String)