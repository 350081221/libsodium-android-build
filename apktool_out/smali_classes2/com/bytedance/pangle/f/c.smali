.class public final Lcom/bytedance/pangle/f/c;
.super Lcom/bytedance/pangle/ZeusPluginStateListener;
.source "SourceFile"


# instance fields
.field final a:I

.field private final b:Lcom/bytedance/pangle/d;


# direct methods
.method public constructor <init>(Lcom/bytedance/pangle/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bytedance/pangle/ZeusPluginStateListener;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bytedance/pangle/f/c;->b:Lcom/bytedance/pangle/d;

    .line 5
    .line 6
    iput p2, p0, Lcom/bytedance/pangle/f/c;->a:I

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
    .line 24
    .line 25
    .line 26
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


# virtual methods
.method public final varargs onStateChangeOnCurThread(Ljava/lang/String;I[Ljava/lang/Object;)V
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    if-eq p2, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x7

    .line 5
    if-eq p2, v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    if-ne p2, v0, :cond_2

    .line 9
    .line 10
    :cond_0
    :try_start_0
    const-string v0, ""

    .line 11
    .line 12
    if-eqz p3, :cond_1

    .line 13
    .line 14
    array-length v1, p3

    .line 15
    if-lez v1, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    aget-object p3, p3, v0

    .line 19
    .line 20
    invoke-static {p3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :cond_1
    iget-object p3, p0, Lcom/bytedance/pangle/f/c;->b:Lcom/bytedance/pangle/d;

    .line 25
    .line 26
    invoke-interface {p3, p1, p2, v0}, Lcom/bytedance/pangle/d;->a(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    :cond_2
    return-void
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
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
.end method
