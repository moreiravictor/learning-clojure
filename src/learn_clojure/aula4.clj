(ns learn-clojure.aula4)

(def precos [30 500 1000])

(defn sum
  [v]
  (+ v 2))

(println (precos  0))
(println (get precos  2))

(println (conj precos 132))
(println precos)

(println (update precos 0 inc))
(println (update precos 0 dec))
(println precos)

(println (update precos 0 (fn [v] (+ v 321))))

(println (map sum precos))

(println (range 10))
(println (filter (fn [v] (> v 50)) precos))

(println (reduce +  precos))
