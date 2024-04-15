package com.assignment.budgetApp.models


import io.realm.kotlin.types.ObjectId
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

fun hashPassword(plainTextPassword: String): String {
    // Implement your secure password hashing logic here (e.g., bcrypt, scrypt)
    return plainTextPassword // Placeholder for actual hashing
}

data class User(
    @PrimaryKey var _id: ObjectId = ObjectId.create(),
    val username: String,
    val hashedPassword: String
) : RealmObject {

    // Primary constructor for creating a new user with secure password hashing
    constructor(username: String, plainTextPassword: String) : this(
        _id = ObjectId.create(),
        username = username,
        hashedPassword = hashPassword(plainTextPassword)
    )
}