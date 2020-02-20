(ns exercises.file-reverser
  (:require [clojure.string :as string]))

(defn file-reverser
  [path]
  (->> (slurp (str "src/exercises/" path))
       (string/reverse)
       (apply str)
       (spit (str "src/exercises/" "rev-" path))))

(file-reverser "file-reverser-test.txt")