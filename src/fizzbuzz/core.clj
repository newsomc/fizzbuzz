(ns fizzbuzz.core)

;; Create a lazy seq of numbers.
(def nums (take 101 (range)))

(defn by-three? [x]
  (= (mod x 3) 0))

(defn by-five? [x]
  (= (mod x 5) 0))

(defn fizz-buzz?
  "Tells us whether to print fizz, buzz or both!"
  [x]
  (cond
   (and (by-three? x) (by-five? x)) (println x " FizzBuzz")
   (by-three? x) (println x " Fizz")
   (by-five?  x) (println x " Buzz")))

(filter fizz-buzz? nums)

(defn check-recur [n]
  (do
    (fizz-buzz? n)
    (check-recur (dec n))))

(check-recur 100)
