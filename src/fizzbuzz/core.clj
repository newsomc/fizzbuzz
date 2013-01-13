(ns fizzbuzz.core)

;; Create a lazy seq of numbers.
(def nums (take 101 (range)))

(defn by-three? [x]
  (= (mod x 3) 0))

(defn by-five? [x]
  (= (mod x 5) 0))

(defn fizz-buzz
  "Tells us whether to print fizz, buzz or both!"
  [x]
  (cond
   (and (by-three? x) (by-five? x)) (println x " FizzBuzz")
   (by-three? x) (println x " Fizz")
   (by-five?  x) (println x " Buzz")))

;; filter
(defn fizz-buzz-filter [x]
  (filter fizz-buzz nums))

(fizz-buzz-filter nums)

;; TODO: map

;; TODO: reduce/map; reduce/filter

;; doseq
(defn fizz-buzz-doseq [x]
  (doseq [i x]
    (fizz-buzz i)))

(fizz-buzz-doseq nums)

;; loop + recur
(defn fizz-buzz-recur []
(loop [i 1]  
  (when (< i 101)    
    (fizz-buzz i)
    (recur (inc i)))))

(fizz-buzz-recur)




