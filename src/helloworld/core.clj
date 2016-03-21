;; (ns amarks.core)

(ns hello-world.core ; namespace def’n

(:gen-class))     ; compilation directive

(defn hello-worldfn
[]
"Hello, world")      ; static function

(defn -main    ; docstring
    ;; “Entrypoint”          ; variadic
     [& args]
     (println (hello-worldfn))
     )
