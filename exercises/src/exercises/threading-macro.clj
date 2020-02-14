(defn process-number [n] (* (+ (inc (/ n 1.5)) 2) 10))

(defn process-number-ref
  [n]
  (-> n
      (/ 1.5)
      (inc)
      (+ 2)
      (* 10)))

(process-number 5)
(process-number-ref 5)

(defn process-list
  [coll]
  (map (fn [x]
         (* x 10))
       (filter even? (map inc coll))))

(defn process-list-ref
  [coll]
  (->> coll
       (map inc)
       (filter even?)
       (map (fn [x]
              (* x 10)))))

(process-list [2 5 10])
(process-list-ref [2 5 10])