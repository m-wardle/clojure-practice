(ns exercises.count-if
  (:require [clojure.test :refer [is]]))

(defn count-if
  [cond? values]
  (count (filter cond? values)))

(is (= 3 (count-if even? [1 2 3 4 5 6])))

(is (= 1 (count-if keyword? ["foo" :bar 'baz])))

(is (= 2
       (count-if (fn [x]
                   (= x (reverse x)))
                 [[1 2 1] [1 2 3 4] [1]])))