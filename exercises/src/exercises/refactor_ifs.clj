(defn process-value
  [value]
  (if (and (number? value) (> value 10))
    :pretty-big
    (if (and (number? value) (< value 0))
      :negative
      (if (and (number? value) (zero? value))
        :zero
        (if (number? value)
          :small-number
          (if (string? value)
            :a-string
            :something-else))))))

(defn process-value-ref
  [value]
  (cond
    (string? value) :a-string
    (not (number? value)) :something-else
    (zero? value) :zero
    (> value 10) :pretty-big
    (< value 0) :negative
    :else :small-number))

(process-value-ref 112)