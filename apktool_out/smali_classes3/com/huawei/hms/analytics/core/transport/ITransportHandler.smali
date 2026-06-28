.class public interface abstract Lcom/huawei/hms/analytics/core/transport/ITransportHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract execute()Lcom/huawei/hms/analytics/core/transport/net/Response;
.end method

.method public abstract execute(Lcom/huawei/hms/analytics/core/transport/CallbackListener;)V
.end method

.method public abstract setContext(Landroid/content/Context;)V
.end method

.method public abstract setHttpHeaders(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setReportData(Ljava/lang/String;)V
.end method

.method public abstract setReportData([B)V
.end method

.method public abstract setRequestMethod(Ljava/lang/String;)V
.end method

.method public abstract setUrls([Ljava/lang/String;)V
.end method
