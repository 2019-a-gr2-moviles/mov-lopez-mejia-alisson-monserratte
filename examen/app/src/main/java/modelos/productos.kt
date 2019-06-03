package modelos

import android.os.Parcel
import android.os.Parcelable

class productos(
    var numeroProducto : Int,
    var nombre : String,
    var descripcion : String,
    var precio : Float,
    var fechaLanzamientoProducto: Int,
    var aniosGarantia : String,
    var tiendaId: String
) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readFloat(),
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(numeroProducto)
        parcel.writeString(nombre)
        parcel.writeString(descripcion)
        parcel.writeFloat(precio)
        parcel.writeInt(fechaLanzamientoProducto)
        parcel.writeString(aniosGarantia)
        parcel.writeString(tiendaId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<productos> {
        override fun createFromParcel(parcel: Parcel): productos {
            return productos(parcel)
        }

        override fun newArray(size: Int): Array<productos?> {
            return arrayOfNulls(size)
        }
    }

}