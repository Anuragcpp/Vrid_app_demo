package com.example.vridap.data.remote.dto

import com.google.gson.annotations.SerializedName

data class BlogResponse(
    val id: Int,
    val date: String,
    val date_gmt: String,
    val guid: Guid,
    val modified: String,
    val modified_gmt: String,
    val slug: String,
    val status: String,
    val type: String,
    val link: String,
    val title: Title,
    val content : Content,
    val excerpt: Excerpt,
    val author: Int,
    val featured_media: Int,
    val comment_status: String,
    val ping_status: String,
    val sticky: Boolean,
    val template: String,
    val format: String,
    val meta: Meta,
    val categories: List<Int>,
    val tags: List<Int>,
    val class_list: List<String>,
    val jetpack_publicize_connections: List<Any>,
    val aioseo_notices: List<Any>,
    val jetpack_sharing_enabled: Boolean,
    val jetpack_featured_media_url: String,
    val jetpack_likes_enabled: Boolean,
    val jetpack_shortlink: String,
    @SerializedName("jetpack-related-posts")
    val jetpack_related_posts: List<Any>,
//    val self: List<LinkDetail>,
//    val collection: List<LinkDetail>,
//    val about: List<LinkDetail>,
//    val author: List<EmbeddableLinkDetail>,
//    val replies: List<EmbeddableLinkDetail>,
//    @SerializedName("version-history")
//    val versionHistory: List<VersionHistoryDetail>,
//    @SerializedName("predecessor-version")
//    val predecessorVersion: List<PredecessorVersionDetail>,
//    @SerializedName("wp:featuredmedia")
//    val wpFeaturedMedia: List<EmbeddableLinkDetail>,
//    @SerializedName("wp:attachment")
//    val wpAttachment: List<LinkDetail>,
//    @SerializedName("wp:term")
//    val wpTerm: List<TermDetail>,
//    val curies: List<CuriesDetail>
)
