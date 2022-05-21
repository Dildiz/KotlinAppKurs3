package ru.nikxor.edu.server.repo

import ru.nikxor.edu.server.model.Config
import ru.nikxor.edu.server.model.Flow
import ru.nikxor.edu.server.model.Group
import java.util.*

val flowsRepo = ListRepo<Flow>()

val flowsRepoTestData = listOf(
    Flow(name = "TestLecture",  "Lecture"),
    Flow(name = "TestPractice",  "Practice"),
    Flow(name = "TestLab",  "Lab")
)