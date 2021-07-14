## switch语句

```java
	switch语句格式：
		switch(表达式) {
			case 值1:
				语句体1;
				break;
			case 值2:
				语句体2;
				break;
			...
			default:
				语句体n+1;
				break;
		}
		
```

### 格式的解释：

switch: 表示这是switch选择结构

表达式：这个地方的取值时有限定的

byte,short,int,char

jdk5以后可以是枚举；jdk7之后可以是字符串

case: 后面跟的是要和变大时进行比较的值

语句体： 要执行的代码

break：表示中断

default: 当所有的值都和表达式不匹配是，就执行default控制的语句

>面试题：byte可以作为switch的表达式吗？long可以作为switch的表达式吗？String可以作为switch的表达式吗？

中间的break省略可能会造成case穿透

default可以放在任意位置。但是建议放到最后 

switch语句的结束条件：a：遇到break结束。b：执行到末尾结束

## while循环

