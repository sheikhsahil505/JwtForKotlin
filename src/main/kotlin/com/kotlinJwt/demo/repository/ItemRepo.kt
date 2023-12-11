package com.kotlinJwt.demo.repository

import com.kotlinJwt.demo.model.Item
import com.kotlinJwt.demo.model.User
import org.springframework.data.repository.CrudRepository

interface ItemRepo : CrudRepository<Item, Long> {
    fun findByUser(user: User): List<Item>
    fun findByNameAndUser(name: String, user: User): Item?

    fun existsByNameAndUser(name: String, user: User): Boolean
}
