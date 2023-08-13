import kotlinx.serialization.*
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.*

@Serializable
data class PBResponse(
    val page: Int,
    val perPage: Int,
    val totalItems: Int,
    val totalPages: Int,
    val items: List<PBItem>
)

sealed class ArrayOrObject {
    class Array(val value : List<PBItem>) : ArrayOrObject()
    class Object(val value : PBItem) : ArrayOrObject()
}

@OptIn(ExperimentalSerializationApi::class)
@Serializer(forClass = ArrayOrObject::class)
class ArrayOrObjectSerializer : KSerializer<ArrayOrObject> {
    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("ArrayOrObject")

    override fun serialize(encoder: Encoder, value: ArrayOrObject) {
        throw NotImplementedError()
    }

    override fun deserialize(decoder: Decoder): ArrayOrObject {
        require(decoder is JsonDecoder)
        return when (val jsonElt = decoder.decodeJsonElement()) {
            is JsonArray -> ArrayOrObject.Array(JSON.decodeFromJsonElement(jsonElt))
            is JsonObject -> ArrayOrObject.Object(JSON.decodeFromJsonElement(jsonElt))
            else -> throw IllegalStateException()
        }
    }
}

typealias DateString = String

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@JsonClassDiscriminator("collectionName")
abstract class PBItem {
    abstract val collectionId: String
    abstract val collectionName: String
    abstract val created: DateString
    abstract val updated: DateString
    abstract val id: String
    @EncodeDefault
    abstract val expand: Map<String, @Serializable(with = ArrayOrObjectSerializer::class) ArrayOrObject>
}
