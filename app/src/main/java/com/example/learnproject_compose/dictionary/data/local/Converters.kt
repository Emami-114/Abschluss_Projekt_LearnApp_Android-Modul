package com.example.learnproject_compose.dictionary.data.local

import androidx.room.TypeConverter
import com.example.learnproject_compose.dictionary.domain.model.Meaning
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.Date

class Converters {
    @TypeConverter
    fun fromTimestamp(value: Long?): Date? {
        return value?.let { Date(it) }
    }

    @TypeConverter
    fun dateToTimestamp(date: Date?): Long? {
        return date?.time
    }

    @TypeConverter
    fun fromMeaningList(value: String?): List<Meaning>? {
        val listType = object : TypeToken<List<Meaning>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun meaningListToString(list: List<Meaning>?): String? {
        return Gson().toJson(list)
    }

    @TypeConverter
    fun fromStringList(value: String?): List<String>? {
        val listType = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(value, listType)
    }

    @TypeConverter
    fun stringListToString(list: List<String>?): String? {
        return Gson().toJson(list)
    }

}