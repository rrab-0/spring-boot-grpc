package org.example.server.services;

import org.example.grpc.HelloRequest;
import org.example.grpc.HelloResponse;
import org.example.grpc.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase{
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        HelloResponse reply = HelloResponse.newBuilder()
                .setMessage("request completed for id: " + request.getId())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
