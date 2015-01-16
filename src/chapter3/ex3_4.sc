def extract(r: Array[Int]) = r.filter(_ > 0) ++ r.filter(_ <= 0)



val r = Array(-1, 3, 4, -8, 0, 3)

extract(r)