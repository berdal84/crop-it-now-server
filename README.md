# Crop-it NOW !

Intro
=====

this is the server side of Crop-it NOW !

Client repository is [here](https://github.com/Berdal84/angular-crop-it-now)

WIP
===

This is a work in progress project. For now it only displays data send using a Rest API.

request to : 

http://localhost:8080/crop?name=filename.png&corner1_u=0.15&corner1_v=0.1&corner2_u=0.78&corner2_v=0.8

produces :

CropData: name="filename.png", corner1_u=0,150000, corner1_v=0,100000, corner2_u=0,780000, corner2_v=0,800000 

How to use ?
============

require JDK 8

require Maven 3.6.1

update javac.exe path in pom.xml if needed.

browse to repository root

run ```mvn package``` to generate a jar file (located in target folder).
