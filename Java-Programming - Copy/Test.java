// 1 : class extends another class

class Demo
{}
class Hello extends Demo
{}

// 2 : class implements interface

interface Demo
{}
class Hello implements Demo
{}

// 3 : class extends class and implements interface

class Marvellous
{}
interface Demo
{}
class Hello extends Marvellous implements Demo
{}

// 4 : class implements multiple interfaces

interface Demo
{}
interface Hello
{}
class Marvellous implements Demo , Hello
{}

// 5 : interface extends enterface

interface Demo
{}
interface Hello extends Demo
{}