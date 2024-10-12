(ns app
  (:require
   ["preact/hooks" :refer [useState]]))

(defn App []
  (let [[count set-count] (useState 0)]
    #jsx [:div
          [:h1 "Hello, world!"]
          [:p "Count: " count]
          [:button {:onClick #(set-count (inc count))} "Increment"]]))
