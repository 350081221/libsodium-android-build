.class Lcom/umeng/commonsdk/statistics/internal/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/umeng/commonsdk/statistics/internal/UMImprintPreProcessCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/umeng/commonsdk/statistics/internal/c;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/umeng/commonsdk/statistics/internal/c;


# direct methods
.method constructor <init>(Lcom/umeng/commonsdk/statistics/internal/c;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c$2;->a:Lcom/umeng/commonsdk/statistics/internal/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreProcessImprintKey(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "--->>> onImprintValueChanged: key="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "; value= "

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const-string p2, "MobclickRT"

    .line 27
    .line 28
    invoke-static {p2, p1}, Lcom/umeng/commonsdk/debug/UMRTLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/umeng/commonsdk/config/FieldManager;->a()Lcom/umeng/commonsdk/config/FieldManager;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p2, p0, Lcom/umeng/commonsdk/statistics/internal/c$2;->a:Lcom/umeng/commonsdk/statistics/internal/c;

    .line 36
    .line 37
    invoke-static {p2}, Lcom/umeng/commonsdk/statistics/internal/c;->a(Lcom/umeng/commonsdk/statistics/internal/c;)Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    invoke-virtual {p1, p2}, Lcom/umeng/commonsdk/config/FieldManager;->a(Landroid/content/Context;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c$2;->a:Lcom/umeng/commonsdk/statistics/internal/c;

    .line 45
    .line 46
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/internal/c;->a(Lcom/umeng/commonsdk/statistics/internal/c;)Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iget-object p2, p0, Lcom/umeng/commonsdk/statistics/internal/c$2;->a:Lcom/umeng/commonsdk/statistics/internal/c;

    .line 51
    .line 52
    invoke-static {p2}, Lcom/umeng/commonsdk/statistics/internal/c;->a(Lcom/umeng/commonsdk/statistics/internal/c;)Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    invoke-static {p2}, Lcom/umeng/commonsdk/internal/b;->a(Landroid/content/Context;)Lcom/umeng/commonsdk/internal/b;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    invoke-virtual {p2}, Lcom/umeng/commonsdk/internal/b;->a()Lcom/umeng/commonsdk/internal/c;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    const/4 v0, 0x0

    .line 65
    const v1, 0x8010

    .line 66
    .line 67
    .line 68
    invoke-static {p1, v1, p2, v0}, Lcom/umeng/commonsdk/framework/UMWorkDispatch;->sendEvent(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, Lcom/umeng/commonsdk/statistics/internal/c$2;->a:Lcom/umeng/commonsdk/statistics/internal/c;

    .line 72
    .line 73
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/internal/c;->a(Lcom/umeng/commonsdk/statistics/internal/c;)Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->getImprintService(Landroid/content/Context;)Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string p2, "iscfg"

    .line 82
    .line 83
    invoke-virtual {p1, p2}, Lcom/umeng/commonsdk/statistics/idtracking/ImprintHandler;->a(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p1, 0x1

    .line 87
    return p1
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
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
.end method
