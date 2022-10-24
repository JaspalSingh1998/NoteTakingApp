package com.example.notetakingapp

import io.realm.annotations.PrimaryKey
import io.realm.RealmObject

open class Notes (
    @PrimaryKey
    var id:Int?=null,
    var title:String?=null,
    var description:String?=null
) : RealmObject()