package dev.suho.jsonapi.model

import dev.suho.jsonapi.serializer.DataTypeSerializer
import kotlinx.serialization.Serializable

@Serializable(with = DataTypeSerializer::class)
sealed class DataType<out T> {
    @Serializable(with = DataTypeSerializer::class)
    data class Single<T>(val item: T) : DataType<T>()
    @Serializable(with = DataTypeSerializer::class)
    data class Collection<T>(val items: List<T>) : DataType<T>()
}

