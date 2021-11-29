package com.example.mongodb

import com.example.mongodb.entity.Tag
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.example.mongodb.service.TagService

// в файле пропитес прописываем подключение к монге
/*
Перед этим надо запустить в папке с монгой bin/mongo.exe файл и
Add user admin into your database.
Open installed folder and open the mongo.exe file and run below command :
use admin
db.createUser(
{
user: "admin",
pwd: "admin",
roles: [ { role: "userAdminAnyDatabase", db: "admin" },
{ role: "dbAdminAnyDatabase", db: "admin" },
{ role: "readWriteAnyDatabase", db: "admin" } ]
}
)
пароль и юзернэйм пишем в пропитес которые прописали тут
 */
@SpringBootApplication
class MongoDbApplication(){
}

fun main(args: Array<String>) {
    val application = runApplication<MongoDbApplication>(*args)

    val temp = application.getBean(TagService::class.java)

    val tagRecord = Tag(tags = mutableListOf("Java", "Kotlin", "AI"))

    temp.insertNewTagsDocument(listOf(tagRecord))
}
