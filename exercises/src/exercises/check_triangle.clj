(ns exercises.check-triangle
  (:require [clojure.test :refer [is]]))

(defn triangle?
  [a b c]
  (and (< a (+ b c))
       (< b (+ a c))
       (< c (+ a b))))

(is (= true (triangle? 3 4 5)))

(is (= false (triangle? 1 1 2)))