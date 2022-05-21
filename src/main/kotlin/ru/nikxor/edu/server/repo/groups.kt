package ru.nikxor.edu.server.repo

import ru.nikxor.edu.server.model.Group

val groupsRepo = ListRepo<Group>()


val groupsRepoTestData = listOf(
    Group("29m"),
    Group("29a"),
    Group("29z")
)

