package com.example.petshopkotlin.repository

import com.example.petshopkotlin.collection.User
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface UserRepository : MongoRepository<User?, ObjectId?> {
    fun existsByUserName(username: String?): Boolean

    @Query("{userName:'?0'}")
    fun findUserByUsername(userName: String?): User?
}
