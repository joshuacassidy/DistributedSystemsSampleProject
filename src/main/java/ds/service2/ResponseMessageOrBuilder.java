// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service2.proto

package ds.service2;

public interface ResponseMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:service2.ResponseMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string message = 1;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 1;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>bool success = 2;</code>
   */
  boolean getSuccess();

  /**
   * <code>int32 status = 3;</code>
   */
  int getStatus();
}
