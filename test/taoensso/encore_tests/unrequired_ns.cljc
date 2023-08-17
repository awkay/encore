(ns taoensso.encore-tests.unrequired-ns
  "A namespace not required by any of the others,
  for testing auto-requiring resolves, etc.")

(def myvar #?(:clj "foreign clj var" :cljs "foreign cljs var"))
(def myvar-embeddable   {:embeddable? true, :foo :bar})
(def myvar-unembeddable {:embeddable? false, :fn (fn [])})
