# Messagic
High level API for reliable message passing

+ send messages between two peers over any reliable transport protocol (such as standard I/O, TCP, websockets over HTTP)
+ implementations in Java and JavaScript

When to use?
============

+ when you want to use different transport protocols without changing your code

Use case
========

+ I use this project myself in a computer game which can be played in the browser or downloaded as a desktop application. Different transport protocols are used for different clients - web client uses websockets, desktop client uses standard I/O.

Implementations
===============

+ Java: [messagic-java on GitHub](https://github.com/jacekolszak/messagic-java)
+ JavaScript: [messagic-js on GitHub](https://github.com/jacekolszak/messagic-js)
