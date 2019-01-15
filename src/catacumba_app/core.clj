(ns catacumba-app.core
  (:gen-class)
  (require [catacumba.core :as ct]
           [catacumba.handlers.misc :as misc]
           [catacumba.handlers.session :as session]))

(defn all
  [context]
  "Hello World!!")

(defn ping
  [context]
  "pong")

(def app
  (ct/routes [[:any (misc/autoreloader)]
              [:any (session/session {:storage :inmemory})]
              [:all "" #'all]
              [:get "ping" #'ping]]))

(defn -main
  [& args]
  (ct/run-server app {:port 8080}))
