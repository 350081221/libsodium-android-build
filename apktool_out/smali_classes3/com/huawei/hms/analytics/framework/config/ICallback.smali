.class public interface abstract Lcom/huawei/hms/analytics/framework/config/ICallback;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DEF_FLAG:I = 0x0

.field public static final NO_REQUEST_FLAG:I = -0x1

.field public static final REGION_CHANGE_REQUEST_FLAG:I = -0x2


# virtual methods
.method public abstract isAAIDChanged(Ljava/lang/String;Z)Z
.end method

.method public abstract isNeedStorage()Z
.end method

.method public abstract isStopEvent()Z
.end method

.method public abstract onResult(IJILjava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJI",
            "Ljava/util/List<",
            "Lcom/huawei/hms/analytics/core/storage/Event;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setStopEventReport(Z)V
.end method
