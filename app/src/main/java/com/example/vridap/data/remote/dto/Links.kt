package com.example.vridap.data.remote.dto

import com.google.gson.annotations.SerializedName

data class Links(
    val self: List<LinkDetail>,
    val collection: List<LinkDetail>,
    val about: List<LinkDetail>,
    val author: List<EmbeddableLinkDetail>,
    val replies: List<EmbeddableLinkDetail>,
    @SerializedName("version-history")
    val versionHistory: List<VersionHistoryDetail>,
    @SerializedName("predecessor-version")
    val predecessorVersion: List<PredecessorVersionDetail>,
    @SerializedName("wp:featuredmedia")
    val wpFeaturedMedia: List<EmbeddableLinkDetail>,
    @SerializedName("wp:attachment")
    val wpAttachment: List<LinkDetail>,
    @SerializedName("wp:term")
    val wpTerm: List<TermDetail>,
    val curies: List<CuriesDetail>
)