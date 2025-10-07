// Task 6.4.2

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class AnagramTest: StringSpec({
    // Write your unit tests here!
    "Strings with diff lentghs are not anagrams"{
        withClue("String length not Equal"){"akshit" anagramOf "saaku" shouldBe false}
    }
    "Empty strings are not anagrams"{
        withClue("Strings are empty"){"" anagramOf "" shouldBe false}
    }
    "Every string is anagram of itself"{
        withClue("Same strings"){"ak" anagramOf "ak" shouldBe true}
    }
    "Same letters diff order are anagrams"{
        withClue("Same strings order diff"){"hello" anagramOf "ellho" shouldBe true}
    }
    "Strings with diff cases but same word are anagrams"{
        withClue("Same strings but dff cases"){"HELLO" anagramOf "hello" shouldBe true}
    }
})
