package ru.netology.nerecipe.repository

import androidx.lifecycle.LiveData
import ru.netology.nerecipe.dto.Recipe

interface RecipeRepository {
    val data: LiveData<List<Recipe>>

    fun save(recipe: Recipe)
    fun update(recipe: Recipe)
    fun delete(recipe: Recipe)
    fun favorite(long: Long)
    fun searchText(Text: String)
    fun getData()


    fun showEuropean(type: String)
    fun showAsian(type: String)
    fun showPanasian(type: String)
    fun showEastern(type: String)
    fun showAmerican(type: String)
    fun showRussian(type: String)
    fun showMediterranean(type: String)

    companion object{
        const val NEW_ID = 0L
    }
}