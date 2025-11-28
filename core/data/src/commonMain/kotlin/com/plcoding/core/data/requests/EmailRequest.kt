package com.plcoding.core.data.requests

import kotlinx.serialization.Serializable

@Serializable
data class EmailRequest(
    val email: String
)
