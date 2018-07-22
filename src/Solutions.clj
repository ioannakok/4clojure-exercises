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

