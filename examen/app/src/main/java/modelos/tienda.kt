package modelos

import android.os.Parcel
import android.os.Parcelable
import java.util.*

class tienda(
    var nombre:String,
    var direccion :String,
    var fechaApertura: String,
    var RUC : String,
    var matriz:String
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(direccion)
        parcel.writeString(fechaApertura)
        parcel.writeString(RUC)
        parcel.writeString(matriz)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<tienda> {
        override fun createFromParcel(parcel: Parcel): tienda {
            return tienda(parcel)
        }

        override fun newArray(size: Int): Array<tienda?> {
            return arrayOfNulls(size)
        }
    }


}