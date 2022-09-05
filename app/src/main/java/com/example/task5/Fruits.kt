package com.example.task5

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize



data class Fruits(val fruitName: String?, val fruitImage: Int, val fruitDescription: String? = null) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(fruitName)
        parcel.writeInt(fruitImage)
        parcel.writeString(fruitDescription)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fruits> {
        override fun createFromParcel(parcel: Parcel): Fruits {
            return Fruits(parcel)
        }

        override fun newArray(size: Int): Array<Fruits?> {
            return arrayOfNulls(size)
        }
    }
}