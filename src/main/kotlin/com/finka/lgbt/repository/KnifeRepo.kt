package com.finka.lgbt.repository

import com.finka.lgbt.model.Knife
import org.springframework.data.repository.CrudRepository
import java.util.*

interface KnifeRepo : CrudRepository<Knife, Long> {
    fun findKnifeByIdAndDeleted(id: Long, isDeleted: Boolean): Optional<Knife>

    fun findAllByDeleted(isDeleted: Boolean): Optional<List<Knife>>
}
