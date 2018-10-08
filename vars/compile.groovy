#!groovy



class compileCode implements Serializable {
  def steps
  compileCode (steps) {this.steps = steps}
  def mvn(args) {
     steps.sh "${steps.tool 'Maven'}/bin/mvn -o ${args}"
  }
}