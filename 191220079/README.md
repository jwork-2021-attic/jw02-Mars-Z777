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

   [![asciicast](https://asciinema.org/a/437824.svg)](https://asciinema.org/a/437824)

   


## 任务三

将上一任务中自己写的代码，改为“蛇精指挥256个小妖怪站成一个16x16方阵“的场景。要求：

1. 对上一任务中代码的修改应尽量小；
2. 每个小妖怪具有一种独特的颜色；
3. 初始状态下小妖怪随机站成16x16方阵；
4. 实现至少两种排序算法，将小妖怪按其颜色值排序；
5. 如示例代码一样将排序过程可视化；
6. 在自己的`Readme.md`中画出相应类图，并添加可视化结果展示链接。
