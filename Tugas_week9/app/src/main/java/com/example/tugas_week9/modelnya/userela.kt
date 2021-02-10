package com.example.tugas_week9.modelnya

import io.realm.RealmObject

open class userela : RealmObject() {
    private var id : Int? = null
    private var nama : String? = null
    private var email : String? = null
    private var nim : Int? = null
    private var kelas : String? = null

    fun setId(id:Int){
        this.id = id

    }
    fun getId():Int?{
        return id
    }


    fun setnama(nama :String){
        this.nama
    }
    fun getnama():String?{
        return nama
    }



    fun setemail(nim:String){
        this.email
    }
    fun getemail():String?{
        return email
    }

    fun setnim(nim:Int){
        this.nim
    }
    fun getnim():Int?{
        return nim
    }

    fun setkelas(kelas:String){
        this.kelas
    }
    fun getkelas():String?{
        return kelas
    }

}