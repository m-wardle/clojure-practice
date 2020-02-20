(ns exercises.classify-triangle
  (:require [clojure.test :refer [is]]))

(defn triangle?
  [a b c]
  (and (< a (+ b c))
       (< b (+ a c))
       (< c (+ a b))))

(defn classify-triangle
  [a b c]
  (cond
    (not (triangle? a b c)) :invalid
    (= a b c) :equilateral
    (and (not (= a b))
         (not (= b c))
         (not (= c a))) :scalene
    :else :isosceles))

(is (= :equilateral (classify-triangle 1 1 1)))

(is (= :invalid (classify-triangle 0 0 0)))

(is (= :invalid (classify-triangle 1 1 2)))

(is (= :isosceles (classify-triangle 4 4 5)))

(is (= :scalene (classify-triangle 3 4 5)))