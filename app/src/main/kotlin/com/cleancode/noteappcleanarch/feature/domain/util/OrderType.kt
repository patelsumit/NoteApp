package com.cleancode.noteappcleanarch.feature.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()

}
