package database


data class ToDo(
    var toDoId: Long = 0L,
    var title: String,
    var choiceTime: Long,
    var choiceDate: Long,
    var detail: String,
    var schedule: Int = -1,
)