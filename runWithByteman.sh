#!/bin/bash
java -javaagent:/opt/byteman/lib/byteman.jar=script:src/main/resources/timestamp.btm -classpath src/main/java biz/whatever/Main
