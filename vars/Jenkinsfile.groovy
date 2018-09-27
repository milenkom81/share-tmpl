def call(Pipeline) {
node {
   def mvnHome
      stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/milenkom81/hello-world-war.git'
      // Get the Maven tool.
      // ** NOTE: This 'M3' Maven tool must be configured
      // ** in the global configuration.
         }
   stage('Compile'){
       if (isUnix()){
          sh '/opt/maven/bin/mvn compile'
       } else {
           bat(/call mvn compile/)
       }
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh '/opt/maven/bin/mvn package'
      } else {
         bat(/call mvn package/)
      }
   }
    stage('Test') {
        if (isUnix()){
      sh '/opt/maven/bin/mvn surefire-report:report'
      //junit '**/target/surefire-reports/TEST-*.xml'
        } else {
        bat (/call mvn surefire-report:report/)
       // junit '**/target/surefire-reports/TEST-*.xml'}
        }
   }
   stage('Tomcat Deploy') {
       if (isUnix()){
       sh '/opt/maven/bin/mvn tomcat7:redeploy'
   } else {
       bat (/call mvn tomcat7:redeploy/)
   }
   }
}
}
package org.foo;
def checkOutFrom(repo) {
   git url: "git@github.com:jenkinsci/${repo}"
   }

   return this
