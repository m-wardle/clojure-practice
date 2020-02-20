(ns exercises.scrabble-score
  (:require [clojure.test :refer [is]])
  (:require [clojure.string :as str]))

(def char->score
  {"A" 1
   "B" 3
   "C" 3
   "D" 2
   "E" 1
   "F" 4
   "G" 2
   "H" 4
   "I" 1
   "J" 8
   "K" 5
   "L" 1
   "M" 3
   "N" 1
   "O" 1
   "P" 3
   "Q" 10
   "R" 1
   "S" 1
   "T" 1
   "U" 1
   "V" 4
   "W" 4
   "X" 8
   "Y" 4
   "Z" 10})

(defn word->score
  [word]
  (reduce + (map char->score (str/split (str/upper-case word) #""))))

(word->score "hello")

(is (= 8 (word->score "hello")))

(is (= 17 (word->score "question")))

(is (= 35 (word->score "quizzed")))
