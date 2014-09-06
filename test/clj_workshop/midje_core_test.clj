(ns clj-workshop.midje-core-test
  (:require [midje.sweet :refer :all]
            [clj-workshop.core :refer :all]))

(facts "about crazy-fun"
  (fact (crazy-fun 1 2) => 4)
  (fact (crazy-fun nil 2) => (throws java.lang.RuntimeException)))

(defn more-crazy-fun [x]
  (crazy-fun nil (+ x 1)))

(facts "about more-crazy-fun"
  (fact (more-crazy-fun 1) => 4
    (provided (crazy-fun nil 2) => 4)))

