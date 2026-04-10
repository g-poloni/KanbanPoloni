package com.gabriel.task.data.model

import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class Task(
    val id: String,
    val description: String
):Parcelable