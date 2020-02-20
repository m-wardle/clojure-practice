(ns exercises.find-largest
  (:require [clojure.test :refer [is]]))

(defn largest
  [nums]
  (apply max nums))

(defn largest-reduce [nums] (reduce max nums))

(is (= 3 (largest [1 2 -1 3 3 2 1 0])))
(is (= 3 (largest-reduce [1 2 -1 3 3 2 1 0])))