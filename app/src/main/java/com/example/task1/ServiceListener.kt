package com.example.task1

import com.example.task1.model.ShortlyModel

interface ServiceListener {

    fun onServiceSuccess(response: ShortlyModel)

    fun onFailure(throwable: Throwable)

    fun onIncorrectInputQuery()

    fun onItemAlreadyInDB()
}