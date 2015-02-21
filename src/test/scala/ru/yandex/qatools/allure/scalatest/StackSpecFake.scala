package ru.yandex.qatools.allure.scalatest

import org.scalatest._
import scala.collection.mutable
import ru.yandex.qatools.allure.annotations.{Features, Title}

@Title("This is a stack fake specification")
@Features(Array("Simple stack fake"))
class StackSpecFake extends FlatSpec {

  "Alala" should "aa" in {
    fail("42")
  }

  "Alala" should "bb" in {
    fail("24")
  }
}
