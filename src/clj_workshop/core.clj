(ns clj-workshop.core)

(+ 1 2)

(println "Hello world!") ; check console Luke

(str "Hello world!")

;; Literals

(def x 1)

x

(type x)

(type 1.1)

(type 0.00005M)

(type 1000000000000000000000N)

(type 1/2)

(str 1/2)

(str (double 1/2))

(type "warsjawa")

(type #"[a-z]")

(type true)

(type nil)

(nil? nil)

(type :key)

(type 'str)

(type 'fn*?!+*)

;; Data types

; Lists
(def l '(1 2 3))

l

(conj l 0)

l

(first l)

(rest l)

(last l)

; Vectors
(def v [1 2 3])

v

(get v 0)

(v 0)

; Maps
(def m {:a 1 :b 2})

m

(get m :a)

(m :a)

(:a m)

; Nested Maps

(def nested-map {:version {:minor 1 :major 6}})

(get-in nested-map [:version :major])

; Sets
(def s #{:cat :dog :bird})

s

(contains? s :cat)

(s :cat)

(s :cow)

;; Functions

(defn f
  "some fun"
  [x]
  (inc x))

(f 2)

(clojure.repl/doc f)

(type f)

(defn half
  ([]  1/2)
  ([x] (/ x 2)))

(half)

(half 4)

(clojure.repl/source +)

(clojure.repl/doc +)

; Closures
((fn [x] (inc x)) 2)

(#(inc %) 2)
