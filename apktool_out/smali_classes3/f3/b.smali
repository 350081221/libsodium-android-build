.class public Lf3/b;
.super Ljava/lang/Exception;
.source "SourceFile"


# static fields
.field private static final MESSAGE:Ljava/lang/String; = "Bitmap \u7f13\u5b58\u52a0\u8f7d\u5931\u8d25"


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "Bitmap \u7f13\u5b58\u52a0\u8f7d\u5931\u8d25"

    .line 1
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "Bitmap \u7f13\u5b58\u52a0\u8f7d\u5931\u8d25"

    .line 2
    invoke-direct {p0, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;ZZ)V
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    const-string v0, "Bitmap \u7f13\u5b58\u52a0\u8f7d\u5931\u8d25"

    .line 3
    invoke-direct {p0, v0, p1, p2, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZZ)V

    return-void
.end method
