val studentScores = mutableMapOf(
    "Eman" to 85, "Mona" to 72, "Omer" to 95, "Saif" to 60
)
fun filter(){

     val highScorers = studentScores.filter { it.value > 80 }
     println("Students with score > 80: $highScorers")
     studentScores.filter { it.value > 80 }.map { "${it.key.uppercase()} - ${it.value}" }
     println(studentScores)
     val totalScore=studentScores.values.reduce{a,b ->a+b}
     println(totalScore)

        }
 fun formatted(){
     val formatted = studentScores.entries.fold("") { acc, entry ->
         if (acc.isEmpty()) "${entry.key}: ${entry.value}"
         else "$acc | ${entry.key}: ${entry.value}"
     }
     println(" Formatted String (fold): $formatted")
 }