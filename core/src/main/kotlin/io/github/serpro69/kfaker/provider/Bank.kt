package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.FakerService
import io.github.serpro69.kfaker.dictionary.YamlCategory
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.BANK] category.
 */
@Suppress("unused")
class Bank internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Bank>(fakerService) {
    override val category = YamlCategory.BANK
    override val localUniqueDataProvider = LocalUniqueDataProvider<Bank>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun name() = resolve("name")
    fun swiftBic() = resolve("swift_bic")
    fun ibanDetails(countryCode: String): String = with(fakerService) {
        resolve("iban_details", countryCode.lowercase())
            .drop(1)
            .dropLast(1)
            .split(", ")
            .last()
            .split("=")
            .last()
            .generexify()
    }
}
