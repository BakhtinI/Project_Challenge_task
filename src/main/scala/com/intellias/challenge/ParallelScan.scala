package com.intellias.challenge

object ParallelScan extends ScanInterface {
  override def sequentialUpsweep(input: Array[Int], from: Int, until: Int): Int = ???

  override def upsweep(input: Array[Int], from: Int, until: Int, threshold: Int): Tree = ???

  override def sequentialDownsweep(input: Array[Int], output: Array[Int], startingValue: Int, from: Int, until: Int): Unit = ???

  override def downsweep(input: Array[Int], output: Array[Int], startingValue: Int, tree: Tree): Unit = ???

  override def scan(input: Array[Int], output: Array[Int], threshold: Int): Unit = ???
}
