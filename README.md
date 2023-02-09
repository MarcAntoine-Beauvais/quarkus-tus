# my-application

| | Version | Configuration |
| ------------- | ------------- | ------------- |
| Java | 17 | [build.gradle](/build.gradle?plain=1#L8-L12) |
| Quarkus! | 2.11.2.Final | [gradle.properties](/gradle.properties?plain=1#L3-L7) |

## Setup using SDKMAN!

```shell script
curl -s "https://get.sdkman.io" | bash                              # Install SDKMAN!
sdk install quarkus 2.11.2.Final                                    # Install Quarkus
sdk install java 22.2.r17-grl                                       # Install GraalVM Java 17
export GRAALVM_HOME=$HOME/.sdkman/candidates/java/22.2.r17-grl/     # Setup environment variable for GraalVM
gu install native-image                                             # Necessary to build native java with GraalVM
sudo apt install build-essential libz-dev zlib1g-dev                # Necessary to build native java with GraalVM
```
