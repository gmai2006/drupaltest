# Auto-generated drupal application from drupal db schema

This application is JEE in the backend using H2 in memory data for testing.  The generated code comes with a docker
build file for generating a docker image

## Instruction
All instructions should be run in a terminal

### Clone the project
```git clone https://github.com/gmai2006/drupaltest.git```

### Format the source code and build the drupaltest
```gradle spotlessApply build copyReact buildAll```

### Create a Docker image that contains Wildfly and the drupaltest WAR file.  You must have Docker installed
```sudo docker build --tag=drupaltest .```

### Run the docker image
```sudo docker run -p 8080:8080 -p 9990:9990 -it drupaltest```

### View the generate application
```http://127.0.0.1:8080/drupaltest/```

### Load data from Excel into the DB
```Initially, the database is empty.  To load the test data from Excel into DB run
http://127.0.0.1:8080/drupaltest/rest/admin/loadata```