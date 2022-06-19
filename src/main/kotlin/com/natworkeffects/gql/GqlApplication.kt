package com.natworkeffects.gql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.netflix.graphql.dgs.DgsComponent

@SpringBootApplication
class GqlApplication

fun main(args: Array<String>) {
	runApplication<GqlApplication>(*args)
}

