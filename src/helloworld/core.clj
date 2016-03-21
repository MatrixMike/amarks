;; (ns amarks.core)

(ns helloworld.core ; namespace def’n

(:gen-class))     ; compilation directive

(defn helloworldfn
[]
"Hello, world")      ; static function

(defn -main    ; docstring
    ;; “Entrypoint”          ; variadic
     [& args]
     (println (helloworldfn))
     )
