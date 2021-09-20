fun main() {
    val movie_array = arrayOf("", "", "", "", "")

    println("Enter your top 5 movies: ")
    for(i in 1..5)
        movie_array[i-1] = readLine().toString()

    println("Your top 5 movies are: ")
    for(i in 1..5)
        println(movie_array[i-1])
}