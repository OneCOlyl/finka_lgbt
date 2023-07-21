package com.finka.lgbt.controller

import com.finka.lgbt.model.Knife
import com.finka.lgbt.service.KnifeService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class KnifeController(val knifeService: KnifeService) {

    @GetMapping
    public fun getKnife(id: Long): ResponseEntity<Any> {
        val result: ResponseEntity<Any> = try {
            ResponseEntity.ok(knifeService.getKnife(id))
        } catch (ex : Exception) {
            ResponseEntity.badRequest().body(ex)
        }

        return result
    }

    public fun getKnifes() {

    }
}
