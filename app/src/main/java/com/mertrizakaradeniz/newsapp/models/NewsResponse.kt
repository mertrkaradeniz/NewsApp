package com.mertrizakaradeniz.newsapp.models

import com.mertrizakaradeniz.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)