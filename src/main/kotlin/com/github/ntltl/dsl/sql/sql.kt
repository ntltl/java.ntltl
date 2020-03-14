package com.github.ntltl.dsl.sql

typealias SQLBuilder = SQL.() -> Unit

typealias TableBuilder = Table.() -> Unit

class Table(private var name: String) {

    fun join(name: String) {
        val trimmedName = name.trim()
        this.name += " join $trimmedName"
    }

    override fun toString(): String {
        return this.name
    }
}

class SQL {

    private val elements = mutableListOf<String>()

    private var fromTable = ""

    operator fun String.unaryPlus() {
        elements.add(this)
    }

    fun table(tableName: String, tableBuilder: TableBuilder) {
        val table = Table(tableName)
        table.tableBuilder()
        fromTable += table.toString()
    }

    override fun toString(): String {
        var ret = ""
        for (ele in elements) {
            ret += ele
        }
        ret += "from $fromTable"
        return ret
    }

}

fun sql(sql : SQL = SQL(), sqlBuilder: SQLBuilder): String {
    sql.sqlBuilder()
    return sql.toString()
}


