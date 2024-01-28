fun main() {

    for(i in 0..3) {             // 1 0 <=3 incluindo 3
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2 sem o 3 <3
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3 pula e 2 em 2
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4 decrescente
        print(i)
    }
    print(" ")


}