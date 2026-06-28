.class public Ldalvik/system/VMRuntime;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ldalvik/system/VMRuntime;
    .locals 2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "stub"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public native setHiddenApiExemptions([Ljava/lang/String;)V
.end method
