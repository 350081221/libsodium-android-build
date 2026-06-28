.class public Lcom/lody/virtual/client/hook/secondary/HackAppUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static enableQQLogOutput(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    const-string v0, "com.tencent.mobileqq"

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-string p0, "com.tencent.qphone.base.util.QLog"

    .line 10
    .line 11
    invoke-static {p0, p1}, Lcom/lody/virtual/helper/utils/Reflect;->on(Ljava/lang/String;Ljava/lang/ClassLoader;)Lcom/lody/virtual/helper/utils/Reflect;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string p1, "UIN_REPORTLOG_LEVEL"

    .line 16
    .line 17
    const/16 v0, 0x64

    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/lody/virtual/helper/utils/Reflect;->set(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/helper/utils/Reflect;
    :try_end_0
    .catch Lcom/lody/virtual/helper/utils/ReflectException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    :catch_0
    :cond_0
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
.end method
