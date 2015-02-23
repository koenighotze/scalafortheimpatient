package com {
  package horstman {
    class Inner {

    }

    package impatient {
      class Bar {
        println(classOf[Bar])

        // no import needed
        val i = new Inner()
      }
    }
  }
}


