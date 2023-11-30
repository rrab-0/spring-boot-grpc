package org.example.server.services;

import io.grpc.stub.StreamObserver;
import org.example.grpc.person.*;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class PersonService extends PersonServiceGrpc.PersonServiceImplBase{
    @Override
    public void createPerson(CreatePersonRequest req, StreamObserver<CreatePersonResponse> resObserver) {
        CreatePersonResponse response = null;

        // Process ID based on track type
        if (req.getId().startsWith("ownunit")) {
            Ownunit ownunit = Ownunit.newBuilder()
                    .setA("hello from ownunit")
                    .build();
            Detail detail = Detail.newBuilder()
                    .setOwnunit(ownunit)
                    .build();

            response = CreatePersonResponse.newBuilder()
                    .setMessage("ownunit created successfully")
                    .setId(req.getId())
                    .setDetails(detail)
                    .build();
        }

        if (req.getId().startsWith("radar")) {
            Radar radar = Radar.newBuilder()
                    .setB("hello from radar")
                    .build();
            Detail detail = Detail.newBuilder()
                    .setRadar(radar)
                    .build();

            response = CreatePersonResponse.newBuilder()
                    .setMessage("radar created successfully")
                    .setId(req.getId())
                    .setDetails(detail)
                    .build();
        }

        if (req.getId().startsWith("adsb")) {
            Adsb adsb = Adsb.newBuilder()
                    .setC("hello from adsb")
                    .build();
            Detail detail = Detail.newBuilder()
                    .setAdsb(adsb)
                    .build();

            response = CreatePersonResponse.newBuilder()
                    .setMessage("adsb created successfully")
                    .setId(req.getId())
                    .setDetails(detail)
                    .build();
        }

        // If response still null, set default message
        if (response == null) {
            response = CreatePersonResponse.newBuilder()
                    .setMessage("nothing was created ")
                    .setId(req.getId())
                    .setDetails(Detail.getDefaultInstance())
                    .build();
        }

        resObserver.onNext(response);
        resObserver.onCompleted();
    }
}
