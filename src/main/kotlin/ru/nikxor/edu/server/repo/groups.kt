package ru.nikxor.edu.server.repo

import ru.nikxor.edu.server.model.Config
import ru.nikxor.edu.server.model.Group
import ru.nikxor.edu.server.model.forString
import java.util.*

val groupsRepo = ListRepo<Group>()


val groupsRepoTestData = listOf(
    Group("29m"),
    Group("29a"),
    Group("29z")
)

