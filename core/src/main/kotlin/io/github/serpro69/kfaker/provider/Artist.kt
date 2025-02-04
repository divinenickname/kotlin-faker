package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.ARTIST] category.
 */
@Suppress("unused")
class Artist internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Artist>(fakerService) {
    override val category = YamlCategory.ARTIST
    override val localUniqueDataProvider = LocalUniqueDataProvider<Artist>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun names() = resolve("names")
}
