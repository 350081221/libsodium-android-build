.class final Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/material/SnackbarData;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/material/SnackbarHostState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "SnackbarDataImpl"
.end annotation

.annotation runtime Lkotlin/i0;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016J\u0008\u0010\u0004\u001a\u00020\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0007\u001a\u0004\u0008\u000b\u0010\tR\u001a\u0010\r\u001a\u00020\u000c8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;",
        "Landroidx/compose/material/SnackbarData;",
        "Lkotlin/r2;",
        "performAction",
        "dismiss",
        "",
        "message",
        "Ljava/lang/String;",
        "getMessage",
        "()Ljava/lang/String;",
        "actionLabel",
        "getActionLabel",
        "Landroidx/compose/material/SnackbarDuration;",
        "duration",
        "Landroidx/compose/material/SnackbarDuration;",
        "getDuration",
        "()Landroidx/compose/material/SnackbarDuration;",
        "Lkotlinx/coroutines/p;",
        "Landroidx/compose/material/SnackbarResult;",
        "continuation",
        "Lkotlinx/coroutines/p;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/p;)V",
        "material_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final actionLabel:Ljava/lang/String;
    .annotation build Lp4/m;
    .end annotation
.end field

.field private final continuation:Lkotlinx/coroutines/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/p<",
            "Landroidx/compose/material/SnackbarResult;",
            ">;"
        }
    .end annotation

    .annotation build Lp4/l;
    .end annotation
.end field

.field private final duration:Landroidx/compose/material/SnackbarDuration;
    .annotation build Lp4/l;
    .end annotation
.end field

.field private final message:Ljava/lang/String;
    .annotation build Lp4/l;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/material/SnackbarDuration;Lkotlinx/coroutines/p;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lp4/m;
        .end annotation
    .end param
    .param p3    # Landroidx/compose/material/SnackbarDuration;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .param p4    # Lkotlinx/coroutines/p;
        .annotation build Lp4/l;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/material/SnackbarDuration;",
            "Lkotlinx/coroutines/p<",
            "-",
            "Landroidx/compose/material/SnackbarResult;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->message:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->actionLabel:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->duration:Landroidx/compose/material/SnackbarDuration;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->continuation:Lkotlinx/coroutines/p;

    .line 11
    .line 12
    return-void
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
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method


# virtual methods
.method public dismiss()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->continuation:Lkotlinx/coroutines/p;

    invoke-interface {v0}, Lkotlinx/coroutines/p;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->continuation:Lkotlinx/coroutines/p;

    sget-object v1, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    sget-object v1, Landroidx/compose/material/SnackbarResult;->Dismissed:Landroidx/compose/material/SnackbarResult;

    invoke-static {v1}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public getActionLabel()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/m;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->actionLabel:Ljava/lang/String;

    return-object v0
.end method

.method public getDuration()Landroidx/compose/material/SnackbarDuration;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->duration:Landroidx/compose/material/SnackbarDuration;

    return-object v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lp4/l;
    .end annotation

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->message:Ljava/lang/String;

    return-object v0
.end method

.method public performAction()V
    .locals 2

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->continuation:Lkotlinx/coroutines/p;

    invoke-interface {v0}, Lkotlinx/coroutines/p;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/material/SnackbarHostState$SnackbarDataImpl;->continuation:Lkotlinx/coroutines/p;

    sget-object v1, Lkotlin/d1;->Companion:Lkotlin/d1$a;

    sget-object v1, Landroidx/compose/material/SnackbarResult;->ActionPerformed:Landroidx/compose/material/SnackbarResult;

    invoke-static {v1}, Lkotlin/d1;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/coroutines/d;->resumeWith(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method
