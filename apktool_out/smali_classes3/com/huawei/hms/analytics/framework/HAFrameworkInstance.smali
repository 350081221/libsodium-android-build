.class public interface abstract Lcom/huawei/hms/analytics/framework/HAFrameworkInstance;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hms/analytics/framework/HAFrameworkInstance$Builder;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "HAFrameworkCase"


# virtual methods
.method public abstract clearCacheData(Ljava/lang/String;)V
.end method

.method public abstract onBackground(J)V
.end method

.method public abstract onEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            "J)V"
        }
    .end annotation
.end method

.method public abstract onEvent(Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onEventRecord(Ljava/lang/String;Ljava/util/List;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;J)V"
        }
    .end annotation
.end method

.method public abstract onForeground(J)V
.end method

.method public abstract onReport(Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
.end method

.method public abstract onReport(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
.end method

.method public abstract onReport(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onStreamEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            ")V"
        }
    .end annotation
.end method

.method public abstract onStreamEvent(Ljava/lang/String;Ljava/util/List;Lcom/huawei/hms/analytics/framework/config/ICallback;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/json/JSONObject;",
            ">;",
            "Lcom/huawei/hms/analytics/framework/config/ICallback;",
            "J)V"
        }
    .end annotation
.end method

.method public abstract setMinSessionDuration(J)V
.end method

.method public abstract setNeedRefreshSession(Z)V
.end method

.method public abstract setSessionTimeoutDuration(J)V
.end method
