(ns Solutions)

;; #1: Nothing but the Truth
true

;; #2: Simple Math
4

;; #3: Intro to Strings
"HELLO WORLD"

;; #4: Intro to Lists
:a :b :c

;; #5: Lists: conj
'(1 2 3 4)

;; #6: Intro to Vectors
:a :b :c

;; #7: Vectors: conj
[1 2 3 4]

;; #8: Intro to Sets
#{:a :b :c :d}

;; #9: Sets: conj
2

;; #10: Intro Maps
20

;; #11: Maps: conj
{:b 2}

;; #12: Intro to Sequences
3

;; #13: Sequences: rest
[20 30 40]

;; #14: Intro to Functions
8

;; #15: Double Down
(fn double-num [x] (* x 2))

;; #16: Hello World
(fn greeting [x] (str "Hello, " x "!"))

;; #17: Sequences: map
'(6 7 8)

;; #18: Sequences: filter
'(6 7)

;; #19: Last Element
(comp first reverse)

;; #20: Penultimate Element
(comp first (comp rest reverse))

;; #21: Nth element

;; Recursive solution
(fn [coll n]
  (if (zero? n)
    (first coll)
    (recur (rest coll) (dec n))))

;; Using the library
#(first (drop %2 %1))


;; #22: Count a sequence

;; Recursive count method
(defn my-count [coll]
  (cond
    (empty? coll)
    0
    :else (inc (my-count (rest coll)))))

;; Recursive solution using loop and recur
(fn [coll]
  (loop [coll coll
         acc 0]
    (if (empty? coll)
      acc
      (recur (rest coll) (inc acc)))))


;; Using the library
(fn [coll]
  (reduce + (map (fn [x] x 1) coll)))

;; #23: Reverse a sequence

;; Recursive solution
(fn [coll]
  (loop [coll coll
         acc (empty coll)]
    (if (empty? coll)
      acc
      (recur (rest coll) (cons (first coll) acc)))))

;; Using the library
into ()


;; #24: Sum It All Up
#(reduce + %)


;; #25: Find the odd numbers

;; Recursive solution
(fn [coll]
  (loop [coll coll
         acc (empty coll)]
    (if (empty? coll)
      (sort acc)
      (if (odd? (first coll))
        (recur (rest coll) (cons (first coll) acc))
        (recur (rest coll) acc)))))

;; Using the library
(fn [coll]
  (filter #(odd? %) coll))

;; Shorter version
#(filter odd? %)


;; #26: Fibonacci Sequence
(fn [n]
  (take n ((fn fib [a b]
             (lazy-seq (cons a (fib b (+ a b))))) 1 1)))


;; #27: Palindrome Detector
(fn [coll]
  (if (empty? coll)
    true
    (if (= (first coll) (last coll))
      (recur (drop 1 (drop-last coll)))
      false)))

;; 28: Flatten a Sequence

;; Recursive solution
(fn my-flatten [coll]
  (if (empty? coll)
    '()
    (if (coll? (first coll))
      (concat (my-flatten (first coll)) (my-flatten (rest coll)))
      (cons (first coll) (my-flatten (rest coll))))))

;; Using the library
(fn my-flatten [coll]
  (if (coll? coll)
    (mapcat my-flatten coll)
    (list coll)))


;; 29: Get the Caps

(fn [word]
  (apply str (filter #(Character/isUpperCase %) word)))














