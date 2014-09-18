;; atoms


; example 1
(def apple-price (atom nil))

(defn update-apple-price
  [new-price]
  (reset! apple-price new-price))

@apple-price

(update-apple-price 300.00)

@apple-price

; example 2

(def uniq-id (atom 0))

(defn get-next [] (swap! uniq-id inc)) ; attempts compare-and-set under the hood

(get-next)


; snippet showing seamless inc on atom - from "The Joy of Clojure"
(import '(java.util.concurrent Executors))

(def *pool* (Executors/newFixedThreadPool
  (+ 2 (.availableProcessors (Runtime/getRuntime)))))

(defn dothreads [f & {thread-count :threads exec-count :times :or {thread-count 1 exec-count 1}}]
  (dotimes [t thread-count]
    (.submit *pool* #(dotimes [_ exec-count] (f)))))

(def ticks (atom 0))
(defn tick [] (swap! ticks inc))
(dothreads tick :threads 1000 :times 100)

@ticks

;; refs - similar to atoms, but they also participate in coordinated updates

; example 1
(def active-orders (ref #{2 3 4}))

(def cancelled-orders (ref #{1}))


(defn cancel-order [id]
(dosync
  (commute active-orders disj id)
  (commute cancelled-orders conj id)))

(cancel-order 2)

@active-orders
@cancelled-orders

; example 2

(def uid (ref 0))
(def used-id (ref []))
(defn use-id []
(dosync
  (commute uid inc)
  (commute used-id conj @uid)))
(dothreads use-id :threads 10 :times 10)
@used-id

; switch commute to alter


;; agents
