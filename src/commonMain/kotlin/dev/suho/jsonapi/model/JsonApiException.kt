package dev.suho.jsonapi.model

class JsonApiException(val errors: List<JsonApiError>): Throwable()
