.class Lcom/umeng/umcrash/UMCrash$PaClientImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/efs/sdk/pa/IPaClient;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/umcrash/UMCrash;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PaClientImpl"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/umeng/umcrash/UMCrash$1;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/umcrash/UMCrash$PaClientImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public onGetCallbackInfo()Ljava/lang/String;
    .locals 3

    .line 1
    invoke-static {}, Lcom/umeng/umcrash/UMCrash;->access$600()Lcom/umeng/umcrash/UMCrashCallback;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {}, Lcom/umeng/umcrash/UMCrash;->access$600()Lcom/umeng/umcrash/UMCrashCallback;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lcom/umeng/umcrash/UMCrashCallback;->onCallback()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    array-length v1, v1

    .line 28
    const/16 v2, 0x5000

    .line 29
    .line 30
    if-le v1, v2, :cond_1

    .line 31
    .line 32
    invoke-static {v0, v2}, Lcom/umeng/umcrash/UMCrashUtils;->splitByByte(Ljava/lang/String;I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :cond_1
    return-object v0

    .line 37
    :cond_2
    return-object v1
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
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
.end method
