package com.finka.lgbt.service

import com.finka.lgbt.model.Knife
import com.finka.lgbt.repository.KnifeRepo
import org.springframework.stereotype.Service

@Service
class KnifeService(val knifeRepo: KnifeRepo) {
    fun getKnife(id: Long): Knife {
        val knife = knifeRepo.findKnifeByIdAndDeleted(id, false).orElse(null)

        return knife
    }

    fun getKnifes(): List<Knife> {
        val knifes = knifeRepo.findAllByDeleted(false).orElse(null)

        return knifes
    }
}
