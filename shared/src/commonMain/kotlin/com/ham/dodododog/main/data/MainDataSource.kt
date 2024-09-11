package com.ham.dodododog.main.data

import com.ham.dodododog.AppDatabase
import com.ham.dodododog.main.domain.MainDataSource
import io.ktor.client.HttpClient

class MainDataSourceImpl(
    db: AppDatabase, private val httpClient: HttpClient,
) : MainDataSource {
//    private val queries = db.dbQueries


}