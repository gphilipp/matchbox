(ns matchbox.utils-test
  #+cljs (:require-macros
          [cemerick.cljs.test :refer [deftest is testing]])
  (:require #+cljs [cemerick.cljs.test :as t]
            #+clj [clojure.test :as t :refer [deftest is testing]]
            [matchbox.utils :as utils]))

(deftest kebab->underscore-test
  (is (= "a_cromulent_name" (utils/kebab->underscore :a-cromulent-name))))

(deftest underscore->kebab-test
  (is (= :a-tasty-skewer (utils/underscore->kebab "a_tasty_skewer"))))

(deftest korks->path-test
  (is (= nil   (utils/korks->path nil)))
  (is (= ""    (utils/korks->path "")))
  (is (= ""    (utils/korks->path [])))
  (is (= "a"   (utils/korks->path :a)))
  (is (= "a"   (utils/korks->path ["a"])))
  (is (= "a/b" (utils/korks->path "a/b")))
  (is (= "a/b" (utils/korks->path [:a :b]))))

