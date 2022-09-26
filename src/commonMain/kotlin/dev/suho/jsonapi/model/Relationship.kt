package dev.suho.jsonapi.model

import dev.suho.jsonapi.serializer.ApiJsonSerializer
import dev.suho.jsonapi.serializer.DataTypeSerializer
import kotlinx.serialization.Serializable

@Serializable
data class Relationship(
    @Serializable val links: Links? = null,
    @Serializable(with = DataTypeSerializer::class) val data: DataType<ResourceIdentifier>? = null,
    @Serializable(with = ApiJsonSerializer::class) val meta: ApiJson? = null
)
