(ns exercises.check-triangle
  (:require [clojure.test :refer [is]]))

(def earth->planets
  {:mercury 0.2408467
   :venus 0.61519726
   :earth 1
   :mars 1.8808158
   :jupiter 11.862615
   :saturn 29.447498
   :uranus 84.016846
   :neptune 164.79132})


(defn convert-space-age
  [years home destination]
  (int (/ (* years (earth->planets home)) (earth->planets destination))))

(is (= 1 (convert-space-age 30 :earth :saturn)))

(is (= 78 (convert-space-age 10 :mars :mercury)))