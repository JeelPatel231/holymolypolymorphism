import kotlinx.serialization.json.*
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

val myJsonModule = SerializersModule {
    polymorphic(PBItem::class){
        subclass(AutoStat::class)
        subclass(Evolit::class)
        subclass(EvolitAbility::class)
        subclass(EvolitDescription::class)
        subclass(EvolitImage::class)
        subclass(EvolitName::class)
        subclass(EvolitSkin::class)
        subclass(EvolitStat::class)
        subclass(AbilitiesActual::class)
        subclass(Ability::class)
        subclass(Component::class)
        subclass(ComponentHealth::class)
        subclass(ComponentEffect::class)
        subclass(ComponentStat::class)
        subclass(ComponentNegate::class)
    }
}

val JSON = Json {
    serializersModule = myJsonModule
    ignoreUnknownKeys = true
}

fun main(args: Array<String>) {
    val evolitsJsonDecoded = JSON.decodeFromString<PBResponse>(EVOLITS_JSON)
    val autoStatJsonDecoded = JSON.decodeFromString<PBResponse>(AUTO_STAT_JSON)
    val abilitiesJsonDecoded = JSON.decodeFromString<PBResponse>(ABILITIES_JSON)
}