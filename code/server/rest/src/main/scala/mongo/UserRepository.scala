package com.belongo.mongo


import org.springframework.data.mongodb.repository.MongoRepository

/**
 * Created by Simon on 20.02.2015.
 */
trait UserRepository extends MongoRepository[User, String] {

}
