package dev.suho.jsonapi.model

import dev.suho.jsonapi.serializer.LinkSerializer
import kotlinx.serialization.Serializable

@Serializable
data class Links(
    @Serializable(with = LinkSerializer::class) val self: Link? = null,
    @Serializable(with = LinkSerializer::class) val related: Link? = null,
    @Serializable(with = LinkSerializer::class) val article: Link? = null
)
