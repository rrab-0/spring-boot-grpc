// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PersonService.proto

package org.example.grpc.person;

public interface CreatePersonResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.grpc.person.CreatePersonResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>.org.example.grpc.person.Detail details = 3;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <code>.org.example.grpc.person.Detail details = 3;</code>
   * @return The details.
   */
  org.example.grpc.person.Detail getDetails();
  /**
   * <code>.org.example.grpc.person.Detail details = 3;</code>
   */
  org.example.grpc.person.DetailOrBuilder getDetailsOrBuilder();
}