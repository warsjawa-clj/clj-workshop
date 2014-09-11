(ns clj-workshop.stdlib)

;; collections

(map inc [1 2 3])

(reduce + [1 2 3])

(reduce + 10 [1 2 3])

(map + [1 1] [2 2] [3 3])

(range 10)

(take 5 (repeat 10))

(take 45 (cycle [1 2 3]))

(take-while pos? [3 2 1 0 -1 -2 10])

(filter pos? [1 5 -4 -7 3 0])

(remove nil? [1 nil :apple])

(into {} [[:foo 1] [:bar 2] [:baz 3]])

(into [] (range 10))

(first [1 2 3])

(rest [1 2 3])

(empty? [])

(empty? nil)

(seq [])

(seq nil)

;; flow

(defn f [x]
  (if x
    "true"
    "false"))

(f 0)

(f "")

(f {})

(f nil)

(f false)

(cond
  nil "Not going to return this"
  false "Nope not going to return this either"
  "" "Maybe this"
  :else "Default case")

(when x
  (println "x is true")
  (println "x is still true"))

(if x
  (do (println "x is true")
      (println "x is still true")))

(def x 2)

(let [x 3]
  (+ x 3))

;; useful constructs

(take 5
      (map (fn [pair]
             (+ (first pair) (second pair)))
           (partition 2 1
                      (filter even?
                              (take 100
                                    (iterate inc 0))))))

(->> 0
  (iterate inc)
  (take 1000)
  (filter even?)
  (partition 2 1)
  (map (fn [pair]
        (+ (first pair) (second pair))))
  (take 5))


(def c 5)

(- (/ (+ 3 c) 2) 1)

(-> c (+ 3) (/ 2) (- 1))

(doto
  (new java.util.HashMap)
  (.put :a 1)
  (.put :b 2))

(or (System/getProperty "x") "default")

