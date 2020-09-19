(ns learn-clojure.aula3)

(def bottom-val 100)

(defn apply-discount?
  [value]
  (> value bottom-val))

(defn discount-value
  [apply? value]
  (if (apply? value)
    (let [discount-tax (/ 10 100)
          discount (* value discount-tax)]
      (println "calculating discount of:" discount)
      (- value discount))
    value))

;;(fn [att] (> att 50)) anonymous function

(println (apply-discount? 1000))
(println (apply-discount? 100))
(println (discount-value apply-discount? 100))