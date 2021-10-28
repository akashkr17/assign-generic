package edu.knoldus

class IntStack extends Stack[Int] {

  private var list: List[Int] = Nil

  def push(x: Int): Unit = {
    list = x :: list
  }

  def pop(): Int = {
    val topElement = list.head
    list = list.tail
    topElement
  }

  def top: Int = {
    list.head
  }

  def isEmpty: Boolean = {
    list.isEmpty
  }
}
