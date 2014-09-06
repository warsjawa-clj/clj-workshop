(ns clj-workshop.core)

(+ 1 2)

(println "Hello world!")

(str "Hello world!")

;; Literals

(def x 1)

x

(class x)

(def y 1.0)
(class y)

(def a-keyword :key)
(class :key)

;; Data types

(def v [1 2 3])

v

(v 0)

(get v 0)

(def m {:a 1 :b 2})

m

(conj m {:c 3})

m

(:a m)

(get m :a)

(def nested-map {:version {:minor 1 :major 6}})

(get-in nested-map [:version :major])

(zipmap [:foo :bar :baz] [1 2 3])

(def s #{:cat :dog :bird})

(contains? s :cat)

(s :cat)

(s :cow)

(true? (s :cow))

;; Functions

(defn f [] (+ 1 2))

(f)

(defn crazy-fun [x y]
  (if (nil? x) (throw (java.lang.RuntimeException. "fail"))
    (* y 2)))

(crazy-fun 1 2)

;; (crazy-fun nil 2)
