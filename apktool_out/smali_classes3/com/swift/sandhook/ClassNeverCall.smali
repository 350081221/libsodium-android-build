.class public Lcom/swift/sandhook/ClassNeverCall;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private neverCall()V
    .locals 0

    return-void
.end method

.method private neverCall2()V
    .locals 2

    .line 1
    const-string v0, "ClassNeverCall"

    .line 2
    .line 3
    const-string v1, "ClassNeverCall2"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private native neverCallNative()V
.end method

.method private native neverCallNative2()V
.end method

.method private static neverCallStatic()V
    .locals 0

    return-void
.end method
