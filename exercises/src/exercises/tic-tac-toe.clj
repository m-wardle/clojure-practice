(def game-board
  {:a [nil :x :o]
   :b [nil nil :x]
   :c [:o nil nil]})

(defn count-turns
  [board]
  (+ (count (filter some? (board :a)))
     (count (filter some? (board :b)))
     (count (filter some? (board :c)))))

(filter some? (game-board :a))

(count-turns game-board)

; Provided solution

(def game-state
  {:current-player "X"
   :board [nil "X" "O" nil nil "X" "O" nil nil]
   :history [{:player "X"
              :location 1}
             {:player "O"
              :location 2}
             {:player "X"
              :location 5}
             {:player "O"
              :location 6}]})

(defn moves-played [state] (count (state :history)))

(defn moves-played-alt [state] (count (remove nil? (state :board))))

(moves-played game-state)

(moves-played-alt game-state)