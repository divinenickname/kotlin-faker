package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.COMMUNITY] category.
 */
@Suppress("unused")
class Community internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Community>(fakerService) {
    override val category = YamlCategory.COMMUNITY
    override val localUniqueDataProvider = LocalUniqueDataProvider<Community>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun characters() = resolve("characters")
    fun quotes() = resolve("quotes")
}
