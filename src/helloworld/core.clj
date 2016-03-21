;; (ns amarks.core)

(ns helloworld.core ; namespace def’n

(:gen-class))     ; compilation directive

(defn helloworld
[]
"Hello, world 2")      ; static function

(defn -main   
     "Entrypoint"           ; docstring
     [& args]               ; variadic  ;; the quotes used in ppt are not OK when copied into source file
     (println (helloworld))
     )
