package com.intellias.challenge

trait ScanInterface {

  /** Input: the given part of the array and returns the maximum value.
   * from - inclusive
   * until - non-inclusive
   */
  def sequentialUpsweep(input: Array[Int], from: Int, until: Int): Int

  /** Traverses the part of the array starting at `from` and until `until`, and
   * returns the reduction tree for that part of the array.
   *
   * The reduction tree is a `Tree.Leaf` if the length of the specified part of the
   * array is smaller or equal to `threshold`, and a `Tree.Node` otherwise.
   * If the specified part of the array is longer than `threshold`, then the
   * work is divided and done recursively in parallel.
   */
  def upsweep(input: Array[Int], from: Int, until: Int, threshold: Int): Tree

  /** Traverses the part of the `input` array starting at `from` and until
   * `until`, and computes the maximum value for each entry of the output array,
   * given the `startingValue`.
   */
  def sequentialDownsweep(input: Array[Int], output: Array[Int], startingValue: Int, from: Int, until: Int): Unit

  /** Pushes the maximum value in the prefix of the array to each leaf of the
   * reduction `tree` in parallel, and then calls `downsweepSequential` to write
   * the `output` values.
   */
  def downsweep(input: Array[Int], output: Array[Int], startingValue: Int, tree: Tree): Unit

  /** Scans left on a given input array and output a new array 
   * consisting of the maximum values to the left of a given index in
   * the original array in parallel. */
  def scan(input: Array[Int], output: Array[Int], threshold: Int): Unit

}
