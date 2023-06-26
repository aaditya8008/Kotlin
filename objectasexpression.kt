fun main() {
    var testobj =
            object : cloneable{ // object keyword as an expression
                fun method() {
                    println("FFOOLLEEDD!!")
                }
                override fun clone(){
                    println("I am clone")
                }
            }
    print(testobj.method())
    print(testobj.clone())

    var obj2 = object:PERSON("AADI"){            //inheritance
        override fun fullname(){
            super.fullname()
            println("Anonymous - $name")
        }
    }
    obj2.fullname()
}

interface cloneable{
    fun clone()}

    open class PERSON(val name:String){
        open fun fullname()=println("Full name - $name")

    }