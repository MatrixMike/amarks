;; (ns amarks.core)
(comment revived Thursday, 25 October 2018 )
(ns helloworld.core ; namespace def’n

(:gen-class))     ; compilation directive

(defn helloworld
[]
"Hello, world 3")      ; static function

(defn -main   
     "Entrypoint"           ; docstring  ;; the quotes used in ppt are not OK when copied into source file
     [& args]               ; variadic  
     (println (helloworld) ))
     
