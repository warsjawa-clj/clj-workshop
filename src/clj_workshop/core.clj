(ns clj-workshop.core)

(+ 1 2)

(println "Hello world!") ; check console Luke

(str "Hello world!")

;; Literals

(def x 1)

x

(type x)

(type 1.1)

(type 5N)

(type "warsjawa")

(type #"[a-z]")

(type true)

(type nil)

(nil? nil)

(= false nil)

(def a-keyword :key)
(type :key)

(type 'str)

;; Data types

; Lists
(def l '(1 2 3))

l

(type l)

; Vectors
(def v [1 2 3])

v

(type v)

(v 0)

(get v 0)

; Maps
(def m {:a 1 :b 2})

m

(conj m {:c 3})

m

(:a m)

(get m :a)

; Nested Maps

(def nested-map {:version {:minor 1 :major 6}})

(get-in nested-map [:version :major])

(zipmap [:foo :bar :baz] [1 2 3])

; Sets
(def s #{:cat :dog :bird})

s

(type s)

(contains? s :cat)

(s :cat)

(s :cow)

(true? (s :cow))

;; Functions

(type +)

(clojure.repl/source +)

(defn f
  "some fun"
  [x]
  (inc x))

(f 2)

(clojure.repl/doc f)

(map f [1 2 3])

(map (fn [x] (inc x)) [1 2 3])

; Closures
(map #(inc %) [1 2 3])

(defn half
  ([]  1/2)
  ([x] (/ x 2)))

(half)

(half 5)

(type (half 5))

(double (half 5))

; lazy evaluation
(iterate inc 0)
(def large-seq (lazy-seq (iterate inc 0)))
