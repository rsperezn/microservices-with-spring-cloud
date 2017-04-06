package com.rspn.service


interface SentenceService {
    fun getAdjective(): String
    fun getSubject(): String
    fun getVerb(): String
    fun getArticle(): String
    fun getNoun(): String
}