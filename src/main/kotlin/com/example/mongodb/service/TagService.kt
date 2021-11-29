package com.example.mongodb.service

import com.example.mongodb.entity.Tag
import org.springframework.stereotype.Service
import com.example.mongodb.repository.TagsRepository

@Service
class TagService(val tagsRepository: TagsRepository) {

    fun insertNewTagsDocument(tags: List<Tag>) = tagsRepository.saveAll(tags)
}