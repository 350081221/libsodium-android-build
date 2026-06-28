.class public Lcom/umeng/commonsdk/statistics/idtracking/i;
.super Lcom/umeng/commonsdk/statistics/idtracking/a;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/String; = "serial"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "serial"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/umeng/commonsdk/statistics/idtracking/a;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
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


# virtual methods
.method public f()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    invoke-static {}, Lcom/umeng/commonsdk/statistics/common/DeviceConfig;->getSerial()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
