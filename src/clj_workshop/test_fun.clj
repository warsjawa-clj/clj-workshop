(ns clj-workshop.test-fun)

(defn crazy-fun [x y]
  (if (nil? x)
    (throw (java.lang.RuntimeException. "fail"))
    (* y 2)))

(crazy-fun 1 2)

;; (crazy-fun nil 2)
