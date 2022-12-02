package com.intellias.challenge

object SequentialScan {
  def scan(input: Array[Int], output: Array[Int]): Unit = {
    output(0) = input(0)

    (1 until output.length).foreach(i => output(i) = output(i - 1) max input(i))
  }

}
