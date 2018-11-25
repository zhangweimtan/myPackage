修饰符--权限
            类       成员变量        成员方法        构造方法
public      Y           Y               Y              Y
default     Y           Y               Y               Y
protected   N           Y               Y               Y //为子类提供，不能修饰类
private     N           Y               Y               Y//当前
abstract    Y           N               Y               N//
static      N           Y               Y               N//
final       Y           Y               Y               N//

根据需求而定，常见规则
    类，以后使用public来修饰类，一个Java文件中只能有一个类，如果一个文件中，有多个类，类名与文件名相同，必须用public修饰，其他类不能使用public修饰
    以后所有变量，都是用private修饰，——成员变量，提供get-set方法
    以后所有方法，使用public修饰；
    以后所有的构造方法，使用public修饰，如果不想让创建对象，private修饰；


