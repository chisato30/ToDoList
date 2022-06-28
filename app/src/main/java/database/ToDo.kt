package database

@Entity(tableName = "todo_table")
data class ToDo(
    @PrimaryKey(autoGenerate = true)
    var toDoId: Long = 0L,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "choice_time")
    var choiceTime: Long,

    @ColumnInfo(name = "choice_date")
    var choiceDate: Long,

    @ColumnInfo(name = "detail")
    var detail: String,

    @ColumnInfo(name = "schedule")
    var schedule: Int = -1,
)

annotation class ColumnInfo(val name: String)

annotation class PrimaryKey(val autoGenerate: Boolean)

annotation class Entity(val tableName: String)
