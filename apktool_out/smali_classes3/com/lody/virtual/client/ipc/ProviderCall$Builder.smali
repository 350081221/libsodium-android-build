.class public final Lcom/lody/virtual/client/ipc/ProviderCall$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/lody/virtual/client/ipc/ProviderCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private arg:Ljava/lang/String;

.field private auth:Ljava/lang/String;

.field private bundle:Landroid/os/Bundle;

.field private context:Landroid/content/Context;

.field private method:Ljava/lang/String;

.field private retryCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Bundle;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 10
    .line 11
    const/4 v0, 0x5

    .line 12
    iput v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->retryCount:I

    .line 13
    .line 14
    iput-object p1, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->context:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->auth:Ljava/lang/String;

    .line 17
    .line 18
    return-void
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
.method public addArg(Ljava/lang/String;Ljava/lang/Object;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;
    .locals 2

    .line 1
    if-eqz p2, :cond_7

    .line 2
    .line 3
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_0

    .line 19
    .line 20
    :cond_0
    instance-of v0, p2, Ljava/lang/Integer;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    instance-of v0, p2, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 41
    .line 42
    check-cast p2, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    instance-of v0, p2, Ljava/io/Serializable;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 53
    .line 54
    check-cast p2, Ljava/io/Serializable;

    .line 55
    .line 56
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    instance-of v0, p2, Landroid/os/Bundle;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 65
    .line 66
    check-cast p2, Landroid/os/Bundle;

    .line 67
    .line 68
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    instance-of v0, p2, Landroid/os/Parcelable;

    .line 73
    .line 74
    if-eqz v0, :cond_5

    .line 75
    .line 76
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 77
    .line 78
    check-cast p2, Landroid/os/Parcelable;

    .line 79
    .line 80
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_5
    instance-of v0, p2, [I

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    .line 89
    .line 90
    check-cast p2, [I

    .line 91
    .line 92
    invoke-virtual {v0, p1, p2}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 97
    .line 98
    new-instance v0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v1, "Unknown type "

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string p2, " in Bundle."

    .line 116
    .line 117
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1

    .line 128
    :cond_7
    :goto_0
    return-object p0
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

.method public arg(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->arg:Ljava/lang/String;

    return-object p0
.end method

.method public call()Landroid/os/Bundle;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    iget-object v0, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->auth:Ljava/lang/String;

    iget-object v1, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->method:Ljava/lang/String;

    iget-object v3, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->arg:Ljava/lang/String;

    iget-object v4, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->bundle:Landroid/os/Bundle;

    iget v5, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->retryCount:I

    invoke-static/range {v0 .. v5}, Lcom/lody/virtual/client/ipc/ProviderCall;->call(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;I)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public callSafely()Landroid/os/Bundle;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->call()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    return-object v0
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

.method public methodName(Ljava/lang/String;)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;
    .locals 0

    iput-object p1, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->method:Ljava/lang/String;

    return-object p0
.end method

.method public retry(I)Lcom/lody/virtual/client/ipc/ProviderCall$Builder;
    .locals 0

    iput p1, p0, Lcom/lody/virtual/client/ipc/ProviderCall$Builder;->retryCount:I

    return-object p0
.end method
