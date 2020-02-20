(ns exercises.file-reverser
  (:require [clojure.string :as string]))

(defn file-reverser
  [dir file]
  (->> (slurp (str dir file))
       (string/reverse)
       (apply str)
       (spit (str dir "rev-" file))))

(file-reverser "src/exercises/" "file-reverser-test.txt")