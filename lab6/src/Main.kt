fun main() {
    // ЗАДАНИЕ 1
    println("ЗАДАНИЕ 1")
    val numbers1 = intArrayOf(1, 2, 3, 4, 5)
    for (number in numbers1) {
        println(number)
    }

    // ЗАДАНИЕ 2
    println("ЗАДАНИЕ 2")
    val numbers11 = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0
    for (number in numbers11) {
        sum += number
    }
    println("Сумма элементов массива: $sum")

    // ЗАДАНИЕ 3
    println("ЗАДАНИЕ 3")
    val numbers3 = intArrayOf(10, 2, 8, 1, 9, 5, 7, 3, 6, 4)
    var max = numbers3[0]
    var min = numbers3[0]
    for (number in numbers3) {
        if (number > max) {
            max = number
        }
        if (number < min) {
            min = number
        }
    }
    println("Максимальное значение: $max")
    println("Минимальное значение: $min")

    // ЗАДАНИЕ 4
    println("ЗАДАНИЕ 4")
    val numbers4 = intArrayOf(5, 2, 8, 1, 9, 3, 7, 4, 6, 10)
    numbers4.sort()
    println("Отсортированный массив: ${numbers4.joinToString(", ")}")

    // ЗАДАНИЕ 5
    println("ЗАДАНИЕ 5")
    val numbers5 = intArrayOf(1, 2, 3, 3, 4, 5, 5, 6, 7, 7)
    val uniqueNumbers = numbers5.toSet().toTypedArray()
    println("Уникальные элементы: ${uniqueNumbers.joinToString(", ")}")

    // ЗАДАНИЕ 6
    println("ЗАДАНИЕ 6")
    val numbers6 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = mutableListOf<Int>()
    val oddNumbers = mutableListOf<Int>()
    for (number in numbers6) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }
    println("Четные числа: ${evenNumbers.joinToString(", ")}")
    println("Нечетные числа: ${oddNumbers.joinToString(", ")}")

    // ЗАДАНИЕ 7
    println("ЗАДАНИЕ 7")
    val numbers7 = intArrayOf(1, 2, 3, 4, 5)
    val reversedNumbers = numbers7.reversedArray()
    println("Реверсированный массив: ${reversedNumbers.joinToString(", ")}")

    // ЗАДАНИЕ 8
    println("ЗАДАНИЕ 8")
    val numbers8 = intArrayOf(1, 2, 3, 4, 5)
    val searchNumber = 3
    val index = numbers8.indexOf(searchNumber)
    if (index != -1) {
        println("Индекс элемента $searchNumber: $index")
    } else {
        println("Элемент $searchNumber не найден в массиве.")
    }

    // ЗАДАНИЕ 9
    println("ЗАДАНИЕ 9")
    val numbers9 = intArrayOf(1, 2, 3, 4, 5)
    val newNumbers = numbers9.copyOf()
    println("Новый массив: ${newNumbers.joinToString(", ")}")

    // ЗАДАНИЕ 10
    println("ЗАДАНИЕ 10")
    val numbers10 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var evenSum = 0
    for (number in numbers10) {
        if (number % 2 == 0) {
            evenSum += number
        }
    }
    println("Сумма четных чисел: $evenSum")

    // ЗАДАНИЕ 11
    println("ЗАДАНИЕ 11")
    val arr1 = intArrayOf(1, 2, 3, 4, 5)
    val arr2 = intArrayOf(3, 4, 5, 6, 7)
    val intersection = arr1.intersect(arr2.toSet()).toTypedArray()
    println("Пересечение: ${intersection.contentToString()}")

    // ЗАДАНИЕ 12
    println("\nЗАДАНИЕ 12")
    val arr = intArrayOf(1, 2, 3, 4, 5)
    val index1 = 1
    val index2 = 3
    swap(arr, index1, index2)
    println("Переставленный массив: ${arr.contentToString()}")

    // ЗАДАНИЕ 13
    println("\nЗАДАНИЕ 13")
    val randomArray = IntArray(20) { (1..100).random() }
    println("Случайный массив: ${randomArray.contentToString()}")

    // ЗАДАНИЕ 14
    println("\nЗАДАНИЕ 14")
    val numbers2 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Числа, делящиеся на 3: ${numbers2.filter { it % 3 == 0 }.joinToString(", ")}")

    // ЗАДАНИЕ 15
    println("\nЗАДАНИЕ 15")
    val palindromeArray = intArrayOf(1, 2, 3, 2, 1)
    println("Является ли массив палиндромом: ${isPalindrome(palindromeArray)}")

    // ЗАДАНИЕ 16
    println("\nЗАДАНИЕ 16")
    val arr3 = intArrayOf(1, 2, 3)
    val arr4 = intArrayOf(4, 5, 6)
    val concatenatedArray = arr3 + arr4
    println("Объединенный массив: ${concatenatedArray.contentToString()}")

    // ЗАДАНИЕ 17
    println("\nЗАДАНИЕ 17")
    val sumArray = intArrayOf(1, 2, 3, 4, 5)
    println("Сумма элементов: ${sumArray.sum()}")
    println("Произведение элементов: ${sumArray.reduce { acc, i -> acc * i }}")

    // ЗАДАНИЕ 18
    println("\nЗАДАНИЕ 18")
    val groupArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)
    for (i in 0 until groupArray.size step 5) {
        val group = groupArray.sliceArray(i until minOf(i + 5, groupArray.size))
        println(group.contentToString())
    }

    // ЗАДАНИЕ 19
    println("\nЗАДАНИЕ 19")
    val sortedArray1 = intArrayOf(1, 3, 5, 7, 9)
    val sortedArray2 = intArrayOf(2, 4, 6, 8, 10)
    val mergedArray = sortedArray1.plus(sortedArray2).sortedArray()
    println("Слитый массив: ${mergedArray.contentToString()}")

    // ЗАДАНИЕ 20
    println("\nЗАДАНИЕ 20")
    val arithmeticProgression = IntArray(10) { 2 + it * 3 }
    println("Арифметическая прогрессия: ${arithmeticProgression.contentToString()}")
}

// Функции

fun swap(arr: IntArray, index1: Int, index2: Int) {
    val temp = arr[index1]
    arr[index1] = arr[index2]
    arr[index2] = temp
}

fun isPalindrome(arr: IntArray): Boolean {
    for (i in 0 until arr.size / 2) {
        if (arr[i] != arr[arr.size - i - 1]) {
            return false
        }
    }
    return true
}


