(ns clj-workshop.stdlib)

;; collections

(map inc [1 2 3])

(reduce + [1 2 3])

(reduce + 10 [1 2 3])

(map + [1 1] [2 2] [3 3])

; lazy evaluation
(iterate inc 0)

(def large-seq (lazy-seq (iterate inc 0)))

(range 10)

(take 5 (repeat 10))

(take 45 (cycle [1 2 3]))

; filtering
(take-while pos? [3 2 1 0 -1 -2 10])

(filter even? (iterate inc 0))

(remove nil? [1 nil :apple])

(partition 2 (iterate inc 0))

(partition 2 1 (iterate inc 0))

; construction
(zipmap [:foo :bar :baz] [1 2 3])

(into {} [[:foo 1] [:bar 2] [:baz 3]])

(into [] (range 10))

;; flow

(defn f [x]
  (if x
    "true"
    "false"))

(defn f [z]
  (when x
    (println "x is true")
    (println "x is still true")))

(f 1)

(defn f [y]
  (cond
    (nil? y) "nil"
    (false? y) "false"
    (empty? y) "empty"
    :else "default"))

(f nil)

(f [])

(f [1 2 3])

; scope

(def x 2)

(let [x 3]
  (+ x 3))

x

(let [x 3]
  (def x 4))

x

;; useful constructs

(take 5
  (map (fn [pair]
         (+ (first pair) (second pair)))
    (partition 2
      (filter even?
        (take 100
          (iterate inc 0))))))

(->> 0
  (iterate inc)
  (take 1000)
  (filter even?)
  (partition 2)
  (map (fn [pair]
        (+ (first pair) (second pair))))
  (take 5))


(def c 5)

(- (/ (+ 3 c) 2) 1)
(-> c (+ 3) (/ 2) (- 1))

(- 1 (/ 2 (+ 3 c)))
(->> c (+ 3) (/ 2) (- 1))

; java interop

(new java.util.ArrayList 100)
(java.util.ArrayList. 100)

(def m
  (doto
    (java.util.HashMap.)
    (.put :a 1)
    (.put :b 2)))

m

(get m :b)

;;(m :b)

(System/getProperty "java.home")

(.. System getProperties (get "java.home"))
