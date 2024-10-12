(ns app
  (:require
   ["@chakra-ui/react" :refer [ChakraProvider]]))

;; TODO pre は使えるようなので これで Valibot を実行して malli のように型チェックする仕組みを作る
(defn App [] {:pre [(odd? 1)]}
  #jsx [ChakraProvider
        "Hello"])
