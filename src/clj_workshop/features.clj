; destructuring
(defn parse-args
  [[class-to-run arg1 arg2 & rest]]
  (println (str "will run class: " class-to-run))
  (println (str "passing args: " (clojure.string/join ", " '(arg1 arg2))))
  (println (str "omitting: " rest)))

(parse-args ["pl.warsjawa.CljStarter" "arg1" "arg2" "arg3" "arg4" "args5"] )

(defn hello [{:keys [first-name last-name] :or {first-name "unknown" last-name "anonymous"}}]
  (str "hello " first-name " " last-name))

(hello {:first-name "Luke" :last-name "Skywalker"})

(hello {})
