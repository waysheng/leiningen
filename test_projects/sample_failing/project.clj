;; This project is used for leiningen's test suite, so don't change
;; any of these values without updating the relevant tests. If you
;; just want a basic project to work from, generate a new one with
;; "lein new".

(def clj-version "1.1.0-master-SNAPSHOT")

(defproject nomnomnom "0.5.0-SNAPSHOT"
  :dependencies [[~(symbol "org.clojure" "clojure") ~clj-version]])
