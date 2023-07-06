fun main() {
    var q = Queue(6)
    q.enqueue(3)
    q.enqueue(4)
    q.enqueue(7)
    q.enqueue(6)
    q.isDisplay()
    q.dequeue()
    q.dequeue()
    q.dequeue()
    q.enqueue(3)
    q.enqueue(5)
    q.dequeue()
    q.enqueue(7)
    q.enqueue(8)
    q.enqueue(1)
    q.enqueue(3)
    q.enqueue(5)
    println(q.peak())
    println("---------")
    println(q.isDisplay())




}
class Queue(var capacity: Int){
    var data = IntArray(capacity)
    var front = 0
    var rear = 0
    fun enqueue(item:Int){
        if (isFull()){
            println("Queue is full")
            return
        }
        data[rear] =item
        rear ++
    }
    fun dequeue():Int?{
        if (isEmpty()){
            println("Queue is empty")
            return null
        }
        val removed = data[front]
        for (i in front until rear-1){
            data[i] = data[i+1]
        }
        rear--
        return removed
    }

    fun isFull():Boolean{
        return rear ==capacity
    }
    fun peak():Int?{
        if(isEmpty()){
            println("Queue is empty")
        }
        return null


        }
    fun isEmpty():Boolean{
        return rear ==front
    }
    fun isDisplay(){
        if(isEmpty()){
            println("Queue is empty")
                return
        }
        for (i in front until rear-1){
            println(data[i])
        }
}



    }

//class Queue(var capacity:Int){
//    //fixed size array
//    var data = IntArray(capacity)
//    //keep truck of the index of the front which is 0 and rear which is also 0
//    var front =0
//    var rear = 0
//
//    //just adds an element. doesn't do any other thing
//    fun enqueue(item:Int): Int?{
//        if(isFull()){
//            println("Queue is full")
//
//
//    }
