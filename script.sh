#!/bin/bash

javac Dictionnaire.java 
javac HTNaive.java
javac HTNaiveMain.java
javac ListeBigI.java
javac Maillon.java

echo "Vos programmes sont compilés"
echo "Lancement du programme de test"

java HTNaiveMain
