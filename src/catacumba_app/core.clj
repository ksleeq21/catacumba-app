(ns catacumba-app.core
  (:gen-class)
  (require [catacumba.core :as ct]
           [catacumba.handlers.misc :as misc]))

(defn all [context]
  "Hello World!!")

(defn ping [context]
  "pong")

(def app
  (ct/routes [[:any (misc/autoreloader)]
              [:all "" #'all]
              [:get "ping" #'ping]]))

(defn -main
  [& args]
  (ct/run-server app {:port 8080}))
