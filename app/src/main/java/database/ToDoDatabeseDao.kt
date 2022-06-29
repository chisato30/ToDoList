package database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ToDoDatabaseDao {

    @Insert
    fun insert(toDo: ToDo)
}
