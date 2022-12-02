package com.intellias.challenge

enum Tree(val maxPrevious: Int):
  case Node(left: Tree, right: Tree) extends Tree(left.maxPrevious.max(right.maxPrevious))
  case Leaf(from: Int, until: Int, override val maxPrevious: Int) extends Tree(maxPrevious)
