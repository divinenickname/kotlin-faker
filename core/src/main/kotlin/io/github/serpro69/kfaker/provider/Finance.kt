package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.YamlCategory
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.FINANCE] category.
 */
@Suppress("unused")
class Finance internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Finance>(fakerService) {
    override val category = YamlCategory.FINANCE
    override val localUniqueDataProvider = LocalUniqueDataProvider<Finance>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun creditCard(type: String): String = with(fakerService) { resolve("credit_card", type).numerify().generexify() }

    fun vatNumber(countryCode: String): String = with(fakerService) { resolve("vat_number", countryCode).numerify() }
}
