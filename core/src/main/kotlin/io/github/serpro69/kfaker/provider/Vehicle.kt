package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.VEHICLE] category.
 */
@Suppress("unused")
class Vehicle internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Vehicle>(fakerService) {
    override val category = YamlCategory.VEHICLE
    override val localUniqueDataProvider = LocalUniqueDataProvider<Vehicle>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    fun manufacture() = resolve("manufacture")
    fun makes() = resolve("makes")
    fun modelsByMake(make: String) = resolve("models_by_make", make)
    fun colors() = resolve("colors")
    fun transmissions() = resolve("transmissions")
    fun driveTypes() = resolve("drive_types")
    fun fuelTypes() = resolve("fuel_types")
    fun styles() = resolve("styles")
    fun carTypes() = resolve("car_types")
    fun carOptions() = resolve("car_options")
    fun standardSpecs() = resolve("standard_specs")
    fun doors() = resolve("doors")
    fun engineSizes() = resolve("engine_sizes")
    fun licensePlate() = with(fakerService) { resolve("license_plate").numerify().letterify() }
    fun licencePlateByState(stateCode: String) = with(fakerService) {
        resolve("license_plate_by_state", stateCode).numerify().letterify().generexify()
    }

    fun cylinderEngine() = resolve("cylinder_engine")
}
