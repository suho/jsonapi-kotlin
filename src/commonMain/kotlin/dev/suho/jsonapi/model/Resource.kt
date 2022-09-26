package dev.suho.jsonapi.model

import dev.suho.jsonapi.serializer.ApiJsonSerializer
import kotlinx.serialization.Serializable

@Serializable
data class Resource(
    @Serializable override val id: String,
    @Serializable override val type: String,
    @Serializable(with = ApiJsonSerializer::class) val attributes: ApiJson? = null,
    @Serializable val relationships: Map<String, Relationship>? = null,
    @Serializable val links: Links? = null,
    @Serializable(with = ApiJsonSerializer::class) val meta: ApiJson? = null,
): JsonApiType
