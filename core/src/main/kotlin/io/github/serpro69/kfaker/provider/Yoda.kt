package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.YODA] category.
 */
@Suppress("unused")
class Yoda internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Yoda>(fakerService) {
    override val category = YamlCategory.YODA
    override val localUniqueDataProvider = LocalUniqueDataProvider<Yoda>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun quotes() = resolve("quotes")
}
