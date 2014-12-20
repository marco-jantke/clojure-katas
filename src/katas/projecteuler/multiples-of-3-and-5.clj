(ns katas.projecteuler
  (:require [clojure.test :refer :all]))


(defn multiple-of-3? [x] (= 0 (rem x 3)))
(defn multiple-of-5? [x] (= 0 (rem x 5)))
(defn multiple-of-3-or-5? [x] (or (multiple-of-3? x) (multiple-of-5? x)))
(defn seq-of-multiples-of-3-or-5-below [n] (filter multiple-of-3-or-5? (range 1 n)))
(defn sum-of-muliples-of-3-and-5-below [n] (reduce + (seq-of-multiples-of-3-or-5-below n)))

(testing "sum of multiples of 3 and 5 https://projecteuler.net/problem=1"
  (is (= 23 (sum-of-muliples-of-3-and-5-below 10))))

(sum-of-muliples-of-3-and-5-below 1000)

