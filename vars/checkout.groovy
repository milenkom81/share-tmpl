#!groovy


package org.helloworld
class checkOut implements Serializable {
  def steps
  checkOut (steps) {this.steps = steps}
  def mvn(args) {
    git 'https://github.com/milenkom81/java-maven-junit-helloworld.git'
  }
}