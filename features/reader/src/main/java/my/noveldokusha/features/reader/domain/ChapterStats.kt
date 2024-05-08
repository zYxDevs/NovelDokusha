package my.noveldokusha.features.reader.domain

import my.noveldokusha.tooling.local_database.tables.Chapter

data class ChapterStats(
    val itemsCount: Int,
    val chapter: Chapter,
    val orderedChaptersIndex: Int
)