(.toUpperCase "By Bluebeard's bananas!")

(.indexOf "Let's synergize our bleeding edges" "y")
(macroexpand-1 '(.indexOf "Let's synergize our bleeding edges" "y"))

(. java.lang.Math abs -3)

(let [stack (java.util.Stack.)]
  (.push stack "Latest episode of Game of Thrones, ho!")
  stack)


(doto (java.util.Stack.)
  (.push "Latest episode of Game of Thrones, ho!")
  (.push "Whoops, I meant 'Land, ho!'"))

(macroexpand-1 '(doto (java.util.Stack.)
  (.push "Latest episode of Game of Thrones, ho!")
  (.push "Whoops, I meant 'Land, ho!'")))

(System/getProperty "user.dir")

(let [s (java.io.StringWriter.)]
  (spit s "- capture cerynian hind like for real")
  (.toString s))

(spit "/tmp/asd" "qweqweqwe")
