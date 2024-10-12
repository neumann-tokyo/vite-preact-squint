(ns index
  (:require
   ["preact" :refer [render]]
   [app :refer [App]]))

(render #jsx [App] (js/document.getElementById "app"))
