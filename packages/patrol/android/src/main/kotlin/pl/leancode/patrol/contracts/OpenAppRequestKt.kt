//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: contracts.proto

package pl.leancode.patrol.contracts;

@kotlin.jvm.JvmName("-initializeopenAppRequest")
public inline fun openAppRequest(block: pl.leancode.patrol.contracts.OpenAppRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.OpenAppRequest =
  pl.leancode.patrol.contracts.OpenAppRequestKt.Dsl._create(pl.leancode.patrol.contracts.Contracts.OpenAppRequest.newBuilder()).apply { block() }._build()
public object OpenAppRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: pl.leancode.patrol.contracts.Contracts.OpenAppRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: pl.leancode.patrol.contracts.Contracts.OpenAppRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): pl.leancode.patrol.contracts.Contracts.OpenAppRequest = _builder.build()

    /**
     * <code>string appId = 1;</code>
     */
    public var appId: kotlin.String
      @JvmName("getAppId")
      get() = _builder.getAppId()
      @JvmName("setAppId")
      set(value) {
        _builder.setAppId(value)
      }
    /**
     * <code>string appId = 1;</code>
     */
    public fun clearAppId() {
      _builder.clearAppId()
    }
  }
}
public inline fun pl.leancode.patrol.contracts.Contracts.OpenAppRequest.copy(block: pl.leancode.patrol.contracts.OpenAppRequestKt.Dsl.() -> kotlin.Unit): pl.leancode.patrol.contracts.Contracts.OpenAppRequest =
  pl.leancode.patrol.contracts.OpenAppRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()

