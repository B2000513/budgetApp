package com.assignment.budgetApp

import com.assignment.budgetApp.models.Category
import com.assignment.budgetApp.models.Expense
import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration

val config = RealmConfiguration.create(schema = setOf(Expense::class, Category::class))
val db: Realm = Realm.open(config)