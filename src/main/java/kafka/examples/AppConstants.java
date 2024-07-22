package kafka.examples;

class AppConstants {

    private AppConstants() {
    }

    static final String APPLICATIONID = "HelloProducer";
    static final String BOOTSTRAPSERVERS = "localhost:9092,localhost:9093";
    static final String TOPICNAME = "hello-producer-topic";
    static final int NUMEVENTS = 1000000;
}
