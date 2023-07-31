package com.finka.lgbt.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table
data class ClsKnife(
    @Id val id: Long,
    val name: String,
    val code: String,
    val isDeleted: Boolean,
    val timeCreate: java.security.Timestamp
)
