package eu.kanade.tachiyomi.animeextension.pt.anitube

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
class AnitubeToken(
    @SerialName("publicidade")
    val value: String,
)
