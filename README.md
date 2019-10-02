# xiaojing
Java中方法的传参都是值传递
字符串比较，用equals，不用==

String在栈里，存的是常量池里的字串的地址
String的==比较的是String的地址
String的equals比较的是String的具体的值

局部变量（方法内）：堆内，无默认值
成员变量（类内，方法外）：栈中，有默认值（int 0， String null, boolean false)

Java中的对象和数组都是通过引用对其进行操作的
引用可以理解为一种受限的指针
指针是可以进行与整数做加减运算的，两个指针之间也可以进行大小比较运算和相减运算。引用不行，只能进行赋值运算。
引用就是一个变量或对象的别名（引用的本质是一个对象）；指针是一个段内存空间的地址（指向存储一个变量值的空间或一个对象的空间）

栈：
存放局部变量
先进后出，自下而上存储
方法执行完毕，自动释放空间
堆：
存放new出来的对象
需要垃圾回收器来回收：System.gc()
方法区：
存放类的信息（代码），static变量，字符串常量等

在创建完类之后，如果没有手动创建构造方法，会有一个默认的无参的构造方法供调用
当用户自定义构造方法后，默认的无参构造方法就不能够使用了，必须要手动定义无参构造方法

this在heap里，表示的当前对象本身（当前对象引用）
this 的用处
构造方法，当构造方法中的参数与成员变量一样时，使用this指向成员变量
当多个普通方法之间需要调用时，可以使用this来进行调用，指的是当前对象的其他方法
当构造方法中需要调用其他的构造方法时，直接this()，相当于this.构造方法名()调用其他构造方法，但是必须放在第一行
类变量或静态变量可以用对象名调用，也可以用类名调用
static变量放在方法区中静态区，成员变量放在堆中
static变量不能定义在成员方法中
static修饰方法的时候，表示静态方法或类方法
static变量也不能定义在static方法中
static方法可以在非静态方法中进行调用

一般工具类中的方法定义为static，其他地方用得很少

代码块
普通代码块
构造代码块
               定义在类中{}括起来的代码块是构造代码块
               构造代码块和构造方法谁先执行？（构造代码块先执行，构造方法后执行）
               每次代码运行的时候，会把构造代码块的代码添加到构造代码的前面
                构造代码块中的代码会添加到每一个构造方法中，当使用this()的时候不会添加
静态代码块
               使用static{}的代码块称为静态代码块，在程序载入的时候优先执行
               如数据库连接等其他提前需要准备好的代码，会放在static代码块中
同步代码块
               在多线程的时候会使用，用来给共享空间进行加锁操作
执行顺序：静态代码块——>构造代码块——>普通代码块

lang包不需要手动导入，会自动加在
util工具包
静态导包：

属性和方法的访问权限
public：公共，当前项目的所有类都可以进行访问
protected: 受保护的，可以被当前类访问，可以被当前包访问，可以被子类访问
default：默认，可以被当前类访问，可以被当前包访问
private：私有，只能被当前类访问

类的访问权限，只有public和default