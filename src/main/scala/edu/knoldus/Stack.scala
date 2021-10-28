package edu.knoldus

trait Stack[A] {
  def push(x: A): Unit
  def pop(): A
  def top: A
  def isEmpty: Boolean
}
