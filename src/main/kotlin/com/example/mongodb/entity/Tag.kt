package com.example.mongodb.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "Tag")
class Tag(@Id var id: String? = null,
          var tags: MutableList<String> = mutableListOf()) {

}