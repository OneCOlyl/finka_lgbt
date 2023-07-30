package com.finka.lgbt.repository

import com.finka.lgbt.model.ClsKnife
import org.springframework.data.repository.CrudRepository
import java.util.*

interface KnifeRepo : CrudRepository<ClsKnife, Long> {
    fun findKnifeByIdAndDeleted(id: Long, isDeleted: Boolean): Optional<ClsKnife>

    fun findAllByDeleted(isDeleted: Boolean): Optional<List<ClsKnife>>
}
