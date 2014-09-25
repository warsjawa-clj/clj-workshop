; destructuring
(defn parse-args
  [[class-to-run arg1 arg2 & rest]]
  (println (str "will run class: " class-to-run))
  (println (str "passing args: " (clojure.string/join ", " '(arg1 arg2))))
  (println (str "omitting: " rest))
)

(parse-args ["pl.warsjawa.CljStarter" "arg1" "arg2" "arg3" "arg4" "args5"] )


; for comprehensions

(for [number [1 2 3]] (* number 2))

(map #(* % 2) [ 1 2 3 ])

(for [number [1 2 3]
      letter [:a :b :c]]
  (str number letter)
  )


; memoization - works only from real REPL

(defn sleepy-identity
  "Returns the given value after 1 second"
  [x]
  (Thread/sleep 1000)
  x)

(sleepy-identity "5")

(sleepy-identity "5")

(def memo-sleep-identity (memoize sleepy-identity))

(memo-sleep-identity "5")
(memo-sleep-identity "5")
(memo-sleep-identity "5")
