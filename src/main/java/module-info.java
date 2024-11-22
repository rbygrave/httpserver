module robaho.httpserver {
    exports robaho.net.httpserver;
    exports robaho.net.httpserver.extras;
    exports robaho.net.httpserver.websockets;

    requires java.logging;
    requires java.net.http;
    requires jdk.httpserver;

    provides com.sun.net.httpserver.spi.HttpServerProvider with robaho.net.httpserver.DefaultHttpServerProvider;
}
