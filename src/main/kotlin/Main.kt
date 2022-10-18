fun main(args: Array<String>) {

val arr = arrayOf("Apple", "Banana", "Orange", "100")
val fruits = arrayOf("Apple", "Banana", "Orange",)

   diff(arr, fruits)


}
fun diff(arr: Array<String>, fruits: Array<String>) {

  for (i in arr.indices){
      var flag = true

      for (j in fruits.indices){
          if (arr[i]==fruits[j]){
              flag = false
              break
          }
      }
      if (flag){
        println("Не является фруктом - ${arr[i]}")
      }
  }
}