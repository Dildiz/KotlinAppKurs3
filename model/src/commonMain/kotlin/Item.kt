package ru.nikxor.edu.server.model

interface Item<E> {
    val elem: E
    val uuid: String
    val etag: Long
}