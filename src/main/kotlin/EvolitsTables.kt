@file:OptIn(ExperimentalSerializationApi::class)

import kotlinx.serialization.EncodeDefault
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("autoStats")
data class AutoStat(
    override val collectionId: String,
    override val collectionName: String,
    override val id: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    // auto stat items
    val name: String,
) : PBItem()

@Serializable
@SerialName("evolits")
data class Evolit(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    override val id: String,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    // evolit class
    val abilities: String,
    val artist: List<String>,
    val description: String,
    val element: String,
    val element2: String,
    val extraLocation: String,
    val image:String,
    val name: String,
    val rarity: String,
    val skins: List<String>,
    val spawnAreas:List<String>,
    val stats: String,
): PBItem()

@Serializable
@SerialName("evolitAbilities")
data class EvolitAbility(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
) :PBItem()

@Serializable
@SerialName("evolitDescriptions")
data class EvolitDescription(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("evolitNames")
data class EvolitName(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("evolitImages")
data class EvolitImage(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("evolitSkins")
data class EvolitSkin(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("evolitStats")
data class EvolitStat(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("abilitiesActual")
data class AbilitiesActual(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("abilities")
data class Ability(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("component")
data class Component(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("componentHealth")
data class ComponentHealth(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("componentEffect")
data class ComponentEffect(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("componentStat")
data class ComponentStat(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

@Serializable
@SerialName("componentNegate")
data class ComponentNegate(
    override val collectionId: String,
    override val collectionName: String,
    override val created: DateString,
    override val updated: DateString,
    @EncodeDefault override val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject> = emptyMap(),

    override val id: String
):PBItem()

