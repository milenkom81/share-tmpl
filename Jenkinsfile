node {
    
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/milenkom81/java-maven-junit-helloworld.git'
   }

   stage('Compile'){
       if (isUnix()){
          sh '$MAVEN_HOME/mvn compile' 
       } else {
           bat(/call mvn clean compile/)
       }
   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
         sh '$MAVEN_HOME/mvn package'
      } else {
         bat(/call mvn package/)
      }
   }
    stage('Test') {
        if (isUnix()){
      sh '$MAVEN_HOME/mvn surefire-report:report'
      junit '**/target/surefire-reports/TEST-*.xml'
        } else {
        bat (/call mvn surefire-report:report/)
        junit '**/target/surefire-reports/TEST-*.xml'
        }
   }
   stage('Tomcat Deploy') {
       if (isUnix()){
       sh '$MAVEN_HOME/mvn tomcat7:redeploy'
   } else {
       bat (/call mvn tomcat7:redeploy/)
   }
   }
}