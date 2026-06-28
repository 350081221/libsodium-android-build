.class public Lf3/k;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# static fields
.field private static final MESSAGE:Ljava/lang/String; = "ImageHolder\u7684source\u53ea\u80fd\u5728INIT\u9636\u6bb5\u4fee\u6539"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ImageHolder\u7684source\u53ea\u80fd\u5728INIT\u9636\u6bb5\u4fee\u6539"

    .line 1
    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "ImageHolder\u7684source\u53ea\u80fd\u5728INIT\u9636\u6bb5\u4fee\u6539"

    .line 2
    invoke-direct {p0, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;ZZ)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    const-string v0, "ImageHolder\u7684source\u53ea\u80fd\u5728INIT\u9636\u6bb5\u4fee\u6539"

    .line 3
    invoke-direct {p0, v0, p1, p2, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method
