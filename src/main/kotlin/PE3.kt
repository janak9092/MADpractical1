open class Person(firstname:String,lastname:String){
    var age:Int=-1
    init{
        println("First Name:$firstname")
        println("Last Name:$lastname")
    }
    constructor(firstname: String,lastname: String,age:Int):this(firstname,lastname){
        this.age=age

        println("Age $age")
    }
}
class Student(firstname:String,lastname:String,age:
Int,eno:Long,branch:String,Class:String):Person(firstname,lastname,age){
    var batch:String=""
    init{
        println("Branch $branch")
        println("Class $Class")
    }
    constructor(firstname:String,lastname:String,age:
    Int,eno:Long,branch:String,Class:String,batch:String):this(firstname,lastname,age,eno,branch,Class){
        this.batch=batch
        println("Batch $batch")
        println("--------------")
    }
}
fun main(){
    var s1=Student("Janak","darji",20,20012011029,"CE","C","AB7")
    var s2=Student("Nishant","Patel",20,20012011115,"CE","C","AB8")
    var s3=Student("Parv","Purohit",20,20012011141,"CE","c","AB8")
    var s4=Student("Alex","Mercer",19,20012021011,"CE","c","AB7")
    var s5=Student("Karan","Sethia",17,2001201006,"CE","C","AB7")
}
