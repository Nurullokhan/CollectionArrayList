fun main(args: Array<String>) {

    val arrayList = ArrayList<String>()

    arrayList.add("C++")
    arrayList.add("Java")
    arrayList.add("Kotlin")
    arrayList.add("Android")

    for (i in arrayList) {
        println(i)
    }

    //print -> C++ Java Kotlin Android

    arrayList.add(1, "C#")

    for (i in arrayList) {
        println(i)
    }

    val a = ArrayList<String>()

    a.add("C++")
    a.add("Java")

    val b = ArrayList<String>()

    b.add("Kotlin")
    b.add("Android")

    a.addAll(b)

    for (i in a) {
        println(i)
    }

    val array = ArrayList<String>()

    array.add("C++")
    array.add("Java")
    array.add("Kotlin")
    array.add("Android")

    println(array.get(3))
    println(array[3])

    array.set(1, "C#")
    array[1] = "C#"

    val list = ArrayList<String>()

    list.add("C++")
    list.add("Java")
    list.add("Kotlin")
    list.add("Android")

    println(list.indexOf("Android"))

    val l = ArrayList<String>()

    l.add("C++")
    l.add("Java")
    l.add("Kotlin")
    l.add("Android")

    for (i in l) {
        println(i)
    }

    l.remove("C++")

    for (i in l) {
        println(i)
    }

    val clearList = ArrayList<String>()

    clearList.add("C++")
    clearList.add("Java")
    clearList.add("Kotlin")
    clearList.add("Android")

    println(clearList.size)
    for (i in clearList) {
        println(i)
    }

    clearList.clear()

    println(clearList.size)
    for (i in clearList) {
        println(i)
    }
}