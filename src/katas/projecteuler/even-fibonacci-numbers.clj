(ns katas.projecteuler
  (:require [clojure.test :refer :all]))

(defn fibonacci-numbers [n] (loop [until n
                                   left-term 1
                                   right-term 2
                                   seq (conj [] 1)]
                               (if (> right-term until)
                                 seq
                                 (recur until right-term (+ left-term right-term) (conj seq right-term)))
                               ))

(defn sum-of-even-fibonacci-numbers-until [n] (->> (fibonacci-numbers n)
                                                   (filter even?)
                                                   (reduce +)))

(testing "even fibonacci numbers https://projecteuler.net/problem=2"
  (is (= [1 2 3 5 8] (fibonacci-numbers 10)))
  (is (= 10 (sum-of-even-fibonacci-numbers-until 10))))

(sum-of-even-fibonacci-numbers-until 4000000)
