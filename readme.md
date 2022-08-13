# DESIGN PATTERNS project

This project contains example implementations of particular design patterns in plain `Java 17`. <br>
Each design patter has its dedicated module. <br>
See the description (`readme.md`) for each module for more information.

## Technical aspects

This section contains technical aspects allowing us to build and run code.

### Prerequisites

`Java` in version `17` along with `Maven` need to be installed.

### Building a project

In order to build a whole project, execute the following command: <br>
`mvn clean package` <br>
The project with all dependencies will be packed within one `jar`.

### Executing program

Execute the following command to run a program: <br>
`java -jar common/target/common-1.0-SNAPSHOT-jar-with-dependencies.jar observer` <br>
Above command executes program with logic for `observer` pattern.

