val thrill = "Will" :: "fill" :: "until" :: List() // 例では最後に":: Nil"をつけているが、見通しはこの方が何したいかわかる感じがする
println(thrill(2))
println(thrill.count(s => s.length == 4))
println(thrill.drop(2))
println(thrill.dropRight(2))
println(thrill.exists(s => s == "until"))
println(thrill.filter(s => s.length == 4))
println(thrill.forall(s => s.endsWith("l")))
thrill.foreach(s => print(s))
println(thrill.head)
println(thrill.init)
println(thrill.isEmpty)
println(thrill.last)
println(thrill.length)
val thrill2 = thrill.map(s => s + "y")
thrill2.foreach(s => println(s))

val thrill3 = thrill.mkString(", ")
println(thrill3)

val thrill4 = thrill.filterNot(s => s.length == 4) // removeはscala 2.11にはない
thrill4.foreach(s => println(s))

val thrill5 = thrill.reverse
thrill5.foreach(s => println(s))

// val thrill6 = thrill.sortWith(_.compareTo(_) < 0)
// thrill6.foreach(s => println(s))

println(thrill.tail)
