#!/usr/bin/env groovy
// vars/checkOut.groovy

<<<<<<< HEAD

package org.helloworld
class checkOut {
  def checkOut (args) {
    git 'https://github.com/milenkom81/java-maven-junit-helloworld.git'
  }
=======
def call(String repo = 'repo') {
	git '${repo}'
>>>>>>> branch 'master' of https://github.com/milenkom81/share-tmpl.git
}