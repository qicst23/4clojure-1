; Replicate a Sequence

(def p033 ["(= (__ [1 2 3] 2) '(1 1 2 2 3 3))"
           "(= (__ [:a :b] 4) '(:a :a :a :a :b :b :b :b))"
           "(= (__ [4 5 6] 1) '(4 5 6))"
           "(= (__ [[1 2] [3 4]] 2) '([1 2] [1 2] [3 4] [3 4]))"
           "(= (__ [44 33] 2) [44 44 33 33])"])

(def s033 "#(mapcat (partial repeat %2) %)")