# Messagic
High level API for asynchronous message passing

+ send and receive messages in order between two peers over any reliable transport protocol (such as standard I/O, TCP, websockets etc.)
+ implementations in [Java](https://github.com/jacekolszak/messagic-java) and [JavaScript](https://github.com/jacekolszak/messagic-js)

When to use?
============

+ when you want to use different transport protocols without changing your code
+ when you want to unit test your code without starting real servers (such as web servers)

Use case
========

+ I use this project myself in a computer game which can be played in the browser or downloaded as a desktop application. Different transport protocols are used for different clients - web client uses websockets, desktop client uses standard I/O.

Implementations
===============

+ Java: [messagic-java on GitHub](https://github.com/jacekolszak/messagic-java)
+ JavaScript: [messagic-js on GitHub](https://github.com/jacekolszak/messagic-js)

Chat
====

[![Gitter](https://badges.gitter.im/jacekolszak/messagic.svg)](https://gitter.im/jacekolszak/messagic?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
