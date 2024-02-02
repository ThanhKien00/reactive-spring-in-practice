# Reactive Spring

## Understanding Reactive Programming

_Reactive Programming_ is an asynchronous programming paradigm focused on streams of data, it's functional and declarative in nature. Instead of describe a set of steps that are to 
be performed sequentially, reactive programming involves describing a pipeline (or stream) through which data flows. Rather than requiring the data to be available and processed 
as a whole, a reactive stream processes data as it become available. In fact, the incoming data may be endless.

"_Reactive programs maintain a continuous interaction with their environment, but at a speed which is determined by the environment, not the program itself. Interactive programs work
at their own pace and mostly deal with communication, while reactive programs only work in response to external demands and mostly deal with accurate interrupt handling. Real-time 
programs are usually reactive_" - Gerad Berry.

## Reactive Streams
The _Reactive Streams_ aims to provide a standard for asynchronous stream processing with nonblocking backpressure. Its specification can be summed up by four interface definitions:

- **Publisher**: Provider of a potentially unbounded number of sequenced elements, publishing them according to the demand received from its Subscriber. The Publisher interface
declares a single method, subscribe(), through which a Subscriber can subscribe to the Publisher.
```java
public interface Publisher<T> {
    void subscribe(Subscriber<? super T> subscriber);
}
```

- **Subscriber**: Once a Subscriber has subscribed, it can receive events from the Publisher. Those events are sent via methods on the Subscriber interface. The first event that
Subscriber will receive is through a call to onSubscribe().
```java
public interface Subscriber<T> {
    void onSubscribe(Subscription sub);
    void onNext (T item);
    void onError (Throwable ex);
    void onComplete();
}
```

- **Subscription**:

- **Processor**: represents a processing state which is both a Subscriber and a Publisher and obeys the contracts of both.

```java
public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {}
```
**Notes:** _Backpressure_ 
