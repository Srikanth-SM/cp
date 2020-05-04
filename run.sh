#!/bin/sh
echo $1
cp ./template.java $1.java
sed -e  "s/Watermelon/$1/g" $1.java | tee $1.java
cat $1.java
