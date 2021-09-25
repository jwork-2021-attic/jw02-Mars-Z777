# 191220079 马润泽

## 任务一
本次作业的`example`提供了一份示例代码，实现了“老爷爷指挥七个葫芦娃按排行顺序站成一队”的场景。请仔细阅读代码并在自己的目录中撰写`Readme.md`，要求：

1. 用plantuml画出example的类图与Scene中main方法执行过程中的对象时序图；

   example类图：

   ![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-Mars-Z777/master/191220079/uml/example_characters.pu)

   example时序图：

   ![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-Mars-Z777/master/191220079/uml/example_timeline.pu)

2. 尝试从面向对象编程角度理解`example`的设计理念，具体阐述这样写的好处与可改进之处（越详细越好）；

   好处：使用Sorter接口并让使用不同排序算法的排序器继承，通过多态可以实现选择不同的排序算法；将Geezer的构造函数私有，并自己设置接口进行创建，保证了Geezer类只能生成一个实例；在数据量较小的情况下，Gourd使用枚举类效率和可读性都更高。

   可改进处：可以将类中声明的变量以及内部类放在最前，避免前面的函数调用的内容声明在后面。



## 任务二

1. 类图：

   ![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-Mars-Z777/master/191220079/uml/task2_characters.pu)

2. 快速排序可视化：

   [![asciicast](https://asciinema.org/a/Dlk5jyfMFkk5lKmkRy279VoBG.svg)](https://asciinema.org/a/Dlk5jyfMFkk5lKmkRy279VoBG)

3. 选择排序可视化：

   [![asciicast](https://asciinema.org/a/89rP6Po70JkBOcQFveOXG5C6k.svg)](https://asciinema.org/a/89rP6Po70JkBOcQFveOXG5C6k)

   


## 任务三

修改代码：将Line类中的Position[] positions和内部类的Linable linable由private改为protected，并添加Line的子类Matrix，具体代码如下：

```java
public class Matrix extends Line {
	
	Matrix(int length){
		super(length);
	}
	
	@Override
    public String toString() {
        String lineString = "";
        int i = 0;
        for (Position p : positions) {
            lineString += p.linable.toString();
            i++;
            if(i % 8 == 0)
            	lineString += "\n";
        }
        return lineString;
    }
	
}
```



1. 类图：

   ![](http://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/jwork-2021/jw02-Mars-Z777/master/191220079/uml/task2_characters.pu)

2. 快速排序可视化：

   [![asciicast](https://asciinema.org/a/437839.svg)](https://asciinema.org/a/437839)

3. 选择排序可视化：

   [![asciicast](https://asciinema.org/a/437840.svg)](https://asciinema.org/a/437840)
