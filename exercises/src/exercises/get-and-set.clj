(ns exercises.get-and-set
  (:require [clojure.test :refer [is]]))

(defn get-and-set
  [key value collection]
  [(get collection key)
   (assoc collection key value)])

(def x [1 2 3])

(def y {:x "foo" :y "baz"})

(get-and-set 0 2 x)

(get-and-set :y "bar" y)

(is (= [1 [2 3 4]] (get-and-set 0 2 [1 3 4])))

(is (= ["foo"
        {:a "baz"
         :b "quux"}]
       (get-and-set :a
                    "baz"
                    {:a "foo"
                     :b "quux"})))