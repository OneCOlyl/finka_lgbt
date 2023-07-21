package com.finka.lgbt.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table
data class Knife(
    @Id val id: Long,
    val name: String
    val isDeleted: Boolean
)
