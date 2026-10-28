// COMP2850 Portfolio: Week 4
// ToDoList class

import kotlinx.datetime.LocalDate
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

class ToDoList() {
    private val items = mutableListOf<ToDoItem>()

    val size get() = items.size
    val notStarted get() = items.filter { it.status == ItemStatus.NotStarted }.size   // compute no. of items with NotStarted status
    val inProgress get() = items.filter { it.status == ItemStatus.InProgress }.size   // compute no. of items with InProgress status
    val done get() = items.filter { it.status == ItemStatus.Done }.size     // compute no. of items with Done status
    val overdue get() = items.filter { it.isOverdue() }.size      // compute no. of overdue items

    constructor(filename: String): this() {
        load(filename)
    }

    fun load(filename: String) {
        // Implement code to read To Do list from a file here
        // See data/to-do.csv for an example of the format
        Path(filename).forEachLine {
            var (date, stat, desc) = it.split(":").map { it.trim() }

            if (ItemStatus.entries.any { it.name == stat }){
                items.add(ToDoItem(LocalDate.parse(date),ItemStatus.valueOf(stat) ,desc))
            }
        }
    }

    fun save(filename: String) {
        Path(filename).writer().use {
            for (item in items) {
                it.write("$item\n")
            }
        }
    }

    fun add(vararg item: ToDoItem) = item.forEach { items.add(it) }

    fun deleteDone(): Boolean {
        // Write code here to remove items with status of Done
        // Return true if any were removed, false if none were removed
        val oldSize = items.size
        items.removeIf { it.status == ItemStatus.Done }

        return (items.size != oldSize)
    }

    fun getItems(status: ItemStatus? = null): List<ToDoItem> {
        // Write code here to return a list of items with the matching
        // status, or a list of all items if status argument is null
        return if (status == null) {
            items
        }
        
        else {
            items.filter { it.status == status }
        }
    }

    fun getItemsDueOn(date: LocalDate): List<ToDoItem> {
        // Write code here to return a list of items
        // that are due on the specified date
        return items.filter { it.dueDate == date }
    }
}
