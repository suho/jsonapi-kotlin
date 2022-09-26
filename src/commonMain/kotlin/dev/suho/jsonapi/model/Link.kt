package dev.suho.jsonapi.model

import dev.suho.jsonapi.serializer.ApiJsonSerializer
import dev.suho.jsonapi.serializer.LinkSerializer
import kotlinx.serialization.Serializable

@Serializable(with = LinkSerializer::class)
data class Link(
    @Serializable
    val href: String? = null,
    @Serializable(with = ApiJsonSerializer::class) val meta: ApiJson? = null
)

