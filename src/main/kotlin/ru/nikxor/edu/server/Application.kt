package ru.nikxor.edu.server

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.routing.*
import io.ktor.serialization.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import ru.nikxor.edu.server.model.Config
import ru.nikxor.edu.server.repo.flowsRepo
import ru.nikxor.edu.server.repo.flowsRepoTestData
import ru.nikxor.edu.server.repo.groupsRepo
import ru.nikxor.edu.server.repo.groupsRepoTestData
import ru.nikxor.edu.server.rest.flow
import ru.nikxor.edu.server.rest.group


fun main() {
    embeddedServer(
        Netty,
        port = Config.serverPort,
        host = Config.serverDomain,
        watchPaths = listOf("classes", "resources")
    ) {
        main()
    }.start(wait = true)
}

fun Application.main(test: Boolean = true) {
    if (test) {
        groupsRepoTestData.forEach { groupsRepo.create(it) }
        flowsRepoTestData.forEach { flowsRepo.create(it) }
    }
    install(ContentNegotiation) {
        json()
    }
    routing {
        index()
        group()
        flow()
    }
}