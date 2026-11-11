# Java 多线程练习

跟练黑马 JavaSE 多线程章节的代码，覆盖 **线程创建的三种方式 → 线程安全 → 生产者消费者模型**。

## 目录

### case1 —— 创建线程的三种方式

| 类 | 内容 |
|---|---|
| `MyThread` / `Demo1` | 继承 `Thread`，重写 `run()`，直接 `start()` |
| `MyRun` / `Demo2` | 实现 `Runnable`，作为参数交给 `Thread` 执行 |
| `Mycallable` / `Demo3` | 实现 `Callable`，用 `FutureTask` 包装后交给 `Thread`，通过 `ft.get()` 拿返回值 |

### case2 —— 线程安全

| 类 | 内容 |
|---|---|
| `Demo1` | 三个窗口（三个线程）同时卖同一批票 |
| `MyThread` | `while (true)` 循环里用 `synchronized` 同步代码块保护卖票逻辑，避免超卖和重票 |

### JUC —— 生产者消费者

| 类 | 内容 |
|---|---|
| `MyThread` | 入口，启动生产者线程（`cook`）和消费者线程（`foodie`） |
| `desk` | 共享资源：`foodFlag`（是否有食物 0/1）、`count`（总数）、`lock`（锁对象） |
| `cook` | 生产者，在 `synchronized` 中用 `wait()` 等待、`notify()` 唤醒 |
| `foodie` | 消费者，同样用 `wait()` / `notify()` 与生产者交替执行 |

## 说明

- 环境：JDK 21，IntelliJ IDEA。
- `.idea/`、`*.iml`、`out/` 不纳入版本管理。
- 每个包里的 `Demo` / `MyThread` 都带 `main` 方法，右键直接运行。多线程程序的输出顺序每次不同，属正常现象。
