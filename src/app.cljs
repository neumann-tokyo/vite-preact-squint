(ns app
  (:require
   ["@chakra-ui/react" :refer [ChakraProvider]]))

(defn App []
  #jsx [ChakraProvider
        "Hello"])
