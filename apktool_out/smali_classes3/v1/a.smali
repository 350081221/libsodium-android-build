.class public interface abstract Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getUserProfiles(Z)Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract onEvent(Ljava/lang/String;Landroid/os/Bundle;)V
.end method

.method public abstract onReport()V
.end method

.method public abstract setAnalyticsEnabled(Z)V
.end method

.method public abstract setEnableAndroidID(Z)V
.end method

.method public abstract syncOaid(Lcom/huawei/agconnect/apms/y1;)V
.end method
