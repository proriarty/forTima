fun main(args: Array<String>) {
    CHECHNYA(1, 9, 5)
    CHECHNYA("SUKA", "BLYAT'", true)
    CHECHNYA(1, 2, 5)
    
}
fun CHECHNYA(obj1: Any, obj2: Any, obj3: Any): Int? {
    if ((obj1 is Int) && (obj2 is Int) && (obj3 is Int)) {

        if (obj3 in obj1..obj2) {
            print("Красава, брат")
        }
    }
        else
        print("Аллах тебе судья")

    return null
}
