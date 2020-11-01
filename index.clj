(ns learn-clojure.index)

(if (> 500 5)
  (println "Deu certo")
  (println "Deu errado"))

(def array [20 30 40])

(def pedido {:mochila {:quantidade 10 :preco 10} :cadeira 20})

(println (-> pedido
             :mochila
             :quantidade))
