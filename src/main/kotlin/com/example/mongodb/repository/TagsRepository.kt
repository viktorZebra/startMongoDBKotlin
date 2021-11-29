package com.example.mongodb.repository

import com.example.mongodb.entity.Tag
import org.springframework.data.mongodb.repository.MongoRepository

interface TagsRepository: MongoRepository<Tag, String> {
}