// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface TopicOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.Topic)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the topic. It must have the format
   * `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
   * underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
   * signs (`%`). It must be between 3 and 255 characters in length, and it
   * must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the topic. It must have the format
   * `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter,
   * and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`),
   * underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent
   * signs (`%`). It must be between 3 and 255 characters in length, and it
   * must not start with `"goog"`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * See &lt;a href="/pubsub/docs/labels"&gt; Creating and managing labels&lt;/a&gt;.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 2;</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Policy constraining how messages published to the topic may be stored. It
   * is determined when the topic is created based on the policy configured at
   * the project level. It must not be set by the caller in the request to
   * CreateTopic or to UpdateTopic. This field will be populated in the
   * responses for GetTopic, CreateTopic, and UpdateTopic: if not present in the
   * response, then no constraints are in effect.
   * </pre>
   *
   * <code>.google.pubsub.v1.MessageStoragePolicy message_storage_policy = 3;</code>
   */
  boolean hasMessageStoragePolicy();
  /**
   * <pre>
   * Policy constraining how messages published to the topic may be stored. It
   * is determined when the topic is created based on the policy configured at
   * the project level. It must not be set by the caller in the request to
   * CreateTopic or to UpdateTopic. This field will be populated in the
   * responses for GetTopic, CreateTopic, and UpdateTopic: if not present in the
   * response, then no constraints are in effect.
   * </pre>
   *
   * <code>.google.pubsub.v1.MessageStoragePolicy message_storage_policy = 3;</code>
   */
  com.google.pubsub.v1.MessageStoragePolicy getMessageStoragePolicy();
  /**
   * <pre>
   * Policy constraining how messages published to the topic may be stored. It
   * is determined when the topic is created based on the policy configured at
   * the project level. It must not be set by the caller in the request to
   * CreateTopic or to UpdateTopic. This field will be populated in the
   * responses for GetTopic, CreateTopic, and UpdateTopic: if not present in the
   * response, then no constraints are in effect.
   * </pre>
   *
   * <code>.google.pubsub.v1.MessageStoragePolicy message_storage_policy = 3;</code>
   */
  com.google.pubsub.v1.MessageStoragePolicyOrBuilder getMessageStoragePolicyOrBuilder();
}