# MUltithreading task
Threads task

1)	See and try the SumThread example below- be ready to explain it
2)	Write a class called MaxValue that finds the maximum value in an array of ints using ThreadPool of 4 threads (use the executor to manage them). Your main should be similar as the one in the below SumThread example, though you should construct your array of random numbers instead of increasing numbers. You may assume in your threaded code that the array has at least 4 elements.
3)	Write a class called ReverseHello that creates a thread (let's call it Thread 1). Thread 1 creates another thread (Thread 2); Thread 2 creates Thread 3; and so on, up to Thread 50. Each thread should print "Hello from Thread <num>!", but you should structure your program such that the threads print their greetings in reverse order.
4)	Create 3 threads. Threads must access and change one primitive variable, one Atomic variable, synchronized and unsynchronized method. 
5)	*Create and run the same thread using a lambda expression and access the atomicInteger variable with updateAndGet() (for example) method also via lambdas)
** You can choose – which task to do: 4 either 5; 
