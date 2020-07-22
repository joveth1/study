1.String,StringBuilder,StringBuffer 区别
String:内部是 final char[] 数组结构，一旦初始化之后不可能再变，字符串的拼接主要是通过ArrayCopyof方法创建新的数组并给新的String
StringBuilder和StringBuffer都是可变的char数组，不同的是StringBuffer里面的方法是用synchronized 加锁

2.重载和重写
重载 overloading  针对同一个类，方法名称相同，参数类型不同
重写 override  针对子类重写父类方法，名称相同，参数相同，返回类型相同

3.Object对象有哪些方法
toString(),equals(),hashcode(),clone(),wait(),notify(),getClass()

4.方法是值传递？
java只有值传递，针对于引用类型，是将引用的地址作为值传递了，所以修改对象里面的属性时导致外部的对象发生变化，不希望改变的话就用深拷贝

5.hashcode和equals方法
重写equals方法一般同时重写hashcode方法，但不是必须，如果是放在散列表中则必须要重写hashcode

6.基本类型
byte：1byte=8bit
short：1short=2byte=16bit
int：1int=4byte=32bit
long：1long=8byte=64bit
float:1int=4byte=32bit
double:1double=8byte=64bit
char:1char=2byte=16bit
boolean:1bit


Java NIO 核心
1.Buffer
2.Channel
3.Selector
