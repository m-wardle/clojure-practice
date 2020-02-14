(ns exercises.check-triangle
  (:require [clojure.test :refer [is]]))

(defn largest
  [nums]
  (apply max nums))

(is (= 3 (largest [1 2 -1 3 3 2 1 0])))